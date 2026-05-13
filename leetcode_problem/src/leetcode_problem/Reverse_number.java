package leetcode_problem;

public class Reverse_number {

	public static void main(String[] args) {
		int n =-2147483412;
		int temp = n;
		int reverse = 0;
		int count = 0;
		while(temp!=0) {
			count++;
			int digit = temp % 10;
			reverse = reverse * 10 + digit;
			temp = temp / 10;
		}
		if(count<10) {	
		System.out.println(reverse);
	}else if(count>=10 && n<0){
		System.out.println(0);
	}else
		System.out.println(reverse);
}}