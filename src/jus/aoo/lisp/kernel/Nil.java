package jus.aoo.lisp.kernel;

public class Nil extends Atome implements Liste {
	public static Nil NIL= new Nil();
	public Nil() {
		
	}
	public String toString() {
		return "()";
	}
	
	public Sexpr eval() {
		return null;
	}
	
	public static Nil getNil() {
		return NIL;
	}
	@Override
	public Sexpr car() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Sexpr cdr() {
		// TODO Auto-generated method stub
		return null;
	}
}
