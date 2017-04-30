package jus.aoo.lisp.kernel;

import java.io.FileNotFoundException;

public class TopLevel {

	  public static void main(String[] args) throws LispException, ParseException{
		    String quit = "";

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
		                quit = s.toString();
		                if (quit.equals("quit")) {
		                        break;
		                }
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
