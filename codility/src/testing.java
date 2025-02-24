
public class testing {
	public static String solution (int digit) {
		String rs = "";
		for(int i =0 ; i< digit; i++) {
			if(i%3 ==0) {
				rs+= "+";
			}
			else {
				rs+= "-";
			}
		}
		return rs;
	}
	public static void main(String[] args) {
		System.out.println(solution(15));
	}
}
