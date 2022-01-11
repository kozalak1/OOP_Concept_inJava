package interface_;

import java.lang.WeakPairMap.Pair.Weak;

public class Students {

	/*
	 *Encapsulation means DATA-HIDING. 
	 *We use "private" keyboard.
	 */
	
	
	private String name="John Nash";
	
	private int age=34;
	
	private boolean isMarried=true;

	public Students(String name, int age, boolean isMarried) {
		this.name = name;
		this.age = age;
		this.isMarried = isMarried;
	}

	public String getName() { 		// getName() is called "getter". Getter is for reading data. getter metodları parametre içermez; BİR DEĞER döndürür; ayrıca return type ları da data type dır
		return name;
	}

	public void setName(String name) {		// // setName() is called "setter". Setter is for updating data in usage; NOT THIS CLASS ! bir değer değiştirdiği için setter metodları parametre içerir
		this.name = name;							// return type i hep void olur. bir değer döndürmez; verilen değeri değiştirir, orada kalır.
													// Setter metodu ile degeri obje ile değiştirdiğimizde buradaki değer değişmez,
	}												

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isMarried() {
		return isMarried;
	}

	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}

	
	
	
}
