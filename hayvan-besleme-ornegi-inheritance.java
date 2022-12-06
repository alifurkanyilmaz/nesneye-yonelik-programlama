package Java2022;

class hayvan{
	public void beslen() {
		System.out.println("Hayvan besleniyor");
		
	}
}

class ayi extends hayvan{
	public void beslen(){
		System.out.println("Ayı grubu besleniyor");
	}
	
}

class panda extends ayi{
	
}



public class kalitim_ornek1 {

	public static void main(String[] args) {
		ayi ayi1 = new ayi();
		ayi1.beslen();
		
		panda panda1= new panda();
		panda1.beslen();

	}

}


// KATILIMIN ÜSTÜNLÜKLERİ (INHERITANCE)
// 1) Gerçek hayattaki gerçekliği yazılıma taşımak için zorunludur.
// 2) Daha önceden yazılmış olan classları kullanarak daha kolay yazılım geliştirebiliriz. Update ve upgrade işlemleri daha kolay yapılır.
// 3) Aşağıya doğru ve yatayda geri kalan classlara dokunmadan istediğimiz şekilde geliştirebiliriz. Bu da update ve upgrade işlemlerini kolaylaştırır. (Yukarıya doğru class ekleyemeyiz)
// 4) Polimorfizmin kullanılabilmesi için kalıtım zorunludur.


// Aşağıdan yukarıya çıktıkça genelleştirme olur, yukarıdan aşağıya indikçe özelleştirme. 
