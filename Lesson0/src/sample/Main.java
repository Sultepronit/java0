package sample;

public class Main {
	
	static void Train() {
		System.out.println("Hello world!");
		
		//about public & static
		//System.out.println( GiveNumber() );
		Second obj = new Second();
		//obj.GiveRe();
		System.out.println( obj.GiveRe() );
		//System.out.println( GiveNumber() );
		//System.out.println( obj.GiveNumber() );
		System.out.println( obj.GiveDou() );
	}

	public static void main(String[] args) {
		//Train();
		//about method overloading
		ToString2 St = new ToString2();
		String re;
		//re = St.Make(false);
		//re = St.Make(33);
		re = St.Make(33.0);
		System.out.println(re);
	}

}
