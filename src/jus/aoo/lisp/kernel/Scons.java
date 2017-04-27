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
		if(s == Nil.NIL) {
			return "";
		}
		if (s.cdr()!=Nil.NIL) {
			 return  s.car().toString() + " " + toString(s.cdr());

		} else {
			 return  s.car().toString();

		}
		}

	
	public Sexpr eval() {
		return null;
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
