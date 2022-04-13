package com.policy.policies;

import java.util.Random;

public class Policy3 {
	
	float reputation; //Scale 0-10
	int difficulty;
	
	public Policy3(float reputation) {
		this.reputation = reputation;
		this.difficulty = policySpecification(reputation);
	}
	
	private int policySpecification(float reputation) {

		return (int) Math.ceil(reputation+5);
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
