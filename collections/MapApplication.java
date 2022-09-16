package collections;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class MapApplication {
	public static void main(String[] args) {
	//	Map<Integer,Integer> stuMarks=new HashMap<Integer,Integer>();   //not ordered not sorted
	//	Map<Integer,Integer> stuMarks=new LinkedHashMap<Integer,Integer>();  //ordered
		//Map<Integer,Integer> stuMarks=new TreeMap<Integer,Integer>();  //ordered//SortedMap //syn
		
		Map stuMarks=new ConcurrentHashMap();  //ordered//SortedMap //syn
		stuMarks.put(10,90);
		stuMarks.put(11,90);
		stuMarks.put(9,56);
		stuMarks.put(6,79);
		System.out.println(stuMarks);
		//stuMarks.remove(9);
		stuMarks.containsKey(11);
		stuMarks.containsValue(79);
		stuMarks.replace(11, 90,93);
		
		
		Set<Integer> ks=stuMarks.keySet();//k
		System.out.println(ks);
		
		Collection<Integer> v=stuMarks.values();//v
		System.out.println(v);
		
		Set entry=stuMarks.entrySet(); //k-v
		System.out.println(entry);
		Iterator i=entry.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
			//Map.Entry e=(Map.Entry)i.next();
			//System.out.println(e.getKey()+"  "+e.getValue());
			
		}
		
		
		
		
	}

}
