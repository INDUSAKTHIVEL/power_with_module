package Power_module;

import java.util.*;

public class Module {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		double out=Math.pow(a,b)%c;
		System.out.println(out);

	}

}
