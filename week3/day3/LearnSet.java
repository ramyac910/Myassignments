package week3.day3;

import java.util.LinkedHashSet;
import java.util.Set;

public class LearnSet {

	public static void main(String[] args) {

		String companyName = "testleaf";
		Set<Character> unique=new LinkedHashSet<Character>();
		for (int i =0 ; i < companyName.length(); i++) {
			char ch = companyName.charAt(i);
			unique.add(ch);
		}
		System.out.println(unique);
	}
	
	

}
