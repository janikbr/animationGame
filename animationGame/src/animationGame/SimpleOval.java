package animationGame;
public class SimpleOval extends GeometricObject {

	public SimpleOval(double w, double h, Vertex pos){
		super(w,h,pos);
	}
	
	@Override public double area(){return Math.PI*love*hate/4;}
	
	@Override public String toString(){
		return "SimpleOval("+super.toString()+")";
	}
	@Override public boolean equals(Object that){
		return (that instanceof SimpleOval) && 
				super.equals(that);
	}
	
}
