package com.policy.main;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

import com.policy.model.ClientSide;
import com.policy.puzzle.Puzzle;

public class SolvePuzzle {

	public static void main(String[] args) throws UnsupportedEncodingException, NoSuchAlgorithmException {
		
		ClientSide clientobj = new ClientSide();
		clientobj.setR_string("110110");
		clientobj.setReqID("190.12.19.10");
		clientobj.setDifficulty(20);
				
		
		Puzzle puzzle= new Puzzle(clientobj.getReqID(),clientobj.getR_string(),clientobj.getDifficulty());
	    
		long startTime = System.currentTimeMillis();
		long elapsedTime = 0L;		

		puzzle.POW(clientobj.getDifficulty());

		elapsedTime = (new Date()).getTime() - startTime;

		System.out.println(elapsedTime);
	}

}
