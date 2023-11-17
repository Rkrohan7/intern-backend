package com.intern.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Student.class)
public abstract class Student_ {

	public static volatile SingularAttribute<Student, String> fname;
	public static volatile SingularAttribute<Student, String> lname;
	public static volatile SingularAttribute<Student, String> contact;
	public static volatile SingularAttribute<Student, Long> id;
	public static volatile SingularAttribute<Student, Long> courseId;

	public static final String FNAME = "fname";
	public static final String LNAME = "lname";
	public static final String CONTACT = "contact";
	public static final String ID = "id";
	public static final String COURSE_ID = "courseId";

}

