package Java2022;

class motorluarac {
	public motorluarac() {
		System.out.println("Bu bir motorlu araçtır!");
	}
	
	public motorluarac(int n) {
		System.out.println("Bu "+n+" tekerlekli bir motorlu araçtır!");
	}
	
	public void motorucalistir() {
		System.out.println("Motoru çalıştırdım!");
	}
	
	public void aracgidiyor() {
		motorucalistir();
		System.out.println("Motorlu araç gidiyor!");
	}
	
}

class otomobil extends motorluarac{
	public otomobil() {
		super();
		System.out.println("Bu bir otomobildir!");
	}
	
	public void otomobilmotorunucalistir() {
		super.motorucalistir();
	}
	
	public void aracgidiyor() {
		super.aracgidiyor();
		System.out.println("Otomobil gidiyor!");
	}
	
	public void aracgidiyor(String marka) {
		super.aracgidiyor();
		System.out.println(marka+" markalı otomobil gidiyor!");
	}
}

class renault extends otomobil{
	public renault() {
		super();
		System.out.println("Bu bir Renault'dur!");
	}
	
	public void aracgidiyor() {
		super.aracgidiyor();
		System.out.println("Renault gidiyor!");
	}
}

public class genel {

	public static void main(String[] args) {
		renault a = new renault();
		a.aracgidiyor();
		a.aracgidiyor("Renault");
	}

}

// Dip not: "super" ifadeleri her zaman ilk komut olmak zorunda. Bu bir syntax kuralıdır. Bunun nedeni şudur "eğer bir üst classa ihtiyacın varsa ilk oraya git, sonra gel buraya işini hallet"
// "super" ifadesi bir üst constructor'a git demektir aslında.
//80->62->32->5->7->Bu bir motorlu taşıttır.
//34->Bu bir otomobildir
//64->Bu bir renault dur
//81->67->70->44->46->21->24->16->18->Motoru çalıştırdım!
//26->Motorlu araç gidiyor.
//47->Otomobil gidiyor!
//72->Renault gidiyor!
//82->53->55->21->24->16->18->Motoru çalıştırdım!
//26->Motorlu araç gidiyor
//56->Renault markalı otomobil gidiyor!
