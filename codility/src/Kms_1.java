
import java.util.ArrayList;
import java.util.HashMap;


public class Kms_1 {

public static int de2(ArrayList<String> list,String a, String b){
	int result =Integer.MAX_VALUE;
	HashMap<String, ArrayList<Integer>> map = new HashMap<>();
	for(int i =0; i < list.size(); i++) {
		if(map.containsKey(list.get(i))) {
			map.get(list.get(i)).add(i);
		}
		else {
			ArrayList<Integer> pos = new ArrayList<>();
			pos.add(i);
			map.put(list.get(i), pos);
		}
		
	}
	if(!map.containsKey(a)||!map.containsKey(b)) {
		result =-1;
	}
	else {
		for(int posA : map.get(a)) {
			for(int posB: map.get(b)) {
				result = Math.min(Math.abs(posA-posB),result);
			}
		}
	}
	
	return result;
}
public static void main(String[] args) {
	// Ví dụ về một ArrayList
    ArrayList<String> list = new ArrayList<>();
    list.add("cat");
    list.add("dog");
    list.add("bird");
    list.add("fish");
    list.add("cat");
    list.add("duck");
    list.add("chicken");
    list.add("dog");

    // Kiểm tra các trường hợp khác nhau
    System.out.println(de2(list, "dog", "duck"));  // Output: 2
    System.out.println(de2(list, "cat", "frog"));  // Output: -1
}
}

