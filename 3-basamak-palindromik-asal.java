package Java2022;

public class denemex2 {
	public static void main(String args []){
		for (int i=100;i<=999;i++)
		{
			int birlerBasamagi=i%10;
			int yuzlerBasamagi=i/100;
			if(birlerBasamagi==yuzlerBasamagi){
				int bayrak=1;
				for(int j=2;j<i;j++) {
					if(i%j==0) {
						bayrak=0;
					}
				}
				if(bayrak==1) {
					System.out.print(i+" ");
				}
				
			}
		}
	}

}
