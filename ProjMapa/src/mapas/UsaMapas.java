package mapas;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class UsaMapas {
	
	public static void main(String[] args) {
		
		Map<String, String> hashMap = new HashMap<>();		
		hashMap.put("fulano", "fulano123");
		hashMap.put("cicrano", "cicrano123");			
		hashMap.put("beltrano", "beltrano123");
		
		for (Entry<String, String> entry : hashMap.entrySet()) {
			System.out.println("login: " + entry.getKey() + "\nsenha: " + entry.getValue() + "\n");
		}
			
		Map<String, String> treeMap = new TreeMap<>(new Comparator<String>() {					
			
			public int compare(String s1, String s2) {
				return s1.compareToIgnoreCase(s2);
			}
		});
		treeMap.put("fulano", "fulano123");
		treeMap.put("cicrano", "cicrano123");
		treeMap.put("beltrano", "beltrano123");
		
		for (Entry<String, String> entry : treeMap.entrySet()) {
			System.out.println("login: " + entry.getKey() + "\nsenha: " + entry.getValue() + "\n");
		}
		
	}
	
}
