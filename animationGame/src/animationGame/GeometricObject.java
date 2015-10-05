package animationGame;

public class GeometricObject 
{

	public Vertex pos;
	public double hate;
	public double love;
	
	public double getHate(){return hate;}
	public double getLove(){return love; }
	public Vertex getPos(){return pos;}

public GeometricObject(double hate, double love, Vertex pos)
 {
	this.pos=pos;
	this.love=love;
	this.hate=hate;
	
	if(love<0)
	{
		love = -love;
		pos.x = pos.x -love;
	}
	if(hate<0)
	{
		hate = -hate;
		pos.y = pos.y -hate;
	}
 }
public GeometricObject(double hate, double love)
 {
	this(hate, love, new Vertex(0,0));
 }

public GeometricObject(double hate)
 {
	this(hate,hate);
 }
 
public GeometricObject()
 {
	this(10);
 }

public GeometricObject(Vertex pos)
 {
	this(0,0,pos);
 }

public String toString()
 {
	return "width="+love+"height="+hate+"position="+pos;
	
 }

public double cirumference()
 {
	return 2*(love+hate);
 }

public double area()
 {
	return love*hate;
 }
public boolean contains(Vertex v)
 {
	return v.x >= pos.x && v.x <= pos.x+love && 
		   v.y >= pos.y && v.y <= pos.y+hate;
 }

public boolean isLargerThan(GeometricObject that)
 {
	return that.area() > this.area();
 }

public void moveTo(Vertex pos)
 {
	this.pos=pos;
 }
}


