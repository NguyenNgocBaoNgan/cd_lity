import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class practiceLeetcode {

	    public static int[] twoSum(int[] nums, int target) {
	        int[] rs = new int[2];
	        HashMap <Integer, Integer> map = new HashMap <>();
	        for (int i =0; i < nums.length; i ++){
	        	int other = target - nums[i];
	        	if(map.containsKey(other)) {
	        		rs[0] = map.get(other);
	        		rs[1] = i;
	        		break;
	        	}
	        	map.put(nums[i],i);
	        }
	        
	        return rs;
	    }
	    //có thể dùng XOR
//	    HashMap<Character, Integer> mapS = new HashMap<>();
//        HashMap<Character, Integer> mapT = new HashMap<>();
//
//        for (int i = 0; i < s.length(); i++) {
//            char indexT = t.charAt(i);
//            char indexS = s.charAt(i);
//
//            mapS.put(indexS, mapS.getOrDefault(indexS, 0) + 1);
//            mapT.put(indexT, mapT.getOrDefault(indexT, 0) + 1);
//        }
//
//        char lastIndex = t.charAt(t.length() - 1);
//        mapT.put(lastIndex, mapT.getOrDefault(lastIndex, 0) + 1);
//
//        for (char key : mapT.keySet()) {
//            if (!mapS.containsKey(key) || mapT.get(key) > mapS.get(key)) {
//                return key;  
//            }
//        }
	    public static char findTheDifference(String s, String t) {
	    	 char rs = 0;
	         for(int i = 0; i < s.length(); i++) {
	        	 rs ^= s.charAt(i);
	         }
	        	for(int i =0; i< t.length(); i++) {
	        		 rs ^= t.charAt(i);
	        	 }

	         return rs;
	     }
	    //976. Largest Perimeter Triangle
//	    public static int[] findBiggestP(int[] arrays) {
//	    	int[] rs = new int[3];
//	    	
//	    	Arrays.sort(arrays);
//	    	int edge1 = 
//	    	
//	    	return rs;
//	    }
	    //cho phép tối đa O(Nlog(N);
	    public static int solution(int[] A) {
	        // Sắp xếp mảng để loại bỏ phần tử trùng lặp và kiểm tra liên tục
	        Arrays.sort(A);
	        ArrayList<Integer> list = new ArrayList<>();
	        
	        // Lọc ra các phần tử dương duy nhất
	        for (int i = 0; i < A.length; i++) {
	            if (A[i] > 0 && (list.isEmpty() || list.get(list.size() - 1) != A[i])) {
	                list.add(A[i]);
	            }
	        }
	        
	        // Nếu danh sách trống thì trả về 1 vì không có số dương nào
	        if (list.isEmpty()) return 1;
	        
	        // Kiểm tra từ 1 đến số lớn nhất trong list để tìm số nhỏ nhất bị thiếu
	        int expectedNumber = 1;
	        for (int num : list) {
	            if (num != expectedNumber) {
	                return expectedNumber;
	            }
	            expectedNumber++;
	        }
	        
	        // Nếu tất cả các số từ 1 đến số lớn nhất trong list đều có, trả về số tiếp theo
	        return expectedNumber;
	    }
	    // tìm 1 tam giác sao cho có cạnh lớn nhất dc tạo bởi 2 tam giác M và N
	    public static int solution (int M, int N) {
	    	int rs =0; 
	    	for(int i =1; i <= Math.sqrt(4*M + N); i++) {
	    		int x2square = (i/2) * (i/2);
	    		int x1square = i*i - x2square*4;
	    		
	    		if(x2square <= M && x1square <= N) {
	    			rs = Math.max(i, rs);
	    		}
	    	}
	    	
	    	return rs;
	    }
//	    Điều kiện để một chuỗi có thể được sắp xếp thành một palindrome:
//	    	Định nghĩa Palindrome: Một chuỗi là palindrome nếu khi đảo ngược, nó vẫn giống với chuỗi ban đầu (ví dụ: "radar", "madam").
//
//	    	Điều kiện cần:
//
//	    	Trong chuỗi, số lần xuất hiện của mỗi ký tự phải thỏa mãn điều kiện:
//	    	Nếu độ dài chuỗi là chẵn: Tất cả các ký tự phải xuất hiện chẵn lần.
//	    	Nếu độ dài chuỗi là lẻ: Tất cả các ký tự, ngoại trừ một ký tự, phải xuất hiện chẵn lần.
	    public static int[] twoSumII(int[] numbers, int target) {
	    	int[] rs = new int[2];
	    	int left = numbers[0];
	    	int right = numbers[numbers.length];
	        return rs;
	    }
	    public static boolean isPalindrome(String s) {
	    	boolean rs = false;
	    	String org = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
           if(org.length() ==0) return true;
           
	    	int firstPointer = 0;
	    	int secondPointer = org.length() -1;
	    	while(firstPointer <= secondPointer) {
	    		if(org.charAt(firstPointer) != org.charAt(secondPointer)) {
	    			return false;
	    		}
	    		firstPointer++;
	    		secondPointer --;
	    	}
	    	
	    	return true;
	    }
	   
	    public static boolean isAnagram(String s, String t) {
	    	HashMap<Character, Integer> mapS = new HashMap<>();
	    	HashMap<Character, Integer> mapT = new HashMap<>();

	    	if (s.length() != t.length()) {
	    	    return false;
	    	}
	    	for(int i =0; i < s.length(); i++) {
	    		char currS = s.charAt(i);
	    		mapS.put(currS, mapS.getOrDefault(currS, 0)+1);
	    		
	    	}
	    	for(int i =0; i < t.length(); i++) {
	    		char currT = t.charAt(i);
	    		if(!mapS.containsKey(currT)) {
	    			return false;
	    	}
	    		else {
		    		mapS.put(currT, mapS.getOrDefault(currT, 0)-1);
	    		}
	    	}
	    	for(int val : mapS.values()) {
	    		if(val !=0) {
	    			return false;
	    		}
	    	}
	    	
	        return true;
	    }
	    
	    public boolean isValid(String s) {
	        Stack<Character> stack = new Stack<>();

	        for (char c : s.toCharArray()) {
	            if (c == '(' || c == '{' || c == '[') {
	                stack.push(c);
	            } 
	            else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
	                stack.pop();
	            } 
	            else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
	                stack.pop();
	            } 
	            else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
	                stack.pop();
	            } 
	            else {
	                return false;
	            }
	        }

	        return stack.isEmpty();
	    }
	    
	    public List<List<String>> groupAnagrams(String[] strs) {	        
	        HashMap<String, List<String>> map = new HashMap<>();
	        for(String s: strs) {
	        	char[] c = s.toCharArray();
	        	Arrays.sort(c);
	        	String sorted = new String(c);
	        	
	        	List<String> list = new ArrayList<>();
	        	
	        	map.putIfAbsent(sorted, list);
	        	map.get(sorted).add(s);
	        }
	      
	        
	        return new ArrayList<> (map.values());

	    }

	    public int orangesRotting(int[][] grid) {
	        int rs =0;
	        int freshCount =0;
	        Queue<int[]> queue = new LinkedList<>();
	        for(int i =0; i < grid.length; i++) {
	        	for(int j =0; j < grid[0].length; j++) {
	        		if(grid[i][j] == 2) {
	        			queue.offer(new int[] {i,j});
	        		} 
	        		if(grid[i][j] == 1) {
	        			freshCount++;
	        		}
	        	}
	        }
	        if(freshCount ==0) return 0;
	        
	      int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
	        
	          while (!queue.isEmpty()) {
	              int size = queue.size(); 
	              boolean hasRotten = false;
	              for (int i = 0; i < size; i++) {
	                  int[] position = queue.remove();
	                  for (int[] dir : dirs) {
	                	  
	                      int x = dir[0] + position[0]; 
	                      int y = dir[1] + position[1]; 

	                      if (x >= 0 && x < grid.length && y >= 0 && y < grid[0].length && grid[x][y] == 1) {
	                          grid[x][y] = 2; 
	                          freshCount --;
	                          queue.add(new int[]{x, y}); 
	                          hasRotten = true;
	                      }
	                  }
	              }
	              if(hasRotten) rs++;
	          }
	         if(freshCount !=0) return -1; 

	        return rs;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			int [] nums = {2,7,11,15};
//			int target =9;
//			System.out.println(Arrays.toString(twoSum(nums, target)));
//			System.out.println(findTheDifference("abcd", "abcde"));
//			System.out.println(solution(new int[] {1,2,3}));
//			int N = 1; // Số hình vuông 1x1
//	        int M = 2;  // Số hình vuông 2x2
//	        System.out.println("Largest Square Side: " + solution(N, M)); // In cạnh của hình vuông lớn nhất
//	        System.out.println(isPalindrome("race a car"));
	
	}

}
