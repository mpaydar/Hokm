import java.util.Random;
import java.util.Scanner;

public class Game extends Player {
	int [] ruler_array= {0,0,0,0};
	
	
	Game ()
	{
		controller();
	}
	
	
	
	int chooseRuler()
	{
		int ruler=0;
		Random rn= new Random();
		int randNum=0;
		int index=0;
		while(randNum!=11)
		{
			randNum=rn.nextInt(13)+2;
			ruler_array[index]=randNum;
			if(ruler_array[index]==11)
			{
				ruler= index;
			}
			if(index==3)
			{
				index=0;
			}
		index++;
		}
		return ruler;
	}
	


	
	
	

	public static void main(String args [])
	{
		Game object= new Game();
		Game object2= new Game();
		int ruler=object.chooseRuler();
		System.out.print(ruler);
	}
	
	
	
		
}
