package com.bernardozapelini.secretbase.board;

import com.bernardozapelini.secretbase.board.dto.BoardPostDTO;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/Board")
public class BoardController {

    private BoardService service;

    @GetMapping("/{id}")
    public ResponseEntity<?> getBoard(@PathVariable Integer id){
        return ResponseEntity.ok(service.get(id));
    }

    @GetMapping()
    public ResponseEntity<?> getBoard(Pageable pageable){
        return ResponseEntity.ok(service.getAll(pageable));
    }

    @PostMapping()
    public ResponseEntity<Board> create(@RequestBody BoardPostDTO dto){
        return ResponseEntity.ok(service.create(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateBoard(@PathVariable Integer id, @RequestBody BoardPostDTO dto){
        return ResponseEntity.ok(service.update(id, dto));
    }

    @DeleteMapping("/{id}")
    public String deleteBoard(@PathVariable Integer id){
        service.delete(id);
        return "id " + id + " Deleted";
    }
}
