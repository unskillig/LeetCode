
public class Fibonacci {

	public static int fibonacciRekursiv(int zahl) {

		if (zahl == 1)
			return 0;
		if (zahl == 2)
			return 1;
		return fibonacciRekursiv(zahl - 1) + fibonacciRekursiv(zahl - 2);
	}
	
	
	public static int fibonacciLoop(int stelle){
		
		int result = 0, next = 1, prev = 0;
		
		if(stelle == 0) {
			System.out.println("Ungültig.");
			return 1;
		}
		
		if(stelle == 1){
			System.out.println(next);
			return 1;
		}
		
		System.out.println(prev);
		System.out.println(next);
		
		for(int i = 2; i < stelle; i++){
			result = prev+next;
			prev = next;
			next = result;
			System.out.println(result);
			
			
		}
		
		
		
		
		return result;
	}
	
	

	public static void main(String[] args) {

		fibonacciLoop(7);
	}

}
