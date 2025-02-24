
public class BinarySearch {
public static int binarySearch(int[] array, int a) {
	int begin = 0; int end = array.length -1;
	
	while(begin<= end) {
		int mid = (begin +end)/2;
		if(a == array[mid]) {
			return mid;
		}
		
		if(a<array[mid]) {
			end = mid-1;
		}
		else
			begin = mid +1;
		}
		
	
	
	return -1;
}
public static void main(String[] args) {
	int[] test = { 2, 3, 4, 10,40};
	System.out.println(binarySearch(test, 40));
	
	
}
}
