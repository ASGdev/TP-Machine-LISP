package jus.aoo.lisp.kernel;

import java.io.FileNotFoundException;
import java.util.Map;

public class TopLevel {

	  public static void main(String[] args) throws LispException, ParseException{
		    String test_fct = "";

		    try {
		                        Reader.importe("boot.ll");
		                } catch (LispException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                } catch (FileNotFoundException e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                }       while (true) {
		                System.out.print(" >");
		                Sexpr s = Reader.read();
		                test_fct = s.toString();
		                if (test_fct.equals("quit")) {
		                        break;
		                } else if (test_fct.equals("scope")) {
		            		System.out.println("Affichage du contexte : \n");
		            		for (Map.Entry<Symbole, Sexpr> e : Context.getContexte().entrySet()){
		            			System.out.println(e.getKey().toString() + " = " + e.getValue().toString());
		            		}
		            		System.out.println("\n");

		                } else {
		    		        System.out.println("evaluation de : "+s);

		    		        try {
		    		        s = s.eval();
		    		        } catch (LispException e) {
		    		                        System.out.println(e.getMessage());
		    		                }
		    		        System.out.println(s);
		                }


		                }

		}

}
