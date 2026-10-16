package com.bernardozapelini.secretbase.column;

import com.bernardozapelini.secretbase.column.dto.BoardColumnPostDTO;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/BoardColumn")
public class BoardColumnController {

    private BoardColumnService service;

    @GetMapping("/{id}")
    public ResponseEntity<?> getBoardColumn(@PathVariable Integer id){
        return ResponseEntity.ok(service.get(id));
    }

    @GetMapping()
    public ResponseEntity<?> getBoardColumn(Pageable pageable){
        return ResponseEntity.ok(service.getAll(pageable));
    }

    @PostMapping()
    public ResponseEntity<BoardColumn> create(@RequestBody BoardColumnPostDTO dto){
        return ResponseEntity.ok(service.create(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateBoardColumn(@PathVariable Integer id, @RequestBody BoardColumnPostDTO dto){
        return ResponseEntity.ok(service.update(id, dto));
    }

    @DeleteMapping("/{id}")
    public String deleteBoardColumn(@PathVariable Integer id){
        service.delete(id);
        return "id " + id + " Deleted";
    }
}
