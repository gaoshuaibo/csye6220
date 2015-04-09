package com.embio.tht.beans;
// Generated Apr 6, 2015 10:54:41 PM by Hibernate Tools 3.4.0.CR1


/**
 * Allergy generated by hbm2java
 */
public class Allergy implements java.io.Serializable {

	private Integer id;
	private Integer accountId;
	private Integer ingredientId;
	private Integer surveyId;

	public Allergy() {
	}

	public Allergy(int id, Integer accountId, Integer ingredientId) {
		this.id = id;
		this.accountId = accountId;
		this.ingredientId = ingredientId;
	}

	public Allergy(int id, Integer accountId, Integer ingredientId, Integer surveyId) {
		this.id = id;
		this.accountId = accountId;
		this.ingredientId = ingredientId;
		this.surveyId = surveyId;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getAccountId() {
		return this.accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public Integer getIngredientId() {
		return this.ingredientId;
	}

	public void setIngredientId(int ingredientId) {
		this.ingredientId = ingredientId;
	}

	public Integer getSurveyId() {
		return this.surveyId;
	}

	public void setSurveyId(int surveyId) {
		this.surveyId = surveyId;
	}

}
