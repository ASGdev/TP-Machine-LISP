package jus.aoo.lisp.kernel;

public class Print extends Subr {
	public static Print pnt = new Print();


	public Print() {
		// TODO Auto-generated constructor stub
	}
	
	private String chaine_args(Sexpr s) {
		if (s.isNil()) {
			return " ";
		} else {
			return " ".concat(s.car().toString().concat(chaine_args(s.cdr())));
		}
	}

	@Override
	public Sexpr apply(Sexpr fct, Sexpr argList) {
		// TODO Auto-generated method stub
		System.out.println(chaine_args(argList));
		//System.out.println(argList.car().toString());
		return Symbole.newSymbole("t");
	}

}
