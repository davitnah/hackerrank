package staircase;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.close();
		
		for(int i = N; i > 0; --i) {
			for(int j = 0; j < N; ++j) {
				System.out.print(" ");
			}
		}

	}

}
