package com.intern.service.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link com.intern.domain.Student} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class StudentDTO implements Serializable {

    private Long id;

    private String fname;

    private String lname;

    private String contact;

    private Long courseId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StudentDTO)) {
            return false;
        }

        StudentDTO studentDTO = (StudentDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, studentDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "StudentDTO{" +
            "id=" + getId() +
            ", fname='" + getFname() + "'" +
            ", lname='" + getLname() + "'" +
            ", contact='" + getContact() + "'" +
            ", courseId=" + getCourseId() +
            "}";
    }
}
