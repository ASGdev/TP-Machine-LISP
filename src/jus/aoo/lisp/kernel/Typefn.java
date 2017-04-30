package jus.aoo.lisp.kernel;

public class Typefn extends Subr {
	
	public static Typefn tfn = new Typefn();

	public Typefn() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Sexpr apply(Sexpr fct, Sexpr argList) {
		// TODO Auto-generated method stub
		System.out.println(argList.car().getClass().getSuperclass().getName());
		return Symbole.newSymbole("t");
	}

}
