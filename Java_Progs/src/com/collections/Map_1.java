package com.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_1 {

	public static void main(String[] args) {
		
		Map<Object, Object> map = new HashMap<Object, Object>();
		
		map.put(1, 123);
		map.put(2, 12.3);
		map.put(2, 55.3);
		map.put(3, "Selenium");
		
		System.out.println(map);
		
		int s = map.size();
		System.out.println(s);
		
		Object obj = map.get(2);
		System.out.println(obj);
		
		Set<Object> key = map.keySet();
		System.out.println(key);
		
		Collection<Object> value = map.values();
		System.out.println(value);
		
		boolean containsKey = map.containsKey(3);
		System.out.println(containsKey);
		
		boolean containsValue = map.containsValue("Selenium");
		System.out.println(containsValue);
		
		Set<Entry<Object, Object>> entrySet = map.entrySet();
		
		Iterator<Entry<Object, Object>> i = entrySet.iterator();
		while (i.hasNext()) {
			
			Entry<Object, Object> next = i.next();
			System.out.println(next);
			
		}
		
	}
}
