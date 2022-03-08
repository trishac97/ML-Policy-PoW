package com.policy.main;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import com.policy.model.ClientSide;
import com.policy.puzzle.Puzzle;

public class SolvePuzzle {

	public static void main(String[] args) throws UnsupportedEncodingException, NoSuchAlgorithmException {
		
		ClientSide clientobj = new ClientSide();
		clientobj.setR_string("110110");
		clientobj.setReqID("190.12.19.10");
		clientobj.setDifficulty(Math.getExponent(10));
		clientobj.findPuzzleSol();

	}

}
