package com.intern.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Question.class)
public abstract class Question_ {

	public static volatile SingularAttribute<Question, String> question;
	public static volatile SetAttribute<Question, Answer> answers;
	public static volatile SingularAttribute<Question, Long> id;
	public static volatile SingularAttribute<Question, Long> ansId;

	public static final String QUESTION = "question";
	public static final String ANSWERS = "answers";
	public static final String ID = "id";
	public static final String ANS_ID = "ansId";

}

