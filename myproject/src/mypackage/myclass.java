package mypackage;

public class myclass {
	int a = 40;
	public static void main(String args[]){
		//System.out.println(a);
		//print();
		print2();
		myclass myc = new myclass();
		myc.print();
		class2.print();
		class2 d = new class2();
		//d.print();
		myc.print();
	}
	public void print() {
		System.out.println(a);
	}
	
	public static void print2() {
		int b = 70; 
		System.out.println(b);
	
	}

}
class class2 {
	int a = 30;  //non static	

	public static void print() {
		int b = 30; 
		System.out.println(b);
	}
	
}

