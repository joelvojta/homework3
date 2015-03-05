package assignmenttwo;



import java.util.Scanner;

public class Tower 

{
	private Tower t;
	private Tower t2;
	private Tower t3;
	private Disc top;
	
	public Tower()
	{
		top = null;
		this.t = new Tower();
		this.t2 = new Tower();
		this.t3 = new Tower();
	}
	
	public Disc peek()
	{
		return top;
	}
	
	//homework start
/**	
	public void on() throws Exception
	{
		Scanner input = new Scanner(System.in);
		t.addDisc(new Disc(3));
		t.addDisc(new Disc(2));
		t.addDisc(new Disc(1));
		while(true)
		{
			System.out.print("=> ");
			String val = input.nextLine().trim();
			if(val.equalsIgnoreCase("quit"))
			{
				break;
			}
			else if(val.equalsIgnoreCase("show"))
			{
				/**
			    System.out.println(game);
				Tower temp = new Tower();
				while(!this.theStack.isEmpty())
				{
					temp.push(this.theStack.pop());
				}
				while(!temp.isEmpty())
				{
					int num = temp.pop();
					System.out.println(num);
					this.theStack.push(num);
				}
				
				Disc curr = this.top;
				do
				{
					//System.out.println(curr.getSize());
					curr = curr.getNextDisc();
				}
				while(curr != null);
				
			}
		}
		//else
		{
			System.out.println("Illegal Input");
		}
	}

	
	//public Disc move
	
	
	
	
	
	

	
	*/
	//homework end
	
	public Disc removeDisc()
	{
		Disc nodeToReturn = top;
		if(this.top != null)
		{
			top = top.getNextDisc();
		}
		return nodeToReturn;
	}
	
	public boolean addDisc(Disc d)
	{
		if(this.top == null)
		{
			top = d;
			return true;
		}
		else if(d.getSize() < this.peek().getSize())
		{
			d.setNextDisc(top);
			top = d;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void display()
	{
		if(this.top == null)
		{
			System.out.println("Empty Tower");
		}
		else
		{
			Disc curr = this.top;
			do
			{
				System.out.println(curr.getSize());
				curr = curr.getNextDisc();
			}
			while(curr != null);
		}
		
	}
}