package mypackage;

public class ControlStmt {
	public static void main(String args[]) 
	{
	//if loop
	int a, b; 
	a=1;
	b=4;
	if(a < b) 
		a = 0; 
	else b = 0;
	System.out.println("a="+a+" b="+b);
	
	// Nested if
	
	int i,j,k,c,d,e,x,y;
	//i=10;j=19;k=122;c=4;d=5;e=7;x=0;y=9;
	//i=10;j=19;k=22;c=4;d=5;e=7;x=0;y=9;
	i=89;j=19;k=22;c=4;d=5;e=7;x=0;y=9;
	if(i == 10) 
	{   
		if(j < 20) 
			x = y;   
		if(k > 100) 
			c = d; // this if is   
		else c = 1;        // associated with this else 
		} 
	else x = e;          // this else refers to if(i == 10)
	System.out.println("x="+x+"c="+c);
	
	//class assignment - Find greatest in 3 digits
	
	
	//While loop
	int n = -1; 
	 
    while(n >= 0) {       
    	System.out.println("tick " + n);       
    	n--;     }
    
	//Do While loop 
	int m = -1; 
	 
	    do {       
	    	System.out.println("tick " + m);       
	    	m--; 
	    	System.out.println(m);
	    	} while(m > 0); 
	
	
	//For loop
	for(int p=10; p>0; p--)       
		System.out.println("tick " + p); 
	
	//CA - // Program to find the sum of natural numbers from 1 to 1000
	}
}
