package gill_problem1;

import java.util.Scanner;
import java.security.SecureRandom;

public class CAI3 {

	private static Scanner readRes;
	static int score=0;
	static int count=0;
	static int wrongCount=0;
	public static void quiz() {
		
	for(int i=0;i<10;i++) {
	askQuestion(i);
	}
	System.out.printf("back here");
	float avg = (score*100)/10;
	if (avg<=75) {
	System.out.printf("\nScore: %.2f",avg);
	System.out.printf("\nPlease ask your teacher for extra help.");
	}else {
	System.out.printf("\nScore: %.2f",avg);
	System.out.printf("\nCongratulations, you are ready to go to the next level!");
	}
	reset();
	}
	
	public static void reset() {
		score=0;
		count=0;
		wrongCount=0;
		quiz();
	}

	public static void askQuestion(int i){
		SecureRandom rand = new SecureRandom();
		int rand_int1 = rand.nextInt(10);
		int rand_int2 = rand.nextInt(10);
		
		int ans;
		ans = rand_int1 * rand_int2;
		
		System.out.printf("\nHow much is %d times %d?",rand_int1,rand_int2);
		readResponse(ans);
	}

	public static void readResponse(int answer){
		readRes = new Scanner(System.in);
		int number= readRes.nextInt();
		
		isAnswerCorrect(answer, number);
		
	}

	public static void isAnswerCorrect(int ans,int res){
		
		if (res == ans) {
			score++;
			count++;
			displayCorrectResponse();
		}else {
			wrongCount++;
			displayIncorrectResponse();
			
		}
	}

	public static void displayCorrectResponse(){
		SecureRandom drand = new SecureRandom();
		int optionNum = drand.nextInt(5);
		switch(optionNum) {
		case 1:
		System.out.printf("Very good");
		break;
		case 2:
		System.out.printf("Excellent");
		break;
		case 3:
		System.out.printf("Nice work");
		break;
		case 4:
		System.out.printf("Keep up the good work");
		break;
		}
	}

	public static void displayIncorrectResponse(){
		SecureRandom drand = new SecureRandom();
		int optionNum = drand.nextInt(5);
		switch(optionNum) {
		case 1:
		System.out.printf("No.Please try again.");
		break;
		case 2:
		System.out.printf("Wrong.Try once more.");
		break;
		case 3:
		System.out.printf("Don't give up!");
		break;
		case 4:
		System.out.printf("No. Keep trying.");
		break;
		}
	}

	public static void main (String args[]) {
		quiz();
	}
	}

