package gill_problem1;
import java.util.Scanner;
import java.security.SecureRandom;

public class CAI1{

public static void quiz() {

askQuestion();

}

public static void askQuestion(){
	SecureRandom rand = new SecureRandom();
	int rand_int1 = rand.nextInt(10);
	int rand_int2 = rand.nextInt(10);
	int ans;
	ans = rand_int1 * rand_int2;
	System.out.printf("How much is %d times %d?\n",rand_int1,rand_int2);
	readResponse(ans);
}

public static void readResponse(int answer){
	Scanner readRes = new Scanner(System.in);
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
	System.out.printf("Very good");
}

public static void displayIncorrectResponse(){
	System.out.printf("No.Please try again.");
}

public static void main (String args[]) {
	quiz();
}
}

