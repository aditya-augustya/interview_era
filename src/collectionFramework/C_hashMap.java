package collectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C_hashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		Map<String,Integer> _map = new HashMap<String,Integer>() ;
		// HashMap<String,Integer> _map_ = new Map<String,Integer>() ; not possible
		
		_map.put("Buny", null);
		_map.put("Bohn", 150);
		_map.put("sunita", null);
		_map.put("Raj", 29);
		_map.put("ambi", null);
		_map.put("Anita", null);
		_map.put("Raj", 312);
		System.out.println(_map);
		*/
		
		
	/*
		Map<String,Integer> map = new HashMap<String,Integer>() ; 
		map.put("", 101) ;
		map.put("adi", 104) ;
		//map.put(null, null) ;  // Exception in thread "main" java.lang.NullPointerException
		//map.put(null, null) ;
		//map.put(null, null) ;
		map.put("  ", 101) ;
		System.out.println(map);
		*/
		
		
		Map<Integer,String> map = new HashMap<Integer,String>() ;
		map.put(11, "Peru") ;
		map.put(101, "Peru") ;
		
		map.put(103, "Ravi") ;
		map.put(104, "Rohan_ Adi") ;
		map.put(104, "Rohan") ;
		map.put(105, "Ram") ;
		map.put(101, "Peru") ;
		map.put(101, "Peru") ;
		
		System.out.println(map);
	
		
		
	}

}
