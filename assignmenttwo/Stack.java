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
	
	public void push(int payload)
	{
		Node n = new Node(payload);
		if(head == null)
		{
			this.head = n;
			
		}
		else
		{
			n.setNextNode(head);
			head.setPrevNode(n);
			this.head = n;
		}
		this.count++;
	}
	
	public int pop() throws Exception
	{
		if(head == null)
		{
			throw new Exception("Can Not Remove Front: Empty List");
		}
		else if(this.count == 1)
		{
			int payloadToReturn = this.head.getPayload();
			this.head = null;
			this.count = 0;
			return payloadToReturn;
		}
		Node currNode = head; 
		head = head.getNextNode(); 
		head.setPrevNode(null);
		currNode.setNextNode(null);
		this.count--;
		return currNode.getPayload();
	}
	
	public int peek()
	{
		Node curr = head;
		if (head == null)
		{
			System.out.println("Empty Stack");
			return -1;
		}
		else
		{
			System.out.println(curr.getPayload());
			return curr.getPayload();
		}
	}
	
}
