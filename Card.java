import java.util.Random;
import java.util.Scanner;

public class Card
{

	protected String [] array1 ={"Heart","Club","Spade","Diamond"};
	protected int [] array2 = {2,3,4,5,6,7,8,9,10,11,12,13};
	protected int i;
	protected int j;
	protected String card_kind="";
	protected int card_rank;

	Card()
	{
		super();
		Random rand= new Random();
		Random rand2=new Random();
		i=rand.nextInt(4);
		j=rand2.nextInt(12);
		card_kind= array1[i];
		card_rank=array2[j];
	}
	
	void play ()
	{
		System.out.print("Enter Number of players: 2 or 4");
		Scanner input= new Scanner(System.in);
		int number_of_players= input.nextInt();
		int [] card_queue;
	}
	
	
public static void main(String args [])	
{
	Card object= new Card();
	object.play();
}

}
