package com.sample.string;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class Anagramm {
public static void main(String[] args) {
	String s1="anagramm";
	String s2="marganaa";
	System.out.println(checkAnagrams(s1, s2));
}

public static boolean checkAnagrams(String s1,String s2) {
	Map<Object, Long> countString=Arrays.stream(s1.toLowerCase().split(""))
			.collect(Collectors.groupingBy(c ->c,Collectors.counting()));
	Map<Object,Long> countString2=Arrays.stream(s2.toLowerCase().split("")).collect(Collectors.groupingBy(c -> c,Collectors.counting()));
	Optional<Entry<Object, Long>> filterCounting=countString.entrySet().stream().filter(e -> countString.get(e)==countString2.get(e)).findFirst();
	return !filterCounting.isPresent();
}
}
