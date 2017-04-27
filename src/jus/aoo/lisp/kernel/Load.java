package jus.aoo.lisp.kernel;

import java.io.FileNotFoundException;

public class Load extends Fsubr {

	public static Load LOAD = new Load();
	
	@Override
	public Sexpr apply(Sexpr fct, Sexpr argList) {
		try {
			Reader.importe(argList.car().toString());
			return argList.car();
		} catch (LispException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return argList;
	}

}


	

