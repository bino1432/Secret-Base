package com.bernardozapelini.secretbase.column;

import com.bernardozapelini.secretbase.board.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardColumnRepository extends JpaRepository<BoardColumn, Integer> {
    BoardColumn board(Board board);
}
