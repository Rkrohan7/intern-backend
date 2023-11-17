package com.intern.service;

import com.intern.service.dto.StudentDTO;
import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing {@link com.intern.domain.Student}.
 */
public interface StudentService {
    /**
     * Save a student.
     *
     * @param studentDTO the entity to save.
     * @return the persisted entity.
     */
    StudentDTO save(StudentDTO studentDTO);

    /**
     * Updates a student.
     *
     * @param studentDTO the entity to update.
     * @return the persisted entity.
     */
    StudentDTO update(StudentDTO studentDTO);

    /**
     * Partially updates a student.
     *
     * @param studentDTO the entity to update partially.
     * @return the persisted entity.
     */
    Optional<StudentDTO> partialUpdate(StudentDTO studentDTO);

    /**
     * Get all the students.
     *
     * @return the list of entities.
     */
    List<StudentDTO> findAll();

    /**
     * Get the "id" student.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<StudentDTO> findOne(Long id);

    /**
     * Delete the "id" student.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
