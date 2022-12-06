package Asal;

import java.util.Scanner;

public class Asal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	     
		
		for(int i=1000 ; i<=9999;i++){
			int binlerBasamagi=i/1000;
			int yuzlerBasamagi=(i/100)%10;
			int onlarBasamagi=(i%100)/10;
			int birlerBasamagi=(i%10);
			
			
			if((binlerBasamagi==birlerBasamagi) && (yuzlerBasamagi==onlarBasamagi)){
				
				int sayac = 0;
				
				 for(int j = 2; j<i; j++) {
			            if(i % j == 0) {
			                sayac++;
			            }
			            
			            
			            
			        }
				 if(sayac == 0) {
		            	System.out.println(i);
		            }
				
				
			}
			
			
		}
	}

}
