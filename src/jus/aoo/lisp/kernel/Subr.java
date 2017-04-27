package jus.aoo.lisp.kernel;

public abstract class Subr extends Primitive {

	//public static Subr subr = new Subr();
	@Override
	protected Sexpr evalArgs(Sexpr args) {
		// TODO Auto-generated method stub
		//return args.eval();
		if (args instanceof Scons) {
			return new Scons(args.car().eval(), evalArgs(args.cdr()));
		} else {
			return args.eval();
		}
		
	}

	
/*	public Subr car(){
		return null;
	}
	
	public Subr cdr(){
		return null;
	}
	
	*/
}
