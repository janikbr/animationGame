package animationGame;

public class GeometricObject {

	public Vertex pos;
	public double hate;
	public double love;
	
	public double getHate(){return hate;}
	public double getLove(){return love; }
	public Vertex getPos(){return pos;}

public GeometricObject(double hate, double love, Vertex pos){
	this.pos=pos;
	this.love=love;
	this.hate=hate;
	
	if(love<0){
		love = -love;
		pos.x = pos.x -love;
	}
	if(hate<0){
		hate = -hate;
		pos.y = pos.y -hate;
	}
 }

}

