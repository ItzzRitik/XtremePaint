package src;

public class Fill_Curve extends CharObject
{
	private int xZiel;int staerke;
	private int yZiel;
	public int getStaerke() 
	{
		return staerke;
	}
	public void setStaerke(int staerke) 
	{
		this.staerke = staerke;
	}
	public Fill_Curve(int x, int y)
	{
		super(x,y);
	}
	public int getXZiel() 
	{
		return xZiel;
	}
	public void setXZiel(int ziel) 
	{
		xZiel = ziel;
	}
	public int getYZiel() 
	{
		return yZiel;
	}
	public void setYZiel(int ziel) 
	{
		yZiel = ziel;
	}
}
