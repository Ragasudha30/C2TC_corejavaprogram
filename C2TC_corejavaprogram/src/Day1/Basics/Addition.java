package Day1.Basics;
import java.util.*;
public class Addition {

	public static void main(String[] args) {
       /* int a,b,c;
        a=Integer.parseInt(args[0]);
        b=Integer.parseInt(args[1]);
        c=a+b;
        System.out.println("Addition of a="+a+" and b="+b+" is "+c);
	}*/
	int a,b,c;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the value:");
	a=s.nextInt();
	b=s.nextInt();
	c=a+b;
	System.out.println("Addition of a="+a+" and b="+b+" is "+c);
}
}
