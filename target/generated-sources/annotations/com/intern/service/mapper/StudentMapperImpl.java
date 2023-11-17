package com.intern.service.mapper;

import com.intern.domain.Student;
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
public class StudentMapperImpl implements StudentMapper {

    @Override
    public Student toEntity(StudentDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Student student = new Student();

        student.setId( dto.getId() );
        student.setFname( dto.getFname() );
        student.setLname( dto.getLname() );
        student.setContact( dto.getContact() );
        student.setCourseId( dto.getCourseId() );

        return student;
    }

    @Override
    public StudentDTO toDto(Student entity) {
        if ( entity == null ) {
            return null;
        }

        StudentDTO studentDTO = new StudentDTO();

        studentDTO.setId( entity.getId() );
        studentDTO.setFname( entity.getFname() );
        studentDTO.setLname( entity.getLname() );
        studentDTO.setContact( entity.getContact() );
        studentDTO.setCourseId( entity.getCourseId() );

        return studentDTO;
    }

    @Override
    public List<Student> toEntity(List<StudentDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Student> list = new ArrayList<Student>( dtoList.size() );
        for ( StudentDTO studentDTO : dtoList ) {
            list.add( toEntity( studentDTO ) );
        }

        return list;
    }

    @Override
    public List<StudentDTO> toDto(List<Student> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<StudentDTO> list = new ArrayList<StudentDTO>( entityList.size() );
        for ( Student student : entityList ) {
            list.add( toDto( student ) );
        }

        return list;
    }

    @Override
    public void partialUpdate(Student entity, StudentDTO dto) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getId() != null ) {
            entity.setId( dto.getId() );
        }
        if ( dto.getFname() != null ) {
            entity.setFname( dto.getFname() );
        }
        if ( dto.getLname() != null ) {
            entity.setLname( dto.getLname() );
        }
        if ( dto.getContact() != null ) {
            entity.setContact( dto.getContact() );
        }
        if ( dto.getCourseId() != null ) {
            entity.setCourseId( dto.getCourseId() );
        }
    }
}
