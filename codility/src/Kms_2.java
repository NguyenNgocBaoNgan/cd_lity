import java.util.ArrayList;

public class Kms_2 {
public static ArrayList<Integer> add (int num){
	ArrayList<Integer> rs = new ArrayList<>();
	rs.add(num);
	return rs;
}
public static ArrayList<ArrayList<Integer>> count (int num, ArrayList<Integer> list){
	ArrayList<ArrayList<Integer>> rs = new ArrayList<>();
	for(int i =0; i < list.size(); i++) {
		for(int a = i+1; a < list.size(); a++) {

			if(list.get(i) + list.get(a)== num) {
				ArrayList <Integer> newElement = new ArrayList<>();
				newElement.add(list.get(i));newElement.add(list.get(a));
				rs.add(newElement);
			}
			
		}
	}
		
	
	return rs;
}
public static void main(String[] args) {
	ArrayList<Integer> test = new ArrayList<>();
	test.add(3);test.add(5);test.add(2);test.add(4);test.add(1);test.add(6);
	//System.out.println(add(6));
	System.out.println(count(8, test));
}
}
