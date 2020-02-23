package gill_problem1;
import java.util.Scanner;
import java.security.SecureRandom;

public class CAI2 {

	private static Scanner readRes;

	public static void quiz() {

	askQuestion();

	}

	public static void askQuestion(){
		SecureRandom rand = new SecureRandom();
		int rand_int1 = rand.nextInt(10);
		int rand_int2 = rand.nextInt(10);
		int ans;
		ans = rand_int1 * rand_int2;
		System.out.printf("How much is %d times %d?",rand_int1,rand_int2);
		readResponse(ans);
	}

	public static void readResponse(int answer){
		readRes = new Scanner(System.in);
		int number= readRes.nextInt();
		
		isAnswerCorrect(answer, number);
		
	}

	public static void isAnswerCorrect(int ans,int res){
		
		if (res == ans) {
			displayCorrectResponse();
		}else {
			displayIncorrectResponse();
			readResponse(ans);
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


