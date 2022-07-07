package Thi;

import java.util.Scanner;

public class Bai1 {
	String chuoi;
    char kyTu;
    Scanner scanner = new Scanner(System.in);
  
    System.out.println("Nhập vào chuỗi bất kỳ: ");
    chuoi = scanner.nextLine();
    
    for (int i = 0; i < chuoi.length(); i++) {
        kyTu = chuoi.charAt(i);
             
        System.out.println(kyTu);
    }
	public static Boolean isInteger(String s) {
	    return isInteger(s,10);
	}
	 
	public static boolean isInteger(String s, int radix) {
	    if(s.isEmpty()) return false;
	    for(int i = 0; i < s.length(); i++) {
	        if(i == 0 && s.charAt(i) == '-') {
	            if(s.length() == 1) return false;
	            else continue;
	        }
	        if(Character.digit(s.charAt(i),radix) < 0) return false;
	    }
	    return true;
	}
	
}
