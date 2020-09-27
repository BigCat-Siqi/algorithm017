package leetcode66_addone;

import java.util.Arrays;

public class AddOne {
	public int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i>=0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if(digits[i] != 0){
                return digits;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

	public static void main(String[] args) {
		int[] oldDigit = {8,9,9,9};
		AddOne digit = new AddOne();
		int[] newDigit = digit.plusOne(oldDigit);
		System.out.println(Arrays.toString(newDigit));
	}

}
