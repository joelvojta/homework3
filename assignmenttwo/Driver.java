package assignmenttwo;



public class Driver 
{
	public static void main(String[] args)
	{
		LinkedList ll = new LinkedList();
		ll.display();
		ll.addEnd(3);
		ll.addFront(6);
		ll.addEnd(7);
		ll.addEnd(4);
		ll.addFront(2);
		ll.addEnd(9);
		ll.addAtIndex(8, 4);
		ll.display();
		System.out.println(ll.get(3));
	}
}