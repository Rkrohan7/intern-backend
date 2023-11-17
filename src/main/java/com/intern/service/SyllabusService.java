package com.intern.service;

import com.intern.service.dto.SyllabusDTO;
import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing {@link com.intern.domain.Syllabus}.
 */
public interface SyllabusService {
    /**
     * Save a syllabus.
     *
     * @param syllabusDTO the entity to save.
     * @return the persisted entity.
     */
    SyllabusDTO save(SyllabusDTO syllabusDTO);

    /**
     * Updates a syllabus.
     *
     * @param syllabusDTO the entity to update.
     * @return the persisted entity.
     */
    SyllabusDTO update(SyllabusDTO syllabusDTO);

    /**
     * Partially updates a syllabus.
     *
     * @param syllabusDTO the entity to update partially.
     * @return the persisted entity.
     */
    Optional<SyllabusDTO> partialUpdate(SyllabusDTO syllabusDTO);

    /**
     * Get all the syllabi.
     *
     * @return the list of entities.
     */
    List<SyllabusDTO> findAll();

    /**
     * Get the "id" syllabus.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<SyllabusDTO> findOne(Long id);

    /**
     * Delete the "id" syllabus.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
