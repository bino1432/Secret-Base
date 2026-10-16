package com.bernardozapelini.secretbase.card;

import com.bernardozapelini.secretbase.card.dto.CardPostDTO;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class CardService {

    private CardRepository repository;
    private CardMapper mapper;

    public Card get(Integer id){
        return repository.getById(id);
    }

    public Page<Card> getAll(Pageable pageable){
        return repository.findAll(pageable);
    }

    public Card create(CardPostDTO dto){
        Card card = mapper.toEntity(dto);
        return repository.save(card);
    }

    public Card update(Integer id, CardPostDTO dto){
        Optional<Card> optionalCard = repository.findById(id);
        Card card = optionalCard.get();
        card.setTitle(dto.title());
        card.setDescription(dto.description());
        card.setCheckbox(dto.checkbox());
        card.setBoardColumn(dto.boardColumn());
        return repository.save(card);
    }

    public void delete(Integer id){
        repository.deleteById(id);
    }

}
