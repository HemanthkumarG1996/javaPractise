// Debug the given code
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int length, width;
        int area;
        Scanner scanner = new Scanner(System.in);
        length = scanner.nextInt();
        width = scanner.nextInt();
        
        area = length * width;
        System.out.print("Area of the rectangle is:");
        System.out.println(area); 
	}
}

