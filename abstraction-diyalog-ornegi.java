package Java2022;

import java.util.ArrayList;

class insan{
	private String isim;
	
	private ArrayList<insan> arkadaslar = new ArrayList<insan>();

	
	public insan(String isim) {
		
		this.setIsim(isim);
		
	}

	public String getIsim() {
		return this.isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}
	
	public ArrayList<insan> getArkadaslar(){
		return this.arkadaslar;
	}
	
	public void setArkadaslar(insan arkadas) {
		arkadaslar.add(arkadas);
	}
	
	
	
	void birSeySoyle(insan kimeSoyledi, String mesaj) {
		System.out.println(this.getIsim()+": "+kimeSoyledi.getIsim()+" "+mesaj+" dedi.");
	}
	
	boolean arkadasMi(insan kimeSoyledi) {
		if(this.getArkadaslar().indexOf(kimeSoyledi)==-1) 
			return false;
		
		return true;
	}
	
}

public class firstApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		insan ahmet = new insan("Ahmet");
		insan can = new insan("Can");
		
		ahmet.setArkadaslar(can);
		can.setArkadaslar(ahmet);
		
		
		if(ahmet.arkadasMi(can))
			ahmet.birSeySoyle(can, "Merhaba");
		if(can.arkadasMi(ahmet))
			can.birSeySoyle(ahmet, "Nasılsın");
		
	}

}


//Aynı işi yapan 2 method olamaz. Kod tekrarı ayak bağı olur.
//Abstraction: Neyin önemli neyin önemsiz olduğunu belirleyip. Önemli olan konuları öne çekmek demektir
