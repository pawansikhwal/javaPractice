package practice;

public class OverridingPractice {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		int b=2;
		Integer c= Integer.valueOf('a');
		double d= 12.0;
		float e = 12.0f;
		String f=null;
		String g="pawan";
		
		check(a,b);
		check(a,c);
		check(a,d);
		check(a, e);
		check(f, g);
		check(1,2);
//		checkVarArg(1,2,3,4);
		
	}
	private static void check(int... a) {
		System.out.println("var args");
		// TODO Auto-generated method stub
		System.out.println(a);
		for(int i: a) {
			System.out.println(i);
		}
	}

	private static void check(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+b);
	}
	private static void check(int a, long b) {
		// TODO Auto-generated method stub
		System.out.println("long and int");
		System.out.println(a+b);
	}
	private static void check(int a, double b) {
		// TODO Auto-generated method stub
		System.out.println("double and int");
		System.out.println(a+b);
	}
	
	private static void check(int a, float b) {
		// TODO Auto-generated method stub
		System.out.println("float and int");
		System.out.println(a+b);
	}
	private static void check(String a,String b) {
		// TODO Auto-generated method stub
		System.out.println("String and String");
		System.out.println(a+b);
	}
	

}
