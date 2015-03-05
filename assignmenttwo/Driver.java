package assignmenttwo;

public class Driver 
{
	public static void main(String[] args) throws Exception
	{
		
		Tower[] game;
		game = new Tower[3];
		Tower t = new Tower();
		Tower t2 = new Tower();
		Tower t3 = new Tower();
		
		game[0] = t;
		game[1] = t2;
		game[0] = t3;
		
		
		
		System.out.println(t.addDisc(new Disc(1)));
		System.out.println(t.addDisc(new Disc(0)));
		System.out.println(t.addDisc(new Disc(5)));
		t.display();
		System.out.println(t.removeDisc());
		System.out.println(t.removeDisc());
		System.out.println(t.removeDisc());
		
		/**RPCalc theCalc = new RPCalc();
		theCalc.on();
		*/
	
		/**Stack mm = new Stack();
		mm.push(5);
		mm.push(4);
		mm.push(3);
		mm.push(2);
		mm.push(1);
		mm.push(0);
		mm.push(7);
		mm.peek();
		mm.pop();
		
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
		System.out.println(ll.get(1));
		ll.display();
		ll.displayInReverse();
		*/
	}
}