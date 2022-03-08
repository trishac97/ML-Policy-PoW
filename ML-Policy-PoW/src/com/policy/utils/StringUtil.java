package com.policy.utils;

import java.io.UnsupportedEncodingException;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.util.Base64;

public class StringUtil {
	
	
	public static String SHA256(String input) throws NoSuchAlgorithmException, UnsupportedEncodingException {

	
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			byte[] hash = digest.digest(input.getBytes("UTF-8"));			
			
			//Converting byte[] to hex values
			StringBuffer hashString = new StringBuffer();
			String hexString = null;
			for(int i=0; i<hash.length;i++) {
				hexString = Integer.toHexString(0xff & hash[i]);
				if(hexString.length() == 1) hashString.append('0');
					hashString.append(hexString);					
			}	
		
			
			
			return hashString.toString();
		
		
	}
	
	//Returns difficulty string target, to compare to hash. eg difficulty of 5 will return "00000"  
		public static String getDificultyString(int difficulty) {
			return new String(new char[difficulty]).replace('\0', '0');
		}

		public static String getStringFromKey(Key key) {
			return Base64.getEncoder().encodeToString(key.getEncoded());
		}
		
}