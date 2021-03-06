package interface_;

public interface Vehicle {

	public default void move() {
		
		System.out.println("All vehicles move ...");
	}

	public static void staticMove() {
		
		System.out.println("All vehicles move statically ...");
	}
	
}

/* 
 * interface is not class. 
 * Interface is the fully abstraction. so, all variables in an interface are public, static(class) and final as default.
 * interfaceden obje üretilemez, constructor a sahip değildir. Abstract class larda const. vardır; ancak, oradaki const. ile obje üretilemez.
 * ABSTRAC CLASS lar çok buyuk olacagı için Java interface i geliştirmiştir. bu nedenle, interface, multiple parents e izin verir. multiple inheritance a gerek yoksa ABSTRACT yeterlidir.
 * Concrete and Abstract Class can not to be parent of an interface.
 * interface'deki butun metodlar da abstract olmak zorunda.
 *  
 * */
 