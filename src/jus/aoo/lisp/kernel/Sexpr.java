package jus.aoo.lisp.kernel;

public interface Sexpr {
	public Sexpr car();
	public Sexpr cdr();
	public Sexpr eval();
	public boolean isPrimitive();
	public boolean equals(Sexpr s);
	public boolean isNil();

	public boolean isAtome();
}
