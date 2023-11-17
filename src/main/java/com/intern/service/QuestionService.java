package com.intern.service;

import com.intern.service.dto.QuestionDTO;
import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing {@link com.intern.domain.Question}.
 */
public interface QuestionService {
    /**
     * Save a question.
     *
     * @param questionDTO the entity to save.
     * @return the persisted entity.
     */
    QuestionDTO save(QuestionDTO questionDTO);

    /**
     * Updates a question.
     *
     * @param questionDTO the entity to update.
     * @return the persisted entity.
     */
    QuestionDTO update(QuestionDTO questionDTO);

    /**
     * Partially updates a question.
     *
     * @param questionDTO the entity to update partially.
     * @return the persisted entity.
     */
    Optional<QuestionDTO> partialUpdate(QuestionDTO questionDTO);

    /**
     * Get all the questions.
     *
     * @return the list of entities.
     */
    List<QuestionDTO> findAll();

    /**
     * Get the "id" question.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<QuestionDTO> findOne(Long id);

    /**
     * Delete the "id" question.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
