package exam;

import java.util.HashMap;
import java.util.Map;

//There is an array numbers made of N integers. Each number has at least two digits and its first and last digits are different. 
//
//You can select a pair of numbers if the last digit of the first selected number is the same as the first digit of the second selected number, Calculate the number of ways in which such a pair of numbers can be selected.
//
//Write a function:
//
//function solution(numbers: number[]): number:
//
//that, given an array numbers made of N integers, returns the number of ways to select a pair of numbers as described above.
//
//Examples:
//
//1. Given numbers (30, 12, 29, 91), the function should return 3. The pairs are: (12, 29), (29, 91) and (91, 12).
//
//2. Given numbers = [122, 21, 21, 23), the function should return 5. The pairs are: (122, 21) occurring twice, (122, 23), and (21, 122) occurring twice. Please note that the same pair of numbers can appear multiple times if the pairs of their indices are different
//
//Write an efficient algorithm for the following assumptions:
//
//N is an integer within the range [1..100,000 each element of array numbers is an integer within the range [10..1,000,000,000)
//
//the first and last digits in each element of array numbers are different the answer does not exceed 1,000,000,000.
public class ex27 {
    public static int solution(int[] numbers) {
        int rs = 0;
        HashMap<Integer, Integer> first = new HashMap<>();
        HashMap<Integer, Integer> last = new HashMap<>();


        for (int num : numbers) {
            String numS = String.valueOf(num);
            int firstDigit = Character.getNumericValue(numS.charAt(0));
            int lastDigit = Character.getNumericValue(numS.charAt(numS.length() - 1));
            
            first.put(firstDigit, first.getOrDefault(firstDigit, 0)+1);
            last.put(lastDigit, last.getOrDefault(lastDigit, 0)+1);
            
            
        }
        for(int i : first.keySet()) {
        	if(last.containsKey(i)) {
        		rs += first.get(i) * last.get(i);
        	}
        }
//        for (Map.Entry<Integer, Integer> entry : first.entrySet()) {
//            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
//        }
//        System.out.println();
//        for (Map.Entry<Integer, Integer> entry : last.entrySet()) {
//            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
 //       }
        return rs;
    }
	public static void main(String[] args) {
		int[] numbers1 = {30, 12, 29, 91};
        System.out.println(solution(numbers1));  // Kết quả: 3

        int[] numbers2 = {122, 21, 21, 23};
        System.out.println(solution(numbers2));  // Kết quả: 5
	}
}