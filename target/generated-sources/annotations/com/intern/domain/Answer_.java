package com.intern.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Answer.class)
public abstract class Answer_ {

	public static volatile SingularAttribute<Answer, Long> questionId;
	public static volatile SingularAttribute<Answer, String> answer;
	public static volatile SingularAttribute<Answer, Question> question;
	public static volatile SingularAttribute<Answer, Long> id;
	public static volatile SingularAttribute<Answer, Boolean> correctAns;

	public static final String QUESTION_ID = "questionId";
	public static final String ANSWER = "answer";
	public static final String QUESTION = "question";
	public static final String ID = "id";
	public static final String CORRECT_ANS = "correctAns";

}

