import java.util.Arrays;

public class CustomArray {
	int[] array;
	int size;
	
	public CustomArray() {
		array = new int[10];
		size = 0;
	}
	
	public void add(int num) {
		//System.out.println(array.length);
		if(size >= array.length) {
			int[] new_array = new int[size*2];
			for(int i =0; i < array.length; i++) {
				 new_array[i]= array[i];
			}
			this.array = new_array;
		}
		
			array[size] = num;
			size++;
		}
	public int[][] count(int num) {
		int countNum =0;
		int [][] rs = new int[5][2];
		for(int i =0; i< array.length; i++) {
			for(int a = i+1; a< array.length; a++) {
				if(array[i]+array[a]==num) {
					if(countNum>=5) {
						int[][] newOne = new int[countNum*2][2];	
						for(int b = 0; b< array.length; b++) {
							newOne[b]= rs[b];
						}
						rs = newOne;
						}
					rs[countNum][0] = array[i];
					rs[countNum][1] = array[a];
					countNum ++;
				}
				
			}
		}
		
		return rs;
	}
	
	public void print() {
		System.out.print("[" +array[0]);
		for(int i =1; i < size; i++) {
			System.out.print(", "+array[i]);
		}
		System.out.print("]");
	}
	public void printResult(int[][] result) {
        for (int i = 0; i < result.length; i++) {
            System.out.println(Arrays.toString(result[i]));
        }
    }
	public static void main(String[] args) {
		CustomArray test = new CustomArray();
//		test.add(1);test.add(1);test.add(1);test.add(1);
//		for (int i = 5; i <= 15; i++) {
//			test.add(i);
//		}
//		test.print();
		test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        test.add(5);
        test.add(6);
        
        // Tìm các cặp số có tổng bằng 7
        int[][] result = test.count(7);
        test.printResult(result); // In ra các cặp có tổng bằng 7
	}
	
}
