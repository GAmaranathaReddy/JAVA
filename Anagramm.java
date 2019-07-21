package com.sample.string;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Anagramm {
public static void main(String[] args) {
	String s1="anagramm";
	String s2="marganaa";
	System.out.println(checkAnagrams(s1, s2)); // FALSE
	String s3="Hello";
	String s4="Hello";
	System.out.println(checkAnagrams(s3, s4));// TRUE
	
	String s5="Hello";
	String s6="lloeh";
	System.out.println(checkAnagrams(s5, s6));//TRUE
	
}

public static boolean checkAnagrams(String s1,String s2) {
	Map<Object, Long> countString=Arrays.stream(s1.toLowerCase().split(""))
			.collect(Collectors.groupingBy(c ->c,Collectors.counting()));
	Map<Object,Long> countString2=Arrays.stream(s2.toLowerCase().split("")).collect(Collectors.groupingBy(c -> c,Collectors.counting()));
	return countString.entrySet().equals(countString2.entrySet());
}
}
