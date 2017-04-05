package jus.aoo.lisp.kernel;

public class Nil extends Atome implements Liste {
	public static Nil nil;
	public Nil() {
		
	}
	public String toString() {
		return "Nil";
	}
	
	public Sexpr eval() {
		return null;
	}
	
	public static Nil getNil() {
		return nil;
	}
}
