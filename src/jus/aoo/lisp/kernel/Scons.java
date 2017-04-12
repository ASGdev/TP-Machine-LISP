package jus.aoo.lisp.kernel;

public class Scons implements Liste {
	Sexpr car;
	Sexpr cdr;
	public Scons(Sexpr s1, Sexpr s2) {
		car = s1;
		cdr = s2;
	}
	
	public String toString() {
	 return car.toString() + " " + cdr.toString();
	}
	public Sexpr eval() {
		return null;
	}
}
