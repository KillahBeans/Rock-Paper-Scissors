import java.util.Random;
import java.util.Scanner;

class RockPaperScissors{
	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	Random random = new Random();

	int playerScore = 0;
	int cpuScore = 0;

	System.out.println("This is a game of Rock Paper Scissors vs the computer");
	System.out.println("First to win 3 points win!");

	while(true){
			System.out.println(" ");
			System.out.println("Please enter a number that represents your choice");
			System.out.println("Rock = 1");
			System.out.println("Paper = 2");
			System.out.println("Scissors = 3");
			System.out.println(" ");

			int choice = scan.nextInt();
			int cpu = random.nextInt(3 - 1 + 1) + 1;

			if(choice > 3 || choice < 1)
			{
				System.out.println(" ");
				System.out.println("The number you have entered is invalid");
				System.out.println("Please enter the numbers 1(rock), 2(paper) or 3(scissors)");
			}

			//tie ifs
			if(choice == 1 && cpu == 1)
			{
				System.out.println("-------------------------------------------------");
				System.out.println(" ");
				System.out.println("You and the computer both chose rock! It's a tie!");
				System.out.println("Try again!");
				System.out.println(" ");
				System.out.println("-------------------------------------------------");
				System.out.println(" ");
				System.out.println("Your score: " + playerScore);
				System.out.println("Computer's score: " + cpuScore);
			}

			if(choice == 2 && cpu == 2)
			{
				System.out.println("-------------------------------------------------");
				System.out.println(" ");
				System.out.println("You and the computer both chose paper! It's a tie!");
				System.out.println("Try again!");
				System.out.println(" ");
				System.out.println("-------------------------------------------------");
				System.out.println(" ");
				System.out.println("Your score: " + playerScore);
				System.out.println("Computer's score: " + cpuScore);
			}

			if(choice == 3 && cpu == 3)
			{
				System.out.println("-------------------------------------------------");
				System.out.println(" ");
				System.out.println("You and the computer both chose scissors! It's a tie!");
				System.out.println("Try again!");
				System.out.println(" ");
				System.out.println("-------------------------------------------------");
				System.out.println(" ");
				System.out.println("Your score: " + playerScore);
				System.out.println("Computer's score: " + cpuScore);
			}

			//player rock ifs
			if(choice == 1 && cpu == 3) //rock vs scissors
			{
				System.out.println("---------------------------");
				System.out.println(" ");
				System.out.println("You: rock");
				System.out.println("Computer: scissors");
				System.out.println(" ");
				System.out.println("---------------------------");
				System.out.println(" ");
				System.out.println("You win!");
				System.out.println(" ");
				System.out.println("---------------------------");
				playerScore++;
				System.out.println(" ");
				System.out.println("Your score: " + playerScore);
				System.out.println("Computer's score: " + cpuScore);
			}

			if(choice == 1 && cpu == 2) //rock vs paper
			{
				System.out.println("---------------------------");
				System.out.println(" ");
				System.out.println("You: rock");
				System.out.println("Computer: paper");
				System.out.println(" ");
				System.out.println("---------------------------");
				System.out.println(" ");
				System.out.println("You lose!");
				System.out.println(" ");
				System.out.println("---------------------------");
				cpuScore++;
				System.out.println(" ");
				System.out.println("Your score: " + playerScore);
				System.out.println("Computer's score: " + cpuScore);
			}

			//player paper ifs
			if(choice == 2 && cpu == 3) //paper vs scissors
			{
				System.out.println("---------------------------");
				System.out.println(" ");
				System.out.println("You: paper");
				System.out.println("Computer: scissors");
				System.out.println(" ");
				System.out.println("---------------------------");
				System.out.println(" ");
				System.out.println("You lose!");
				System.out.println(" ");
				System.out.println("---------------------------");
				cpuScore++;
				System.out.println(" ");
				System.out.println("Your score: " + playerScore);
				System.out.println("Computer's score: " + cpuScore);
			}

			if(choice == 2 && cpu == 1) //paper vs rock
			{
				System.out.println("---------------------------");
				System.out.println(" ");
				System.out.println("You: paper");
				System.out.println("Computer: rock");
				System.out.println(" ");
				System.out.println("---------------------------");
				System.out.println(" ");
				System.out.println("You win!");
				System.out.println(" ");
				System.out.println("---------------------------");
				playerScore++;
				System.out.println(" ");
				System.out.println("Your score: " + playerScore);
				System.out.println("Computer's score: " + cpuScore);
			}

			//player scissor ifs
			if(choice == 3 && cpu == 1) //scissors vs rock
			{
				System.out.println("---------------------------");
				System.out.println(" ");
				System.out.println("You: scissors");
				System.out.println("Computer: rock");
				System.out.println(" ");
				System.out.println("---------------------------");
				System.out.println(" ");
				System.out.println("You lose!");
				System.out.println(" ");
				System.out.println("---------------------------");
				cpuScore++;
				System.out.println(" ");
				System.out.println("Your score: " + playerScore);
				System.out.println("Computer's score: " + cpuScore);
			}

			if(choice == 3 && cpu == 2) //scissors vs paper
			{
				System.out.println("---------------------------");
				System.out.println(" ");
				System.out.println("You: scissors");
				System.out.println("Computer: paper");
				System.out.println(" ");
				System.out.println("---------------------------");
				System.out.println(" ");
				System.out.println("You win!");
				System.out.println(" ");
				System.out.println("---------------------------");
				playerScore++;
				System.out.println(" ");
				System.out.println("Your score: " + playerScore);
				System.out.println("Computer's score: " + cpuScore);;
			}

			if(playerScore == 3 || cpuScore == 3) //final score
			{
				System.out.println(" ");
				System.out.println("---------------------------");
				System.out.println(" ");
				System.out.println("Your final score: " + playerScore);
				System.out.println("Computer's final score: " + cpuScore);
				System.out.println(" ");
				System.out.println("---------------------------");
				break;
			}


	}

	}
}