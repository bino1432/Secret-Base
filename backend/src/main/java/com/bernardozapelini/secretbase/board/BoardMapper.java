package com.bernardozapelini.secretbase.board;

import com.bernardozapelini.secretbase.board.dto.BoardPostDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BoardMapper {
    Board toEntity(BoardPostDTO dto);
    BoardPostDTO toDto(Board board);
}
