package com.policy.policies;

import java.util.Random;

public class Policy2 {
	
	float reputation; //Scale 0-10
	int difficulty;
	float epsilon = (float) 0.2; //DaBR epsilon ~20%
	
	public Policy2(float reputation) {
		this.reputation = reputation;
		this.difficulty = policySpecification();
	}
	
	private int policySpecification() {

		int maxRep = (int) Math.ceil(reputation + (reputation*epsilon));
		int minRep = (int) Math.floor(reputation - (reputation*epsilon));
		Random random = new Random();
		return random.nextInt(maxRep - minRep + 1) + minRep;
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
