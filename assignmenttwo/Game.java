package assignmenttwo;

import java.util.Scanner;


public class Game 
{
	private Tower[] theTowers = {new Tower(), new Tower(), new Tower()};
	public Game()
	{
		theTowers[0].addDisc(new Disc(3));
		theTowers[0].addDisc(new Disc(2));
		theTowers[0].addDisc(new Disc(1));
	}
	
	public void play()
	{
		Scanner input = new Scanner(System.in);
		while(true)
		{
			this.show();
			System.out.print("Enter Source Tower Index: ");
			int source = input.nextInt();
			System.out.print("Enter Destination Tower Index: ");
			int dest = input.nextInt();
			Disc d2Move = theTowers[source].removeDisc();
			if(!theTowers[dest].addDisc(d2Move))
			{
				theTowers[source].addDisc(d2Move);
				System.out.println("Illegal Move");
			}
			//check for winner
			if(this.theTowers[this.theTowers.length-1].size() == 3)
			{
				break;
			}
		}
		
		this.show();
		System.out.println("WINNER!!!!");
	}
	
	private void show()
	{
		//for(int i = 0; i < this.theTowers.length; i++)
		int pos = 0;
		for(Tower t : this.theTowers)
		{
			System.out.println("Tower Index: " + pos++);
			t.display();
			System.out.println("");
		}
	}
}