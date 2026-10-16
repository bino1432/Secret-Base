package com.bernardozapelini.secretbase.column;

import com.bernardozapelini.secretbase.column.dto.BoardColumnPostDTO;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class BoardColumnService {

    private BoardColumnRepository repository;
    private BoardColumnMapper mapper;

    public BoardColumn get(Integer id){
        return repository.getById(id);
    }

    public Page<BoardColumn> getAll(Pageable pageable){
        return repository.findAll(pageable);
    }

    public BoardColumn create(BoardColumnPostDTO dto){
        BoardColumn boardColumn = mapper.toEntity(dto);
        return repository.save(boardColumn);
    }

    public BoardColumn update(Integer id, BoardColumnPostDTO dto){
        Optional<BoardColumn> optionalBoardColumn = repository.findById(id);
        BoardColumn boardColumn = optionalBoardColumn.get();
        boardColumn.setTitle(dto.title());
        boardColumn.setBoard(dto.board());
        return repository.save(boardColumn);
    }

    public void delete(Integer id){
        repository.deleteById(id);
    }

}
