package com.policy.main;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

import com.policy.model.ClientSide;
import com.policy.puzzle.Puzzle;

public class SolvePuzzle {

	public static void main(String[] args) throws UnsupportedEncodingException, NoSuchAlgorithmException {
		
		
					    
	    	//Policy 2:
	    	long startTime = System.currentTimeMillis();
			long elapsedTime = 0L;	
			float reputation = (float) 11;
			float epsilon = (float) 0.2;
			
			int max = (int) Math.ceil(reputation + (reputation*epsilon));
			int min = (int) Math.floor(reputation - (reputation*epsilon));
			
			ClientSide clientobj = new ClientSide();
			clientobj.setR_string("110110");
			clientobj.setReqID("190.12.19.10");
			Random random = new Random();
			int difficulty = random.nextInt(max - min + 1) + min;
			System.out.println(difficulty);
			clientobj.setDifficulty(difficulty);
			Puzzle puzzle= new Puzzle(clientobj.getReqID(),clientobj.getR_string(),clientobj.getDifficulty());


			puzzle.POW(clientobj.getDifficulty());

			elapsedTime = (new Date()).getTime() - startTime;
			
			puzzle = null;
			clientobj = null;
			System.out.println(elapsedTime);
			
	    


	    
		
	}

}
