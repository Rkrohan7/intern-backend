package com.intern.service.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link com.intern.domain.Syllabus} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class SyllabusDTO implements Serializable {

    private Long id;

    private String subjectName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SyllabusDTO)) {
            return false;
        }

        SyllabusDTO syllabusDTO = (SyllabusDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, syllabusDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "SyllabusDTO{" +
            "id=" + getId() +
            ", subjectName='" + getSubjectName() + "'" +
            "}";
    }
}
