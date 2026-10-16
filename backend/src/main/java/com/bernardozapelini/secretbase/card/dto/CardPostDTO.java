package com.bernardozapelini.secretbase.card.dto;

import com.bernardozapelini.secretbase.column.BoardColumn;
import jakarta.persistence.ManyToOne;

public record CardPostDTO(
        String title,
        String description,
        Boolean checkbox,
        BoardColumn boardColumn
) {}
