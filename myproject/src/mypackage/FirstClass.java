package mypackage;

import java.io.IOException;
import java.util.Scanner;

public class FirstClass  {
public static void main (String[] args) throws IOException {
	System.out.println("please give first number");
	Scanner s = new Scanner(System.in);
	int x= s.nextInt();
	System.out.println("please give second number");
	int y= s.nextInt();
	int z = x+y;
	System.out.println("Addition is" + z);
}
}
