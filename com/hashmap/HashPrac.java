package com.hashmap;

import java.util.HashMap;

public class HashPrac {

	public static void main(String[] args) {
		
		HashMap<Integer,Character> hm = new HashMap<>();
		String name = "Lakshman";
		char[] letters = name.toCharArray();
		int idx = 0;
		for(char letter : letters) {
			hm.put(idx+1,letter);
		}
			boolean isHm = hm.containsKey('1');
			System.out.println(isHm);
	}

}
