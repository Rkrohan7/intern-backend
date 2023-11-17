package com.intern.service.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link com.intern.domain.Answer} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class AnswerDTO implements Serializable {

    private Long id;

    private String answer;

    private Boolean correctAns;

    private Long questionId;

    private QuestionDTO question;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Boolean getCorrectAns() {
        return correctAns;
    }

    public void setCorrectAns(Boolean correctAns) {
        this.correctAns = correctAns;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public QuestionDTO getQuestion() {
        return question;
    }

    public void setQuestion(QuestionDTO question) {
        this.question = question;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AnswerDTO)) {
            return false;
        }

        AnswerDTO answerDTO = (AnswerDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, answerDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "AnswerDTO{" +
            "id=" + getId() +
            ", answer='" + getAnswer() + "'" +
            ", correctAns='" + getCorrectAns() + "'" +
            ", questionId=" + getQuestionId() +
            ", question=" + getQuestion() +
            "}";
    }
}
