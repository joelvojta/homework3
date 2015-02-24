package assignmenttwo;

public class LinkedList 
{
	private Node head;
	private Node tail;
	private int count;
	
	
	public LinkedList()
	{
		this.head = null;
		this.count = 0;
		this.tail = null;
	}
	
	public int get(int index)
	{
		int count = this.count();
		if(index >= count || index < 0)
		{
			System.out.println("Illegal Index");
			return -1;
		}
		else
		{
			Node curr = head;
			for(int i = 0; i < index; i++)
			{
				curr = curr.getNextNode();
			}
			return curr.getPayload();
		}
	}
	
	public int count()
	{
		return this.count;
	}
	
	public void display()
	{
		if(head == null)
		{
			System.out.println("Empty List");
		}
		else
		{
			Node currNode = this.head;
			while(currNode.getNextNode() != null)
			{
				System.out.print(currNode.getPayload() + "->");
				currNode = currNode.getNextNode();
			}
			System.out.println(currNode.getPayload() + "-> null");
		}
	}
	
	public void displayInReverse()
	{
		Node n = this.tail;
		for(int i = 0; i < count; i++)
		{
			System.out.print(n.getPayload()); // find the end
			System.out.print("->");   // add an arrow
			n = n.getPrevNode();  // n is now the previous node
		}
		System.out.print(" null");
	}
	
	public void addAtIndex(int payload, int index)
	{
		
		if(index <= 0)
		{
			this.addFront(payload);
		}
		
		else if(index >= count)
		{
			this.addEnd(payload);
		}
		else
		{

			Node n = new Node(payload); //create node for payload
			Node prevNode = null;  //create node for previous node
			Node currNode = this.head;  //get a node made for traveling the list
			for(int i = 0; i < index; i++)
			//i=1, i less than total number of positions and the next node is 
			//occupied, add to i
			{
				prevNode = currNode; // set prevNode to current Node so it retains the value
				currNode = currNode.getNextNode();
			//current spot -> to next spot,  we traverse the linkedlist until 
			//we get to specified spot
			}
			n.setNextNode(currNode);  
			//the node containing the new value moves the current node aside
			n.setPrevNode(prevNode);  // prevNode remembers the old currNode
			currNode.setPrevNode(n); //we set the current node as n
			prevNode.setNextNode(n); // setting final prevNode
			this.count++;  //add to count
		}
		
	}
	

	
	public void addFront(int payload)
	{
		Node n = new Node(payload);
		if(head == null)
		{
			this.head = n;
			this.tail = n;
		}
		else
		{
			n.setNextNode(head);
			head.setPrevNode(n);
			this.head = n;
		}
		this.count++;
	}
	
	public void addEnd(int payload)
	{
		Node n = new Node(payload);
		if(this.head == null)
		{
			this.head = n;
		}
		else
		{
			this.tail.setNextNode(n);
			n.setPrevNode(tail);
		}
		this.tail = n;
		this.count++;
	}
	

	
	public int removeAtIndex(int index) throws Exception
	{
		//add different catches for user errors
		if(head==null)
		{
			throw new Exception("Cannot Remove from Index: Empty List");
		}	
		else if(this.count==1)
		{
			return this.removeFront();
		}
		else if(index >= count)
		{
			throw new Exception("Cannot Remove from Index: Index too Large");
		}
		else if(index < 0)
		{
			throw new Exception("Cannot Remove from Index: Index Must be Greater than Zero");
		}
		else if(index == count -1)
		{
			return this.removeEnd();
		}
		else
		{
			Node currLead = null;  //leader is null
			Node target = this.head; //target is first on the list
			for(int i = 0; i < index; i++)  //traverse the list
			{
				currLead = target; // looks like "currLead -> target" as they move from left to right
				target = target.getNextNode();
			}
			int payload = target.getPayload();   //finds int at target, saves it at payload
			currLead.setNextNode(target.getNextNode()); //currLead sets itself as the node to the right of target
			target.setPrevNode(null);  //the node to the left of target is now null
			(target.getNextNode()).setPrevNode(currLead); // target is now currLead
			target.setNextNode(null); //Node next to target is null
			this.count--;
			return payload;
		}
}
	

	
	public int removeEnd() throws Exception
	{
		if(head == null)
		{
			throw new Exception("Can Not Remove End: Empty List");
		}
		else if(this.count == 1)
		{
			return this.removeFront();
		}
		Node curr = this.tail;
		this.tail = this.tail.getPrevNode();
		tail.setNextNode(null);
		curr.setPrevNode(null);
		count--;
		return curr.getPayload();
	}
	

	
	public int removeFront() throws Exception
	{
		if(head == null)
		{
			throw new Exception("Can Not Remove Front: Empty List");
		}
		Node currNode = head; //save currNode as head
		head = head.getNextNode(); //head is now the next node over
		head.setPrevNode(null);
		currNode.setNextNode(null);//detaches it from the list
		this.count--;
		return currNode.getPayload();
	}
	
	
}