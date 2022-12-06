package Java2022;

class bitki{
	protected void beslen() {}
	private void buyu() {}
	protected void nefesAl() {
		System.out.println("Bitki Nefes Alıyor!");
	}
}

class agac extends bitki{
	protected void beslen() {}
	void buyu() {}
	protected void nefesAl(String agacTuru) {
		System.out.println(agacTuru+" Nefes Alıyor!");
	}
}

public class overriding {

	public static void main(String[] args) {
		agac a = new agac();
		a.nefesAl();
		a.nefesAl("Çam");

	}

}

//Overriding: Kalıtım hiyerarşisinde yukarıda bulunan bir classın içindeki methodun yerini alan bir method aşağıdaki classların içine yazılandır.

//Overriding yaparken aşağıya doğru erişim hakkını kısıtlayamazsınız.
