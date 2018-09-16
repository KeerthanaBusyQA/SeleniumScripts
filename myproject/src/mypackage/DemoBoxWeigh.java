package mypackage;

class Box {
	// This program uses inheritance to extend Box. 
   double width;   
   double height;   
   double depth;
	 
	  // constructor used when all dimensions specified   
   Box(double w, double h, double d) {     
		width = w;     
		height = h;     
		depth = d;   } 
	 
	 // constructor used when no dimensions specified   
   Box() {     
		width = -1;  // use  -1 to indicate     
		height = -1; // an uninitialized     
		depth = -1;  // box   } 	 
	}
	  // compute and return volume   
	double volume() {     
		return width * height * depth;   } } 
	 
	// Here, Box is extended to include weight. 
	class BoxWeight extends Box { 
		double weight; // weight of box 
		  // constructor for BoxWeight   
		BoxWeight(double w, double h, double d, double m) 
		{
		width = w;     
		height = h;     
		depth = d;     
		weight = m;
		} 
		} 
	public class DemoBoxWeigh {
		public static void main(String args[]) {     
			BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
			Box box = new Box();
			double vol; 
	 
	//A Superclass Variable Can Reference a Subclass Object		
			box = mybox1;
			box.volume();
			//box.weight;
	    vol = mybox1.volume();     
	    System.out.println("Volume of mybox1 is " + vol);    
	    System.out.println("Weight of mybox1 is " + mybox1.weight);     
	    System.out.println(); 
	    } 
	}