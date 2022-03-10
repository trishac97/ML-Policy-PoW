package com.policy.policies;

public class Policy1 {
	float reputation; //Scale 0-10
	int difficulty;
	public Policy1(float reputation) {
		this.reputation = reputation;
		this.difficulty = policySpecification();
	}
	private int policySpecification() {
		return Math.round(reputation);
	}
	public float getReputation() {
		return reputation;
	}
	public void setReputation(float reputation) {
		this.reputation = reputation;
	}
	public int getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}
	
	
}
