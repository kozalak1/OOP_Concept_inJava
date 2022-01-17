package interface_;

public class EncapsulationRunner {

	public static void main(String[] args) {
		
		/*
		Students std1=new Students();
		System.out.println(std1.getName()); // John Nash -- private olan ismi getter ile gördük
		
		std1.setName("Michel Cash");
		System.out.println(std1.getName()); // Michel Cash -- name in değerini değiştirdik, ancak değişiklik sadece std1 OBJESİ ile sınırlı, asıl değer değişmedi

		System.out.println(std1.getAge()); 			// 34
		
		System.out.println(std1.isMarried());		//true
	
	*/
				
	//	Students std2=new Students(); // parametre atamadıgımız için CTE veriyor.
		
		Students std3=new Students("ali kel", 44, false);
		System.out.println(std3);	// Students: name=ali kel, age=44, isMarried=false
		
		Students std4=new Students("kemal can", 51, true);
		System.out.println(std4);	// Students: name=kemal can, age=51, isMarried=true
		
		// yukarıdaki örneklerde her yeni obje için(her öğrenci için) yeni ve farklı bir object (std3 , std4, ....) üretmemiz gerekiyor, eğer binlerce kişi kaydedeceksek bu işlem hem ram de çok yer tutar hem de çok zaman ve emek alır. 
		
		
		// aşağıdaki yöntem ise , en kısa ve en pratik yoldur:
		// encapsulation ile tek obje ureterek ; setter metodu ile defalarca görev yapabiliriz
		
		Students std=new Students(); 	 // önce Students class ında parametresiz bir constructor oluşturduk
										// her öğrenci geldiğinde "setter" metodu ile "std" objesinden value leri değiştirerek database e kaydederiz.
										// bu şekilde sadece 1 object oluşturarark binlerce kişiyi database e kaydedebiliriz.
		std.setName("hasan ay");
		std.setAge(19);
		std.setMarried(false);
		System.out.println(std); // Students: name=hasan ay, age=19, isMarried=false
		// kaydet
		
		std.setName("cem can");
		std.setAge(22);
		std.setMarried(true);
		System.out.println(std); // Students: name=cem can, age=22, isMarried=true
		
	}

		
}
