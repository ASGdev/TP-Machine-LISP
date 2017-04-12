package jus.aoo.lisp.kernel;

public interface Sexpr {
	public Sexpr car();
	public Sexpr cdr();
	public Sexpr eval();
}
