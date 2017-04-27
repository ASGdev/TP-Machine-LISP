package jus.aoo.lisp.kernel;

public class Scons implements Liste {
	private Sexpr car;
	private Sexpr cdr;
	public Scons(Sexpr s1, Sexpr s2) {
		car = s1;
		cdr = s2;
	}
	
	
	public String toString() {

	 return "("+ toString(this) +")";
	}
	
	public String toString(Sexpr s) {
		if(s.cdr() instanceof  Nil) {return s.car().toString();}
		if (s.cdr() instanceof Atome) {
			return s.car().toString() + " . " + s.cdr().toString();
		}
		
			 return  s.car().toString() + " " + toString(s.cdr());


		}

	
	public Sexpr eval() {
		Sexpr fct = car().eval();
		if (fct instanceof Primitive) {return ((_Reducer) fct).reduction(fct, cdr);}
		if (fct instanceof Atome) { throw new LispException("fonction incorrecte");}
		if (fct.car()==Symbole.newSymbole("lambda")) {return Expr.expr.reduction(fct, cdr);}
		if (fct.car()==Symbole.newSymbole("flambda")) {return Fexpr.fexpr.reduction(fct, cdr);}
		throw new LispException("eval impossible");

	}


	@Override
	public Sexpr car() {
		// TODO Auto-generated method stub
		return car;
	}


	@Override
	public Sexpr cdr() {
		// TODO Auto-generated method stub
		return cdr;
	}
}
