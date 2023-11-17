package com.intern.service.mapper;

import com.intern.domain.Syllabus;
import com.intern.service.dto.SyllabusDTO;
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
public class SyllabusMapperImpl implements SyllabusMapper {

    @Override
    public Syllabus toEntity(SyllabusDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Syllabus syllabus = new Syllabus();

        syllabus.setId( dto.getId() );
        syllabus.setSubjectName( dto.getSubjectName() );

        return syllabus;
    }

    @Override
    public SyllabusDTO toDto(Syllabus entity) {
        if ( entity == null ) {
            return null;
        }

        SyllabusDTO syllabusDTO = new SyllabusDTO();

        syllabusDTO.setId( entity.getId() );
        syllabusDTO.setSubjectName( entity.getSubjectName() );

        return syllabusDTO;
    }

    @Override
    public List<Syllabus> toEntity(List<SyllabusDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Syllabus> list = new ArrayList<Syllabus>( dtoList.size() );
        for ( SyllabusDTO syllabusDTO : dtoList ) {
            list.add( toEntity( syllabusDTO ) );
        }

        return list;
    }

    @Override
    public List<SyllabusDTO> toDto(List<Syllabus> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SyllabusDTO> list = new ArrayList<SyllabusDTO>( entityList.size() );
        for ( Syllabus syllabus : entityList ) {
            list.add( toDto( syllabus ) );
        }

        return list;
    }

    @Override
    public void partialUpdate(Syllabus entity, SyllabusDTO dto) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getId() != null ) {
            entity.setId( dto.getId() );
        }
        if ( dto.getSubjectName() != null ) {
            entity.setSubjectName( dto.getSubjectName() );
        }
    }
}
