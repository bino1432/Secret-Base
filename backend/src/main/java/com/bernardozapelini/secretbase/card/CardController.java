package com.bernardozapelini.secretbase.card;

import com.bernardozapelini.secretbase.card.dto.CardPostDTO;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/Card")
public class CardController {

    private CardService service;

    @GetMapping("/{id}")
    public ResponseEntity<?> getCard(@PathVariable Integer id){
        return ResponseEntity.ok(service.get(id));
    }

    @GetMapping()
    public ResponseEntity<?> getCard(Pageable pageable){
        return ResponseEntity.ok(service.getAll(pageable));
    }

    @PostMapping()
    public ResponseEntity<Card> create(@RequestBody CardPostDTO dto){
        return ResponseEntity.ok(service.create(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateCard(@PathVariable Integer id, @RequestBody CardPostDTO dto){
        return ResponseEntity.ok(service.update(id, dto));
    }

    @DeleteMapping("/{id}")
    public String deleteCard(@PathVariable Integer id){
        service.delete(id);
        return "id " + id + " Deleted";
    }
}
