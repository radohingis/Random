package sk.kosickaakademia.hingis.math.planimetry.cycle;

import java.util.Scanner;

public class MyRandomNumGame {
    public static void main(String[] args) {
        MyRandomNumGame newgame = new MyRandomNumGame();
        //newgame.guessNumber(100);
        newgame.smallMultiplierExam();
    }
    public void guessNumber(int max){
        int randomNumber = (int)(Math.random()*max +1);
        Scanner sc = new Scanner(System.in);
        int guess;
        int attemptCounter = 0;
        System.out.print("Type your guess. You've got 7 attepmts: ");
        do{
            guess = sc.nextInt();
            attemptCounter++;
            if (guess == randomNumber) break;
            else if (guess > randomNumber && attemptCounter != 7)
                System.out.print("Oops! Too high, try lower: ");
            else if (guess < randomNumber && attemptCounter != 7){
                System.out.print("Oops! Too low, try higher: ");
            }
            if (attemptCounter == 7) break;
        }while(guess!=randomNumber);

        if(guess != randomNumber) System.out.println("Im sorry, you lost. The number was "+randomNumber);
        else if (guess == randomNumber) System.out.println("Awesome, you guessed the number at "+attemptCounter+". attempt.");
    }

    public void smallMultiplierExam(){
        System.out.println("Welcome!");
        System.out.println("You will receive ten small multiplier exercises below.");
        System.out.println("After the last you will receive your result. Good luck.");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        int result;
        int rightAnswers = 0;
        for (int i = 1; i <= 10; i++){
            int a = (int) (Math.random()*10+1);
            int b = (int) (Math.random()*10+1);
            System.out.print(a+" * "+b+" = ");
            result = sc.nextInt();
            if (result == (a*b)){
                rightAnswers++;
            }
        }
        if (rightAnswers < 5) {
            System.out.println("Hmm... You have to practise more.");
            System.out.println("Result: " + rightAnswers * 10 + "%");
        }
        else if (rightAnswers > 5 && rightAnswers < 10){
            System.out.println("Awesome, you did great job.");
            System.out.println("Result: " + rightAnswers * 10 + "%");
        }
        else if (rightAnswers == 10){
            System.out.println("EXCELLENT!!! You are kinda smarter than this application O:)");
            System.out.println("Result: " + rightAnswers * 10 + "%");
        }
    }
}


