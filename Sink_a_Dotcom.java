package learning;

//  written by opkp , discord id- opkp#7340, email - harspandeykp20@gmail.com
import java.util.*;

public class Sink_a_Dotcom {
	
	/*global variables , locations of the dot coms and
	 *  the input which the user will give (the guess)
	 */
	
	Vector<String> answers= new Vector<String>();
	Vector<String> DotComs= new Vector<String>();
	
	//the input which the user gives , coms counter counting the dot coms that are taken down, whenToEnd is couting the number of dot coms taken down
	String input; int  comsCounter, whenToEnd= 0;

	Scanner sc= new Scanner(System.in);

	
	//always running code
	//noq= numberOfQues.
	Sink_a_Dotcom(){
		
		//we have to make a 7by7 grid. A to G (ABCDEFG) , 0 to 6
		
		//filling in the dot coms
		answers.add("B4"); answers.add("D3"); answers.add("F5");
		
		//inputing in the dot coms that the user has to take down to win the world
		DotComs.add("youtube.com"); DotComs.add("reddit.com"); DotComs.add("4chan.com");
		
		//basic intro given to the user and the intro given to the user .
		System.out.println("Sup gegs , In this game you'll have to sink all the dot coms "
				         + "/n and thus establishing business relevancy so you can expense the cost of your products!\n ");
		
		System.out.println("HERE ARE THE RULES AND INSTRUCTIONS ->> You get infinite chances and just try to guess where the dot coms are.\n\n\n>>");
		System.out.println("And here is some story , so there are some really big websites in the game which won't let you get to top so insted of working hard"
							+ "\n you thought that why not take those websites down ,for that you made a really strong gun. After some time,"
							+ "\n you went to there small 2D world (of those websites) and now"
							+ "\n you will use that gun named {kok} to destory those websites and for that you have to destroy those website's bases."
							+ "\n Locate them and get on with it . Locations eg- b4 ( or B4).");
		
		//calling checkguess to check the guess
		while(whenToEnd< 3) {
			input= sc.next();
			CheckGuess(input);
		}
	}
	
	//setting dot coms new locations, when the user has beaten the previous dot coms
	void assignlocation() {
		
		for(int i= 0; i< 3; i++) {
			//the 2 arrays from which we'll make our 2 location graph
			//temparr is for the alpahbatic locations
			//temparr2 is for the numaric locations
			String temparr[]= {"A","B", "C", "D", "E", "F", "G"};
			String temparr2[]= {"1","2", "3", "4", "5", "6", "7"};
			
			//getting a random letter and a random number
			int toAdd1= (int) (Math.random()* 6);
			int toAdd2= (int) (Math.random() * 6);
			
			//concating them together for like getting new locations
			String toAdd= temparr[toAdd2].concat(temparr2[toAdd1]);
			answers.add(toAdd);

		}
		
	}
	
	//checking that if the guess is correct
	void CheckGuess(String input) {
		
		String output= "Miss";
		for(int i= 0; i< answers.size(); i++) {
			
			if(answers.get(i).equalsIgnoreCase(input)) {
				output= "Hit";
				answers.remove(i);
				
			}
		}
		
		//You can use these to check what input your giving and what are dot coms locations.
		
		//System.out.println("The input was " + input);
		//System.out.println("The list of answers is " +answers);
		
		System.out.println(output+"!");

		
		//refilling the answers vector , to like continue the game and telling that you have suefully sunked one dot com
		if(answers.size()== 0) {
			
			System.out.println("Congo You have suceffuly sunken "+ DotComs.get(comsCounter));
			comsCounter++;
			assignlocation();
			whenToEnd++;
		}
	
		//Ending the game and telling the user that he won
		if(whenToEnd==3) {
			System.out.println("YOU WON THE GOD DAMN GAME!!!");
			System.exit(0);
		}
	}
	
	
	//driver of the program
	public static void main(String[]args){
		
		//calling the constructure 
		Sink_a_Dotcom rh= new Sink_a_Dotcom();
	}
}
