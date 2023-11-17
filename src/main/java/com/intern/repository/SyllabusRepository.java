package com.intern.repository;

import com.intern.domain.Syllabus;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the Syllabus entity.
 */
@SuppressWarnings("unused")
@Repository
public interface SyllabusRepository extends JpaRepository<Syllabus, Long> {}
