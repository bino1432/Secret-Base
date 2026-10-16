package com.bernardozapelini.secretbase.column;

import com.bernardozapelini.secretbase.column.dto.BoardColumnPostDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BoardColumnMapper {
    BoardColumn toEntity(BoardColumnPostDTO dto);
    BoardColumnPostDTO toDto(BoardColumn boardColumn);
}
