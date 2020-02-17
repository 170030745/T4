
public class T4 {
	public double sinterest(double p,double t,double r)
	{
		return ((p*t*r)/100);
	}
	public float cinterest(float p,float T,float R,float N)
	{
		return (float) (p*Math.pow((1+R/N),N*T));
	}
}
