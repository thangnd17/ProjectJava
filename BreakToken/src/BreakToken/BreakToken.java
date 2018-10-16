package BreakToken;

import java.util.Scanner;

public class BreakToken {

	public static void main(String[] args) {
		String input = "";
		System.out.println("Input the statement: \n");
		input = new Scanner(System.in).nextLine();
		int i = 0;
		int state = 0;
		int start = 0;
		while(i < input.length()) {
			
			char charAt ;
			switch (state) {
			case 0:
				charAt= input.charAt(i);
				if(charAt == ' ' || charAt == '\t' || charAt == '\n') {
					state = 0;
					i++;
				}else if(charAt == '<') {
					state = 1;
					i++;
				}else if(charAt == '=') {
					state = 5;
					i++;
				}else if(charAt == '>') {
					state = 6;
					i++;
				}
				break;
				
			case 1:
				charAt = input.charAt(i);
				if(charAt == '=') {
					state = 2;
					i++;
				}else {
					state = 3;
					//i++;
				}
				break;
			case 2:
				System.out.println("relop: "+  input.substring(start, i));
				i++;
				start = i;
				break;
			case 3:
				System.out.println("relop: "+  input.substring(start, i));
				i++;
			default:
				break;
			}
			
		}
		
		
	}

}
