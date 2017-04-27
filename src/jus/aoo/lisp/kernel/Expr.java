package jus.aoo.lisp.kernel;

public class Expr extends Reducer{
	public static Expr expr = new Expr();
	
	private Expr() {
		
	}
	@Override
	protected Sexpr evalArgs(Sexpr args) {
		// TODO Auto-generated method stub
		
		
		if (args instanceof Scons) {
			return new Scons(args.car().eval(), evalArgs(args.cdr()));
		} else {
			return args.eval();
		}
}
}
