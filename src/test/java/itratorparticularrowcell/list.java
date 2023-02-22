package itratorparticularrowcell;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class list {

	public static void main(String[] args) {
		String s = "hi gud gud morg";
		String[] split = s.split(" ");
		Map<String,Integer> ref = new LinkedHashMap<String, Integer>();
		for (String string : split) {
			if(ref.containsKey(string)) {
				Integer  num =ref.get(string);
				ref.put(string, num+1);
			}
			else {
				ref.put(string,1);
			}
		
		}
		System.out.println(ref);
		Set<Entry<String, Integer>> entrySet = ref.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if(entry.getValue()>1) {
				System.out.println("Repeated words"+":"+entry);
			}
		}

	}

}
