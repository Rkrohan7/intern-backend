package com.intern.service.dto;

import static org.assertj.core.api.Assertions.assertThat;

import com.intern.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class SyllabusDTOTest {

    @Test
    void dtoEqualsVerifier() throws Exception {
        TestUtil.equalsVerifier(SyllabusDTO.class);
        SyllabusDTO syllabusDTO1 = new SyllabusDTO();
        syllabusDTO1.setId(1L);
        SyllabusDTO syllabusDTO2 = new SyllabusDTO();
        assertThat(syllabusDTO1).isNotEqualTo(syllabusDTO2);
        syllabusDTO2.setId(syllabusDTO1.getId());
        assertThat(syllabusDTO1).isEqualTo(syllabusDTO2);
        syllabusDTO2.setId(2L);
        assertThat(syllabusDTO1).isNotEqualTo(syllabusDTO2);
        syllabusDTO1.setId(null);
        assertThat(syllabusDTO1).isNotEqualTo(syllabusDTO2);
    }
}
