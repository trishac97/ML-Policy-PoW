package com.policy.main;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

import com.policy.model.ClientSide;
import com.policy.policies.Policy1;
import com.policy.policies.Policy2;
import com.policy.puzzle.Puzzle;

public class SolvePuzzle {

	public static void main(String[] args) throws UnsupportedEncodingException, NoSuchAlgorithmException {
		
		long startTime = System.currentTimeMillis();
		long elapsedTime = 0L;	
		float reputation = (float) 11.9;
		float epsilon = (float) 0.2; //DaBR epsilon ~20%

		//Policy 1:
		Policy1 p1obj = new Policy1(reputation);
		//Policy 2:
		Policy2 p2obj = new Policy2(reputation);

		ClientSide clientobj = new ClientSide();
		clientobj.setR_string("110110"); // Random string seed, changes every t seconds
		clientobj.setReqID("190.12.19.10"); //Source IP
		
		//Policy 1
		clientobj.setDifficulty(p1obj.getDifficulty());
		//Policy 2
//		clientobj.setDifficulty(p2obj.getDifficulty());
		
		Puzzle puzzle= new Puzzle(clientobj.getReqID(),clientobj.getR_string(),clientobj.getDifficulty());
		puzzle.POW(clientobj.getDifficulty());		
		elapsedTime = (new Date()).getTime() - startTime;
		System.out.println(elapsedTime);
	
	}

}
