package com.intern.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Course.class)
public abstract class Course_ {

	public static volatile SingularAttribute<Course, Student> student;
	public static volatile SingularAttribute<Course, String> name;
	public static volatile SingularAttribute<Course, Long> id;

	public static final String STUDENT = "student";
	public static final String NAME = "name";
	public static final String ID = "id";

}

