package jus.aoo.lisp.kernel;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public class Context {
	private static Map<Symbole, Sexpr> contexte = new HashMap<Symbole, Sexpr>();
	private static Stack<Map<Symbole, Sexpr>> locales = new Stack<>();
	static {
		Symbole t = Symbole.newSymbole("t"); define(t,t);
		Symbole nil = Symbole.newSymbole("nil"); define(nil,Nil.NIL);
	}
	public static Sexpr get(Symbole s) {	
		return contexte.get(s);
	}
	public static void bind(Sexpr f, Sexpr e) {
		Map<Symbole, Sexpr> local =  new HashMap<Symbole, Sexpr>();
		locales.push(local);
		bind (local, f, e);
	}
	
	private static void bind(Map<Symbole, Sexpr> local, Sexpr f, Sexpr e) {
		if (f instanceof Nil && e instanceof Nil) { return; }
		if (f instanceof Nil || e instanceof Nil) { throw new LispException("bind impossible"); }
		if (f instanceof Symbole) {
			local.put((Symbole) f, contexte.get(f));
			contexte.put((Symbole) f, e);
			return;
		}
		throw new LispException("bind impossible");
	}
	public static void unbind() {
		Map<Symbole, Sexpr> local = locales.pop();
		for (Map.Entry<Symbole, Sexpr> e : local.entrySet()){
			if (e.getValue() == null){
				contexte.remove(e.getKey());
			}
			else {
				contexte.put(e.getKey(), e.getValue());
			}
		}
	}
	public static void define (Symbole s, Sexpr exp) {
		contexte.put(s, exp);
	}

}
