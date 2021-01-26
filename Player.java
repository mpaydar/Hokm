import java.util.Scanner;
import java.util.regex.Pattern;

public class Player extends Node {
	
	Node first=null;
	String nameOfPlayer="";
	Node last=null;
	Player ()
	{
		super();
		System.out.print("Welcome, Enter Player Name: ");
		Scanner object= new Scanner(System.in);
		this.nameOfPlayer=object.next();
		Node new_card= new Node();
		this.first=new_card;
		this.last=new_card;
	}
	
	
	
	void handOutCard()
	{
		for(int i=0;i<5;i++)
		{
			Node new_card=new Node();
			if(this.first!=null)
			{
				this.last.next=new_card;
				this.last=new_card;	
			}
		}
	}

	boolean legitHand(Player l)
	{
		Node temp=this.first.next;
		while(temp.next.next!=null)
		{
			if(temp.card_rank == temp.next.card_rank)
			{
				if(temp.card_rank == temp.next.card_rank) 
					{
						return false;
					}
			}
		temp=temp.next;
		}
		
		return true;
		
	}
	void seeHand(Player l)
	{
		Node temp=first.next;
		boolean ok=legitHand(l);
		while(temp!=null)
		{
			if(ok)
			{
				System.out.print(temp.card_kind + " " + temp.card_rank + " " );
				temp=temp.next;
			}
		}
		
	}
	
	

		
		
	void SortHand()
	{
		System.out.print("Select The Card You want to move: "+ "   instruction: For example type KindRank: ");
		Scanner object= new Scanner(System.in);
		String cardFrom= object.nextLine();
		
	}
	
	
	
	void givePlayerOption()
	{
		System.out.println("Possible actions: 1. Organize Your Card  "+ "  2. Play as is");
		
		Scanner object=new Scanner(System.in);
		int action= object.nextInt();
		switch(action)
		{
		case 1:
			SortHand();
			break;
		case 2:
			System.out.print("Game will start in a moment...");
			break;
		}
		
		
	}
	
	
	
	
	public static void main(String args [])
	{
		Player Moe=new Player();
		Moe.handOutCard();
		Moe.seeHand(Moe);
		Moe.givePlayerOption();
		
	}
	

}
