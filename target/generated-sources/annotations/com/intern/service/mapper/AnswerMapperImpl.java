package com.intern.service.mapper;

import com.intern.domain.Answer;
import com.intern.domain.Question;
import com.intern.service.dto.AnswerDTO;
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
public class AnswerMapperImpl implements AnswerMapper {

    @Override
    public Answer toEntity(AnswerDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Answer answer = new Answer();

        answer.setId( dto.getId() );
        answer.setAnswer( dto.getAnswer() );
        answer.setCorrectAns( dto.getCorrectAns() );
        answer.setQuestionId( dto.getQuestionId() );
        answer.question( questionDTOToQuestion( dto.getQuestion() ) );

        return answer;
    }

    @Override
    public List<Answer> toEntity(List<AnswerDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Answer> list = new ArrayList<Answer>( dtoList.size() );
        for ( AnswerDTO answerDTO : dtoList ) {
            list.add( toEntity( answerDTO ) );
        }

        return list;
    }

    @Override
    public List<AnswerDTO> toDto(List<Answer> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<AnswerDTO> list = new ArrayList<AnswerDTO>( entityList.size() );
        for ( Answer answer : entityList ) {
            list.add( toDto( answer ) );
        }

        return list;
    }

    @Override
    public void partialUpdate(Answer entity, AnswerDTO dto) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getId() != null ) {
            entity.setId( dto.getId() );
        }
        if ( dto.getAnswer() != null ) {
            entity.setAnswer( dto.getAnswer() );
        }
        if ( dto.getCorrectAns() != null ) {
            entity.setCorrectAns( dto.getCorrectAns() );
        }
        if ( dto.getQuestionId() != null ) {
            entity.setQuestionId( dto.getQuestionId() );
        }
        if ( dto.getQuestion() != null ) {
            if ( entity.getQuestion() == null ) {
                entity.question( new Question() );
            }
            questionDTOToQuestion1( dto.getQuestion(), entity.getQuestion() );
        }
    }

    @Override
    public AnswerDTO toDto(Answer s) {
        if ( s == null ) {
            return null;
        }

        AnswerDTO answerDTO = new AnswerDTO();

        answerDTO.setQuestion( toDtoQuestionId( s.getQuestion() ) );
        answerDTO.setId( s.getId() );
        answerDTO.setAnswer( s.getAnswer() );
        answerDTO.setCorrectAns( s.getCorrectAns() );
        answerDTO.setQuestionId( s.getQuestionId() );

        return answerDTO;
    }

    @Override
    public QuestionDTO toDtoQuestionId(Question question) {
        if ( question == null ) {
            return null;
        }

        QuestionDTO questionDTO = new QuestionDTO();

        questionDTO.setId( question.getId() );

        return questionDTO;
    }

    protected Question questionDTOToQuestion(QuestionDTO questionDTO) {
        if ( questionDTO == null ) {
            return null;
        }

        Question question = new Question();

        question.setId( questionDTO.getId() );
        question.setQuestion( questionDTO.getQuestion() );
        question.setAnsId( questionDTO.getAnsId() );

        return question;
    }

    protected void questionDTOToQuestion1(QuestionDTO questionDTO, Question mappingTarget) {
        if ( questionDTO == null ) {
            return;
        }

        if ( questionDTO.getId() != null ) {
            mappingTarget.setId( questionDTO.getId() );
        }
        if ( questionDTO.getQuestion() != null ) {
            mappingTarget.setQuestion( questionDTO.getQuestion() );
        }
        if ( questionDTO.getAnsId() != null ) {
            mappingTarget.setAnsId( questionDTO.getAnsId() );
        }
    }
}
