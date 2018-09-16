package mypackage;

//Examples of Data type
public class DataType {
	static int i;
	public static void main(String args[]) 
	{		
	//Miles light traveled in a specified number of days.
		int lightspeed;     long days;     long seconds;     long distance; 
		short hoursInDay = 24;
	 
    // approximate speed of light in miles per second     
	lightspeed = 186000; 
 
    days = 1000; // specify number of days here 
 
    seconds = days * hoursInDay * 60 * 60; // convert to seconds 
 
    distance = lightspeed * seconds; // compute distance 
 
    System.out.print("In " + days);     
    System.out.print(" days light will travel about ");     
    System.out.println(distance + " miles.");   
    
    //Examples of Double and float Type conversion
    double pi; 
    double a;
    float r;
    r = 10.8f; // radius of circle     
    pi = 3.1416; // pi, approximately 
    a = (int) (pi * r * r); // compute area 
    
    System.out.println("Area of circle is " + a); 
    
    //Character example
    char ch1, ch2; 
    
    ch1 = 88; // code for X     
    ch2 = 'Y'; 
 
    System.out.print("ch1 and ch2: ");     System.out.println(ch1 + " " + ch2); 
   
    //Boolean example
    boolean b; 
    
   
    b = true;    
    System.out.println("b is " + b); 
 
    // a boolean value can control the if statement    
    if(b) 
    System.out.println("This is executed."); 
    
    b=false;
    if(b)
    System.out.println("This is not executed");
    System.out.println("10 > 9 is " + (10 > 9)); 	
	
    //int i;
    
    int c = i+4;
    System.out.println(c);
	//Reference variable
    ReferenceType RT = new ReferenceType();
    System.out.println(RT.r);
	
	} 
	
}

class ReferenceType{
	int r = 100;
}
