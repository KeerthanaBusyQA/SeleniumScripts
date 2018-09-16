package mypackage;

public class Operators {
	public static void main(String args[]) 
	{
		// arithmetic using doubles     +, -, *, /, %, ++(increment), --(decrement)
		System.out.println("\nFloating Point Arithmetic");    
		double da = 1 + 1;     
		double db = da * 3;     
		double dc = db / 4;     
		double dd = dc - da;     
		double de = -dd;     
		System.out.println("da = " + da);    
		System.out.println("db = " + db);     
		System.out.println("dc = " + dc);     
		System.out.println("dd = " + dd);     
		System.out.println("de = " + de); 
		
		//The Modulus Operator
		 int x = 42;     double y = 42.25; 
		 
		 System.out.println("x mod 10 = " + x % 10);    
		 System.out.println("y mod 10 = " + y % 10);
		
		 //Arithmetic Compound Assignment Operators
		 System.out.println(da);
		da += 4;
		System.out.println("after adding 4 "+ da);
		da %= 2;
		System.out.println("After mod 4 "+ da);
		
		//Increment and decrement
		int m = 1;     
		int n = 2;     
		int o;     int p;     
		o = ++n;
		System.out.println("oa = " + o);
		System.out.println("n = " + n);
		p = m++;     
		o++;     
		System.out.println("a = " + m);    
		System.out.println("b = " + n);    
		System.out.println("o = " + o);     
		System.out.println("p = " + p);
		
		//Relational operators == (equal to), !=(not equal to), >(greater than), <(less than),  >=, <=
		int x1 = 4; 
		int y1 = 1; 
		boolean z = x1 < y1;
		System.out.println("z = " + z); 
		
		//Bitwise Operators Assignment
		
		//Logical operators && (logical AND), II (logical OR),! (logical not)
		 boolean a = true;     
		 boolean b = false;     
		 boolean c = a | b;     
		 boolean d = b & a; 
		 boolean e = a ^ b;     
		 boolean f = (!a & b) | (a & !b);     
		 boolean g = !a;
		 boolean h = b&&a;
		 boolean i = a||b;
		 System.out.println("        a = " + a);     
		 System.out.println("        b = " + b);     
		 System.out.println("      a|b = " + c);     
		 System.out.println("      b&a = " + d);     
		 System.out.println("      a^b = " + e);     
		 System.out.println("!a&b|a&!b = " + f);     
		 System.out.println("       !a = " + g); 
		 System.out.println("     b&&a = " + h);
		 System.out.println("     a||b = " + i);
	}
}
