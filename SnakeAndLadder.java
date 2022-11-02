package assignment;

public class SnakeAndLadder {
	public static int checkforsnake(int pos) {
		
		switch (pos) {
		case 98:
			pos=55;System.out.println("snake bite to "+pos);
			break;
		case 92:
			pos=75;System.out.println("snake bite to "+pos);
			break;
		case 82:
			pos=42;System.out.println("snake bite to "+pos);
			break;  
		case 73:
			pos=51;System.out.println("snake bite to "+pos);
			break;
		case 56:
			pos=19;System.out.println("snake bite to "+pos);
			break;     
		case 47:
			pos=15;System.out.println("snake bite to "+pos);
			break;
		case 30:
			pos=7;System.out.println("snake bite to "+pos);
			break;
		} return(pos);
	}
	public static int checkforLadder(int pos) {
		
		switch (pos) {
		case 4:
			pos=25;System.out.println("use ladder to"+pos);
			break;
		case 21:
			pos=39;System.out.println("use ladder to"+pos);
			break;
		case 29:
			pos=74;System.out.println("use ladder to"+pos);
			break;  
		case 43:
			pos=76;System.out.println("use ladder to"+pos);
			break;
		case 63:
			pos=80;System.out.println("use ladder to"+pos);
			break;     
		case 71:
			pos=89;System.out.println("use ladder to"+pos);
			break;
		} return(pos);
	}

	public static int dicemove(int pos,int dice) {

		switch (pos) {
		case 99:
			if (dice >  1) {
				dice=0;
			}
			break;
		case 98:
			if (dice >  2) {
				dice=0;
			}
			break;
		case 97:
			if (dice >  3) {
				dice=0;
			}
			break;  
		case 96:
			if (dice >  4) {
				dice=0;
			}
			break;
		case 95:
			if (dice >  5) {
				dice=0;
			}
			break;     

		}
		return(dice);
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Snake & ladder");
		int start=0,counter1=0,counter2=0;
		int player1=0,player2=0;
		System.out.println("Player1 is at "+player1);
		System.out.println("Player2 is at "+player2);
		while(player1 <  100  && player2 < 100 ) {
			
			if (start%2 == 0) {
				int dice=(int) (Math.random()*(6)+1);
				System.out.println("dice"+dice);
				counter1++;
				dice=dicemove(player1,dice);
				player1=player1+dice;
				player1=checkforLadder(player1);
				player1=checkforsnake(player1);
				System.out.println("Player1 at position"+player1);
			} else {
				int dice=(int) (Math.random()*(6)+1);
				System.out.println("dice"+dice);
				counter2++;
				dice=dicemove(player2,dice);
				player2=player2+dice;
				player2=checkforLadder(player2);
				player2=checkforsnake(player2);
				System.out.println("Player2 at position"+player2);
			}System.out.println("-------------------------------");
			start++;
		}	
		if(player1 == 100) {
			System.out.println("Player1 won the game in "+counter1+"chance");
		} else if(player2 == 100) {
			System.out.println("Player2 won the game"+counter2+"chance");
		} else {
			System.out.println("pilagaye ho tum");
		}

	}
}
