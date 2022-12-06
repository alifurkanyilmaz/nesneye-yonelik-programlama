package Java2022;

class yaz{
	public void ekranaYaz(String s) {
		System.out.println(s);
	}

	public void ekranaYaz(int a) {
		System.out.println(a);
	}
	
	public void ekranaYaz(double a) {
		System.out.println(a);
	}
}

public class over {
	
	public static void main(String args []){
		
	yaz c = new yaz();
	c.ekranaYaz("Merhaba");
	c.ekranaYaz(2);
	c.ekranaYaz(3.14159);
		
	}
	
	
}

//Overloading Özelliği: İsmi aynı olan ancak parametre türü ve sırası farklı olan methodlar yazabilme özelliğidir.
//Nesneye dayalı projelerde classları zenginleştirmek için overloading tavsiye edilir.

//Constructorlar(Yapıcı method) da overload edilebilir.
