package com.intern.service.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AnswerMapperTest {

    private AnswerMapper answerMapper;

    @BeforeEach
    public void setUp() {
        answerMapper = new AnswerMapperImpl();
    }
}
