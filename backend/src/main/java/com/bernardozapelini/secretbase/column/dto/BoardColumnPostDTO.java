package com.bernardozapelini.secretbase.column.dto;

import com.bernardozapelini.secretbase.board.Board;

public record BoardColumnPostDTO(
        String title,
        Board board
) {}
