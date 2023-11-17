package com.intern.service;

import com.intern.service.dto.CourseDTO;
import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing {@link com.intern.domain.Course}.
 */
public interface CourseService {
    /**
     * Save a course.
     *
     * @param courseDTO the entity to save.
     * @return the persisted entity.
     */
    CourseDTO save(CourseDTO courseDTO);

    /**
     * Updates a course.
     *
     * @param courseDTO the entity to update.
     * @return the persisted entity.
     */
    CourseDTO update(CourseDTO courseDTO);

    /**
     * Partially updates a course.
     *
     * @param courseDTO the entity to update partially.
     * @return the persisted entity.
     */
    Optional<CourseDTO> partialUpdate(CourseDTO courseDTO);

    /**
     * Get all the courses.
     *
     * @return the list of entities.
     */
    List<CourseDTO> findAll();

    /**
     * Get the "id" course.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<CourseDTO> findOne(Long id);

    /**
     * Delete the "id" course.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
