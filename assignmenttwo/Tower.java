package assignmenttwo;



import java.util.Stack;


public class Tower extends Stack<Disc>
{	
	public Tower()
	{
		super();
	}
	
	public Disc removeDisc()
	{
		return this.pop();
	}
	
	public boolean addDisc(Disc d)
	{
		if(this.size() == 0 || d.getSize() < this.peek().getSize())
		{
			this.push(d);
			return true;
		}
		return false;
	}
	
	public void display()
	{
		System.out.println(this.toString());
	}
}