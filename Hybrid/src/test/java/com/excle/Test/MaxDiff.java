package com.excle.Test;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MaxDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Map map = new HashMap<String, Integer>(); 
		  map.put("Vishal",33);
		  map.put("Vishal", 34); 
		  map.put("Amol", 28); 
		  map.put("Akshay",29);
		  System.out.println(map.size()); 
		  System.out.println(map.get("Amol"));
		  System.out.println(map.keySet());
		  System.out.println(map.containsKey("Amol"));
		  System.out.println(map.isEmpty()); 
		  System.out.println(map);
		 
		
		String name = "kjhfajkjfkjkfhkdcsakjhj";
		System.out.println(charCount(name));
		//  System.out.println(charCount("akshay", 'a'));
        System.out.println(stringExtract("abc"));
           List ls = new LinkedList<String>();
           
           charCount("vgjachjacha");
           System.out.println(charCount("vgjachjacha"));
		
	}
	public static Map<String,Integer> charCount(String name){
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		String[] nameValue = name.split("");
		for(String value:nameValue) {
		hm.put(value, 0);
		}
		for(String value:nameValue) {
			if(hm.containsKey(value)) {
				hm.put(value, hm.get(value)+1);
			}
			}
		return hm;
		
	}
	public int charCount(String name, char c) {
		int size = name.length();
		int charCount=0;
		for(int i=0;i<size;i++) {
			if(name.charAt(i)==c) {
				charCount++;
			}
		}
		return charCount;
	}
	
	public static String stringExtract(String name) {
		String text="www.google.com";
		
		//return text.split("\\.")[1];
		
		return text.substring(4, 10);
}
}
