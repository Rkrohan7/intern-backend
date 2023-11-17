package com.intern.service.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SyllabusMapperTest {

    private SyllabusMapper syllabusMapper;

    @BeforeEach
    public void setUp() {
        syllabusMapper = new SyllabusMapperImpl();
    }
}
