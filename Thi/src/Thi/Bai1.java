package Thi;

import java.util.Scanner;


public class Bai1 {
	public static void main(String[] args) {
		String chuoi;
	    char[] kyTu = new char[100];
	    Scanner scanner = new Scanner(System.in);
	  
	    System.out.println("Nhap chuoi: ");
	    chuoi = scanner.nextLine().toString();
	    System.out.println(chuoi);
	    for (int i = 0; i < chuoi.length(); i++) {
	        kyTu[i] = chuoi.charAt(i);
	        
	    }
	    
	    int check;
	    if(isInteger(chuoi)) check = 1;
	    else check = 0;
	    String KQ="";
	    if(check==1) {
	    	if(CheckChiaHet(chuoi)==true) {
	    		char n;
	    		for (int i = 0; i < chuoi.length(); i++) {
	    	        if (kyTu[i]=='0' || kyTu[i]=='5') {
	    	        	n = kyTu[i];
	    	        	kyTu[i] = kyTu[chuoi.length()-1];
	    	        	kyTu[chuoi.length()-1] = n;
	    	        }	
	    	    }	
				for (int i = 0; i < chuoi.length(); i++) {
					KQ  += kyTu[i];
				}
				System.out.print("Ket qua: "+KQ);
	    	}
			
	    	else System.out.print("-1");
	    	
	    }
		else 
	    System.out.println("Chuoi khong phai va so nguyen");
	    
	}
	public static boolean CheckChiaHet(String s) {
		int T=0;
		int check9 =0;
		int check5 =0;
		for (int i = 0; i < s.length(); i++) {
	        T += Integer.parseInt(String .valueOf(s.charAt(i)));
	        if (s.charAt(i)=='0' || s.charAt(i)=='5') {
	        	check5 = 1;
	        }
	        	
	    }
		if (T%9 == 0) {
			check9 = 1;
		}
		if(check5==1 && check9==1) {
			return true;
		}
		else return false;

	}
	public static boolean isInteger(String chuoi) {
		boolean check = true;
		for (int i = 0; i < chuoi.length(); i++) {
	        if (chuoi.charAt(i)>=30 && chuoi.charAt(i)<=39) {
	        	check = false;
	        }
	        	
	    }
		return check;
	}
	
    
    
	
	
}
