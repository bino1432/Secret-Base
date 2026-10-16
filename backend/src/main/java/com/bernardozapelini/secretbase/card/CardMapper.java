package com.bernardozapelini.secretbase.card;

import com.bernardozapelini.secretbase.card.dto.CardPostDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CardMapper {
    Card toEntity(CardPostDTO dto);
    CardPostDTO tpDto(Card card);
}
