class Main {

	public static int fatorial(int n) {
		int resultado = 1; 
		
		for(int i = n; i >= 1; i--) {
			resultado *= i;	
		}		
		
		return resultado; 	
	}

	public static void main(String Args[]) {
		/*
		System.out.println("Hello");
		
		for (int i = 150; i < 301; i++) {
			System.out.println(i);
		}
		
		System.out.println("---");
		
		int soma = 0; 
		for (int i = 1; soma < 1000; i++) {
			soma += i; 
			System.out.printf("%d, %d\n", i, soma); 		
		}
		
		System.out.println("---");		

		for (int i = 1; i < 100; i++) {
			if (i % 3 == 0) {
				System.out.println(i);			
			}		
		}
		*/
		
		for (int i = 1; i < 10; i++ ) {
			System.out.println( fatorial(i) );		
		}

		
				 	
	}
}
