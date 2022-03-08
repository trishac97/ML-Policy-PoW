package com.policy.model;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import com.policy.puzzle.Puzzle;


public class ClientSide {
	public String nonce;
    public String reqID;
    public String r_string;
    public String hash_solution;
    public int difficulty;
	public int getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}
	public String getNonce() {
		return nonce;
	}
	public void setNonce(String nonce) {
		this.nonce = nonce;
	}
	public String getReqID() {
		return reqID;
	}
	public void setReqID(String reqID) {
		this.reqID = reqID;
	}
	public String getR_string() {
		return r_string;
	}
	public void setR_string(String r_string) {
		this.r_string = r_string;
	}
	public String getHash_solution() {
		return hash_solution;
	}
	public void setHash_solution(String hash_solution) {
		this.hash_solution = hash_solution;
	}
	 public ClientSide findPuzzleSol() throws UnsupportedEncodingException, NoSuchAlgorithmException{
			
		 	ClientSide client = new ClientSide();
			
			
			Puzzle puzzle= new Puzzle(reqID,r_string,difficulty);
			
		    
		     client  = puzzle.POW(difficulty);

	        return client;
	}
	 
	 
}