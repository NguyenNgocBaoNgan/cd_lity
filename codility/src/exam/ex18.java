package exam;

import java.util.Arrays;

//Prepare a notification of the given message which will be displayed on a mobile device. The message is made of words separated by single spaces. The length of the notification is limited to K characters. If the message is too long to be displayed fully, some words from the end of the message should be cropped, keeping in mind that:
//
//the notification should be as long as possible;
//
//only whole words can be cropped;
//
//if any words are cropped, the notification should end with "..."; the dots should be separated from the last word by a single space;
//
//the notification may not exceed the K-character limit, including the dots.
//
//If all the words need to be cropped, the notification is "..." (three dots without a space).
//
//For example, for message "And now here is my secret" and K-15, the notification is "And now ...". Note that:
//
//• the notification "And..." would be incorrect, because there is a longer correct notification; • the notification "And now her .."would be incorrect, because the original message is cropped through the middle of a
//
//word; • the notification "And now ... "would be Incorrect, because it ends with a space,
//
//the notification "And now here..."would be incorrect, because there is no space before the three dots, the notification "And now here ..." would be incorrect, because it exceeds the 15-character limit.
//
//Write a function:
//
//class Solution { public String solution(String message, int K); }
//
//A
//
//that, given a string message and an integer K, returns the notification to display, which has no more than K characters, as described above.
//
//Examples:
//
//1. For message "And now here is my secret" and K-15, the function should retum "And now...., as explained above.
//
//2. For message "There is an animal with four legs" and K = 15, the function should retum "There is an ....
//
//3. For message "super dog" and K-4, the function should retum".....
//
//4. For message "how are you" and K-20, the function should return "how are you".
//
//Assume that:
//
//K is an integer within the range [3..500); the length of string message is within the range [1..500);
//
//string message is made of English letters ('a'z', 'A-Z) and spaces() message does not contain spaces at the beginning or at the end;
//
//words are separated by a single space (there are never two or more consecutive spaces).
//
//In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment
public class ex18 {
	public static String solution(String mess, int K) {
		if(mess.length() <= K) {
			return mess;
		}
        String rs = "";
        int i = 0, count = K - 4;
        String[] s = mess.split("\\s");
        
        if( K < s[0].length() +4) {
        	return "...";
        }

        while (count >0) {
        	
        	rs += s[i] +" ";
        	count -= s[i].length() +1;
        	i++;
        	
        }
       // System.out.println(rs);
      
        if((rs + "...").length() > K ) {
        	 rs = rs.trim();
             int lastSpaceIndex = rs.lastIndexOf(" ");
             return rs.substring(0, lastSpaceIndex) + " ...";
        }
        
        
        return rs + "...";
    }


    public static void main(String[] args) {
        String s = "And now here is my secret"; int k = 15;
        String s1 = "There is an animal with four legs"; int k1 = 15;
        String s2 = "super dog"; int k2 = 4;
        String s3 = "how are you"; int k3 = 20;
        String s4 = "how are you"; int k4 = 11;

        
        System.out.println(solution(s, k));     // "And now ..."
        System.out.println(solution(s1, k1));   // "There is an ..."
        System.out.println(solution(s2, k2));   // "..."
        System.out.println(solution(s3, 11));   // "how are you"
}
}
