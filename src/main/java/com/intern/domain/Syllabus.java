package com.intern.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * A Syllabus.
 */
@Entity
@Table(name = "syllabus")
@SuppressWarnings("common-java:DuplicatedBlocks")
public class Syllabus implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "subject_name")
    private String subjectName;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public Syllabus id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubjectName() {
        return this.subjectName;
    }

    public Syllabus subjectName(String subjectName) {
        this.setSubjectName(subjectName);
        return this;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Syllabus)) {
            return false;
        }
        return id != null && id.equals(((Syllabus) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Syllabus{" +
            "id=" + getId() +
            ", subjectName='" + getSubjectName() + "'" +
            "}";
    }
}
