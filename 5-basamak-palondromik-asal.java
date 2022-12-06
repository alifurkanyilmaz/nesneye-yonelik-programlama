package Java2022;

public class denemex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=10000;i<=99999;i++) {
			int birlerBasamagi=i%10;
			int onBinlerBasamagi=i/10000;
			int binlerBasamagi=(i-onBinlerBasamagi*10000)/1000;
			int yuzlerBasamagi=(i-onBinlerBasamagi*10000-binlerBasamagi*1000)/100;
			int onlarBasamagi=(i-onBinlerBasamagi*10000-binlerBasamagi*1000-yuzlerBasamagi*100)/10;
			if((onBinlerBasamagi==birlerBasamagi)&&(binlerBasamagi==onlarBasamagi)) {
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


