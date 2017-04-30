package kernel;

import reader.jus.aoo.lisp.kernel.Reader;

public class Main {
	public Main(String[] args){
		System.out.println("Machine virtuelle LISP");
		
		try {
			Reader reader = new Reader(System.in);
		} catch(Exception e){
			System.out.println("Erreur lors de l'ouverture du parser :" + e.toString());
			System.exit(1);
		}
	
		System.out.println("TOPLEVEL lançé");
		
		while (true) {
			System.out.print(">");  
			String input = System.console().readLine();
			try {
				System.out.println(Reader.read(input).eval());  
			} catch (LispException e) { 
				System.out.println(e.toString());       
			} catch (Exception e) { 
				System.out.println("unexpectedException");
				e.printStackTrace();      
			} finally {}  
		} 
	
	}
}
