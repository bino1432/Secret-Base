package com.bernardozapelini.secretbase.board;

import com.bernardozapelini.secretbase.board.dto.BoardPostDTO;
import com.bernardozapelini.secretbase.column.BoardColumn;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class BoardService {

    private BoardRepository repository;
    private BoardMapper mapper;

    public Board get(Integer id){
        return repository.getById(id);
    }

    public Page<Board> getAll(Pageable pageable){
        return repository.findAll(pageable);
    }

    public Board create(BoardPostDTO dto){
        Board board = mapper.toEntity(dto);
        return repository.save(board);
    }

    public Board update(Integer id, BoardPostDTO dto){
        Optional<Board> optionalBoard = repository.findById(id);
        Board board = optionalBoard.get();
        board.setTitle(dto.title());
        board.setCreatedAt(dto.createdAt());
        board.setUser(dto.user());
        return repository.save(board);
    }

    public void delete(Integer id){
        repository.deleteById(id);
    }

}
