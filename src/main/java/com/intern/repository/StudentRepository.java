package com.intern.repository;

import com.intern.domain.Student;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the Student entity.
 */
@SuppressWarnings("unused")
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {}
