package demo;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		//this.foo();
//		
//		MyInterface myOtherPtr = new MyInterface() {
//			
//			int x = 10;
//			
//			@Override
//			public void blaBlupp() {
//				System.out.println("Alt!");
//				
//			}
//		};
//		
//		myOtherPtr.blaBlupp();
//		
//		MyInterface myFuncPtr = this::foo;
//		myFuncPtr.blaBlupp();
		
		// Lambda-Funktion
		MyInterface myFptr = /* Kein Name */ () -> {System.out.println("Hier ist Arno Nym");};
		
		myFptr.blaBlupp();
		
		//MyOtherInterface myOtherPtr = this::irgendEinenNamen;
		MyOtherInterface myOtherInterface = (int x) -> {
			return x * x;
		};
		
		MyOtherInterface myOtherPtr = x ->  x * x  ;
		System.out.println(myOtherPtr.power(3));
	}
	
	private void foo() {
		System.out.println("Hier ist foo");
	}
	
	private long irgendEinenNamen(int x) {
		return x * x;
	}

}

@FunctionalInterface
interface MyInterface {
	
	void blaBlupp();
	
}


interface MyOtherInterface {
	long power(int x);
}


