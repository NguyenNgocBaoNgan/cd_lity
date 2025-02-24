
import java.util.ArrayList;
import java.util.HashMap;

public class Duplicate {
//dùng hàm index of và last index of của arraylist
public static ArrayList<Integer> removeDuplicate(ArrayList<Integer> list, int num){
		if(list.indexOf(num) != list.lastIndexOf(num)) {
			list.remove(list.lastIndexOf(num));
		}
	return list;
}
//dùng hash map 
public static ArrayList<Integer> removeDuplicateUsingHM(ArrayList<Integer> list, int num){
	HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
	for(int i =0; i < list.size();i++) {
		if(map.containsKey(list.get(i))){
			map.get(list.get(i)).add(i);
		}
		else{
		ArrayList<Integer> pos = new ArrayList<>();
		pos.add(i);
		map.put(list.get(i), pos);
		}
	}
	//System.out.println(map.get(num).size() );
	if(map.get(num).size() >1) {
		list.remove(list.lastIndexOf(num));
	}
	return list;
}
public static void main(String[] args) {
	ArrayList<Integer> test = new ArrayList<>();
	for(int i =0; i<10; i++) {
		test.add(i);
		
	}
	test.add(3);
	System.out.println(test);
	System.out.println(removeDuplicateUsingHM(test, 0));
	//System.out.println(removeDuplicate(test, 3));
}
}
