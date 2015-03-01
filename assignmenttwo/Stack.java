package assignmenttwo;

public class Stack 
{
	private Node head;
	private int count;
	
	public Stack()
	{
		this.head = null;
		this.count = 0;
	}
	
	public boolean isEmpty()
	{
		return this.head == null;
	}
	
	public void push(int payload)
	{
		Node n = new Node(payload);
		if(this.head == null)
		{
			this.head = n;
			
		}
		else
		{
			n.setNextNode(this.head);
			this.head = n;
		}
		this.count++;
	}
	
	public int pop() throws Exception
	{
		if(this.head == null)
		{
			throw new Exception("Emtpy Stack!!!  Cry More");
		}
		else
		{
			int valToReturn = this.head.getPayload();
			this.head = this.head.getNextNode();
			return valToReturn;
		}
	}
	
	public int peek() throws Exception
	{
		if (this.head == null)
		{
			throw new Exception("Empty Stack!");
		}
		else
		{
			return this.head.getPayload();
		}
	}
	
}
