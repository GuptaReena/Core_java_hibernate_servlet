package collection;

import java.util.Collections;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*question
		Count he Number of alphabet in a sentence and print the alphabet 
		and count in ascending order of alphabet
		*/
		
		String sentence = "Hello this is a sentence which we are counting for the number of alphabet";
		//first ignore the case of the sentence
		String sentenceLower  =  sentence.toLowerCase();
		SortedMap<Character,Integer> countMap = new TreeMap<>(Collections.reverseOrder());
		//get each character of the sentence using a for loop
		
		for(int i = 0; i<sentenceLower.length(); i++) {
			char ch = sentenceLower.charAt(i);
			if(countMap.containsKey(ch)) {
				countMap.replace(ch, countMap.get(ch) + 1);//sh is already present in the TreeMap
			}else {
				countMap.put(ch, 1); //
			}
		}
		//traverse and print the countMap
		
		countMap.forEach((key,value)-> System.out.println(key + " : " + value));
		
		
	}

}
