package com.bernardozapelini.secretbase.card;

import com.bernardozapelini.secretbase.column.BoardColumn;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String description;
    private Boolean checkbox;
    @ManyToOne
    private BoardColumn boardColumn;
}
