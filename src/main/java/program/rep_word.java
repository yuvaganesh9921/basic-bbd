package program;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class rep_word {
  public static void repation_words() {
	  String s ="of the people by the people for the people";
	  String[] words = s.split("");
	  Map<String, Integer> map = new LinkedHashMap<String, Integer>();
	  for (String word : words) {
		if(map.containsKey(word)) {
			Integer number = map.get(word);
			map.put(word, number+1);
		}else {
			map.put(word,1);
		}
		
	}
	  System.out.println(map);
  
	  Set<Entry<String, Integer>> entrySet = map.entrySet();
	  for (Entry<String, Integer> entry : entrySet) {
		if(entry.getValue()>1) {
			System.out.println("repation words"+ entry);
		}
	}
 }
  public static void duplicated() {
		int[] a = {1,2,3,4,5};
		for (int i = 0; i < a.length-1; i++) {
			for(int j=1;j<=4;j++) {
				if(a[j]<=i) {
					System.out.println(j);
				}
				}
			}
		}
 public static void rever() {
	 String s = "welcome to java";
	 char[] charArray = s.toCharArray();
	 for (int i = charArray.length-1 ; i >=0; i--) {
		System.out.print(charArray[i]);
	}
 }
 public static void rever1() {
	 String a ="wellcome to java With selenium";
	 String[] word =a.split(" ");
	 String rever="";
	 for (int i = word.length-1; i >=0; i--) {
		rever=rever+word[i];
		System.out.println(rever);
	}
 }
 public static void rever2() {
	 String a ="wellcome tro java";
	for(int i=a.length()-1;i>=0;i--) {
		System.out.print(a.charAt(i));
	}
	
 }
 public static void array() {
	 int[] a = {10,20,30,60,87,4,6,78};
	 int min =a[0];
	 for (int i = 1; i < a.length-1; i++) {
		if(a[i]<min) {
			min=a[i];
		}
		System.out.println("max num"+min);
	 }
 }
 public static void array_2largest() {
	 int[] a= {10,20,30,40,50};
	 Arrays.sort(a);
	 int size = a.length;
	System.out.println(a[size-3]);
	 }
 
  public static void main(String[] args) {
	  //repation_words();
	  //duplicated();
	  //rever();
	  //rever1();
	 // rever2();
	  //array();
	  array_2largest();
  }
}
