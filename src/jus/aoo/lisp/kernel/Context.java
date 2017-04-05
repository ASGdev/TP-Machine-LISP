package jus.aoo.lisp.kernel;

import java.util.Map;
import java.util.TreeMap;

public class Context {
	public static TreeMap<Symbole, Sexpr> contexte = new TreeMap<Symbole, Sexpr>();
	public static Sexpr get(Symbole s) {	
		return contexte.get(s);
	}
	public static void bind(Sexpr f, Sexpr e) {
		
	}
	public static void unbind() {
		contexte.clear();		
	}
	public static void define (Symbole s, Sexpr exp) {
		contexte.put(s, exp);
	}

}
