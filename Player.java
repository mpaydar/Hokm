import java.util.Scanner;
import java.util.regex.Pattern;

public class Player extends Node {
	// I need to use an array helper to let me know which of the 52 cards has been used
	// so a 2D array with 4 row: each row representing a kind of card
	// 					  13 column: each column represent ranks Ace to King
	Node first=null;
	String nameOfPlayer="";
	Node last=null;
	
	Player ()
	{
		super();
		player_number++;
		System.out.print("Welcome, Enter Player Name: ");
		Scanner object= new Scanner(System.in);
		this.nameOfPlayer=object.next();
		Node new_card= new Node();
		this.first=new_card;
		this.last=new_card;
		
	}
	
	void chooseTeamMate()
	{
		System.out.print("Which player you like to be your teammate?");
		Scanner object=new Scanner(System.in);
		String teamMate=object.nextLine();
		System.out.println(this.nameOfPlayer + ", "  + teamMate + " is your teammate..");
	}
	
	
	
	void handOutCard()
	{
		for(int i=0;i<5;i++)
		{
			Node new_card=new Node();
			new_card.player_number=player_number;
			if(this.first!=null)
			{
				this.last.next=new_card;
				this.last=new_card;	
			}
		}
	}

	boolean legitHand()
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
	
	void seeHand()
	{
		
		Node temp=first.next;
		boolean ok=legitHand();
		while(temp!=null)
		{
			if(ok)
			{
				System.out.print(temp.card_kind + " " + temp.card_rank + " " );
				temp=temp.next;
			}
		}
		System.out.println("");
		
	}
	
	void controller()
	{
		
		System.out.println(this.nameOfPlayer  + ", What action you like to take?");
		System.out.println("                               1. See Your Cards"  );
		System.out.println("                               2. choose Teammate"  );  								   
		Scanner sc=new Scanner(System.in);
		int action=sc.nextInt();
		switch(action)
		{
		case 1:
			handOutCard();
			seeHand();
			break;
		case 2:
			chooseTeamMate();
			break;
			
		}
	}

		
		
	void SortHand()
	{
		System.out.print("Select The Card You want to move: "+ "   instruction: For example type KindRank: ");
		Scanner object= new Scanner(System.in);
		String cardFrom= object.nextLine();
		
	}
	
	

	
	
	

	

}
