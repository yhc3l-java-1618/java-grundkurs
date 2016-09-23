package se.coredev.week4.recap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public final class MainCollectionTest {

	public static void main(String[] args) {

		// 	 Collection				
		// 		 |
		// 	Set - - List			 -  Map -
		// 	 |       |				 |      |
		// HashSet ArrayList      HashMap TreeMap

		Thing thing1 = new Thing("1002", "");
		Thing thing2 = new Thing("1001", "");
		Thing thing3 = new Thing("1003", "");
		Thing thing1Copy = new Thing("1002", "");
		
		Map<Thing, Thing> thingsMap = new HashMap<>(); // TreeMap<>();
		
		thingsMap.put(thing1, thing1);
//		thingsMap.put(thing2.getId(), thing2);
//		thingsMap.put(thing3.getId(), thing3);
//		thingsMap.put(thing1Copy.getId(), thing1Copy);
		
//		Thing thing = thingsMap.get("10023");
//		System.out.println(thing.getId());
		
		
		System.out.println("Size:" + thingsMap.size());
		
		
		/**
		Collection<Thing> things = new ArrayList<>();//new HashSet<Thing>();//new LinkedHashSet<>();
		things.add(thing1);
		things.add(thing2);
		things.add(thing3);
		things.add(thing1Copy);
		
		for(Thing thing : things){
			System.out.println(thing.getId());
		}
		
		System.out.println("Size:" + things.size());
		*/
	}

}

