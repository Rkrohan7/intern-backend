package com.intern.service.mapper;

import com.intern.domain.Question;
import com.intern.service.dto.QuestionDTO;
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
public class QuestionMapperImpl implements QuestionMapper {

    @Override
    public Question toEntity(QuestionDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Question question = new Question();

        question.setId( dto.getId() );
        question.setQuestion( dto.getQuestion() );
        question.setAnsId( dto.getAnsId() );

        return question;
    }

    @Override
    public QuestionDTO toDto(Question entity) {
        if ( entity == null ) {
            return null;
        }

        QuestionDTO questionDTO = new QuestionDTO();

        questionDTO.setId( entity.getId() );
        questionDTO.setQuestion( entity.getQuestion() );
        questionDTO.setAnsId( entity.getAnsId() );

        return questionDTO;
    }

    @Override
    public List<Question> toEntity(List<QuestionDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Question> list = new ArrayList<Question>( dtoList.size() );
        for ( QuestionDTO questionDTO : dtoList ) {
            list.add( toEntity( questionDTO ) );
        }

        return list;
    }

    @Override
    public List<QuestionDTO> toDto(List<Question> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<QuestionDTO> list = new ArrayList<QuestionDTO>( entityList.size() );
        for ( Question question : entityList ) {
            list.add( toDto( question ) );
        }

        return list;
    }

    @Override
    public void partialUpdate(Question entity, QuestionDTO dto) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getId() != null ) {
            entity.setId( dto.getId() );
        }
        if ( dto.getQuestion() != null ) {
            entity.setQuestion( dto.getQuestion() );
        }
        if ( dto.getAnsId() != null ) {
            entity.setAnsId( dto.getAnsId() );
        }
    }
}
