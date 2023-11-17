package com.intern.service.mapper;

import com.intern.domain.Course;
import com.intern.domain.Student;
import com.intern.service.dto.CourseDTO;
import com.intern.service.dto.StudentDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-17T13:13:57+0530",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 11.0.21 (Azul Systems, Inc.)"
)
@Component
public class CourseMapperImpl implements CourseMapper {

    @Override
    public Course toEntity(CourseDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Course course = new Course();

        course.setId( dto.getId() );
        course.setName( dto.getName() );
        course.student( studentDTOToStudent( dto.getStudent() ) );

        return course;
    }

    @Override
    public List<Course> toEntity(List<CourseDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Course> list = new ArrayList<Course>( dtoList.size() );
        for ( CourseDTO courseDTO : dtoList ) {
            list.add( toEntity( courseDTO ) );
        }

        return list;
    }

    @Override
    public List<CourseDTO> toDto(List<Course> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<CourseDTO> list = new ArrayList<CourseDTO>( entityList.size() );
        for ( Course course : entityList ) {
            list.add( toDto( course ) );
        }

        return list;
    }

    @Override
    public void partialUpdate(Course entity, CourseDTO dto) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getId() != null ) {
            entity.setId( dto.getId() );
        }
        if ( dto.getName() != null ) {
            entity.setName( dto.getName() );
        }
        if ( dto.getStudent() != null ) {
            if ( entity.getStudent() == null ) {
                entity.student( new Student() );
            }
            studentDTOToStudent1( dto.getStudent(), entity.getStudent() );
        }
    }

    @Override
    public CourseDTO toDto(Course s) {
        if ( s == null ) {
            return null;
        }

        CourseDTO courseDTO = new CourseDTO();

        courseDTO.setStudent( toDtoStudentId( s.getStudent() ) );
        courseDTO.setId( s.getId() );
        courseDTO.setName( s.getName() );

        return courseDTO;
    }

    @Override
    public StudentDTO toDtoStudentId(Student student) {
        if ( student == null ) {
            return null;
        }

        StudentDTO studentDTO = new StudentDTO();

        studentDTO.setId( student.getId() );

        return studentDTO;
    }

    protected Student studentDTOToStudent(StudentDTO studentDTO) {
        if ( studentDTO == null ) {
            return null;
        }

        Student student = new Student();

        student.setId( studentDTO.getId() );
        student.setFname( studentDTO.getFname() );
        student.setLname( studentDTO.getLname() );
        student.setContact( studentDTO.getContact() );
        student.setCourseId( studentDTO.getCourseId() );

        return student;
    }

    protected void studentDTOToStudent1(StudentDTO studentDTO, Student mappingTarget) {
        if ( studentDTO == null ) {
            return;
        }

        if ( studentDTO.getId() != null ) {
            mappingTarget.setId( studentDTO.getId() );
        }
        if ( studentDTO.getFname() != null ) {
            mappingTarget.setFname( studentDTO.getFname() );
        }
        if ( studentDTO.getLname() != null ) {
            mappingTarget.setLname( studentDTO.getLname() );
        }
        if ( studentDTO.getContact() != null ) {
            mappingTarget.setContact( studentDTO.getContact() );
        }
        if ( studentDTO.getCourseId() != null ) {
            mappingTarget.setCourseId( studentDTO.getCourseId() );
        }
    }
}
