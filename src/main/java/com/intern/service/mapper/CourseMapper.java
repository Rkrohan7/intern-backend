package com.intern.service.mapper;

import com.intern.domain.Course;
import com.intern.domain.Student;
import com.intern.service.dto.CourseDTO;
import com.intern.service.dto.StudentDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Course} and its DTO {@link CourseDTO}.
 */
@Mapper(componentModel = "spring")
public interface CourseMapper extends EntityMapper<CourseDTO, Course> {
    @Mapping(target = "student", source = "student", qualifiedByName = "studentId")
    CourseDTO toDto(Course s);

    @Named("studentId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    StudentDTO toDtoStudentId(Student student);
}
