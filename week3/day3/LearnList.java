package week3.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {

		List<Integer> value = new ArrayList<Integer>();
		//.add();
		
		value.add(100);
		value.add(90);
		value.add(100);
		System.out.println(value);
		
		List<Integer> value2 = new ArrayList<Integer>();
		value2.add(100);
		
		// .addAll();
		
		value2.addAll(value2);
		System.out.println(value2);
		
		// .get(); index value starts with 0 
		
		System.out.println("Get the value present in index 2: "+ value.get(2));
		
		//remove(); - value based on index
		value.remove(1);
		System.out.println(value);
		
		System.out.println(value2);
		
		// .sort();
		Collections.sort(value);
		System.out.println(value);
		
		// .clear();
		
		value.clear();
		System.out.println(value);
		
	}

}
