package Array;

import java.util.HashMap;

import java.util.Map;

//Basically this code is check for the last occurence of the each element
public class FindOccuranceOfEachElement {

	public static Map Ocurrance(int arr[]) {
		
		Map<Integer, Integer> map=new HashMap<Integer,Integer>();
		
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i], i);
		}
		
		
		/*if (map.containsKey(arr[i])) {
		    // If the element already exists, increase its count by 1
		    map.put(arr[i], map.get(arr[i]) + 1);
		} else {
		    // If the element is not in the map yet, set count as 1
		    map.put(arr[i], 1);
		}*/

		
		
		return map;
	}
	public static void main(String[] args) {
		
		int arr[]= {2,1,3,2,1};
		System.out.println(Ocurrance(arr));
		
	}
}
