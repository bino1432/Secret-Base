package com.bernardozapelini.secretbase.board.dto;

import com.bernardozapelini.secretbase.user.User;

import java.time.LocalDateTime;

public record BoardPostDTO(
        String title,
        LocalDateTime createdAt,
        User user
) {
}
