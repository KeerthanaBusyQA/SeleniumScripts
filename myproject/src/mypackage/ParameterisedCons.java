package mypackage;

public class ParameterisedCons {
	private int l;
	private int width;
	private String stringA;
	
	public ParameterisedCons(){
		System.out.println("I am the default constructor");
	}
	
	public ParameterisedCons(int l, int w){
		this.l = l;
		width = w;
		System.out.println("I am the parameterised constructor");
	}
	public ParameterisedCons(String str){
		this.stringA = str;
		System.out.println(str);
	}
	public static void main(String[] args) {
		ParameterisedCons pc1=new ParameterisedCons();
		ParameterisedCons pc2=new ParameterisedCons(2,3);
		System.out.println(pc2.l);
		System.out.println(pc2.width);
		ParameterisedCons pc3=new ParameterisedCons("Hello Class!");
		System.out.println(pc3.stringA);
		}
}
