package jus.aoo.lisp.kernel;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public class Context {
	private static Map<Symbole, Sexpr> contexte = new HashMap<Symbole, Sexpr>();
	private static Stack<Map<Symbole, Sexpr>> locales = new Stack<Map<Symbole,Sexpr>>();
	static {
		Symbole t = Symbole.newSymbole("t"); define(t,t);
		Symbole j = Symbole.newSymbole("j"); define(j,j);

		Symbole nil = Symbole.newSymbole("nil"); define(nil,Nil.NIL);
		Symbole car = Symbole.newSymbole("car"); define(car,CAR.car);
		Symbole cdr = Symbole.newSymbole("cdr"); define(cdr,CDR.cdr);
		Symbole cns = Symbole.newSymbole("cons"); define(cns, Cons.cons);
		Symbole de = Symbole.newSymbole("de"); define(de,De.DE);
		Symbole df = Symbole.newSymbole("df"); define(df,Df.DF);
		Symbole load = Symbole.newSymbole("load"); define(load,Load.LOAD);





	}
	
	private Context(){
		
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
		if (f.isNil()&& e.isNil()) { return; }
		if (f.isNil() || e.isNil()) { throw new LispException("bind impossible"); }
		if (f instanceof Symbole) {
			local.put((Symbole) f, contexte.get(f));
			contexte.put((Symbole) f, e);
			return;
		}
		//throw new LispException("bind impossible");
		
		bind(local,f.car(),e.car());
		bind(local,f.cdr(),e.cdr());
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
