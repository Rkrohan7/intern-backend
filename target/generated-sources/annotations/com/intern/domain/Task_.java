package com.intern.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Task.class)
public abstract class Task_ {

	public static volatile SingularAttribute<Task, String> taskName;
	public static volatile SingularAttribute<Task, Long> id;

	public static final String TASK_NAME = "taskName";
	public static final String ID = "id";

}

