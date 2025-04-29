import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer;
        int correct = 0;

        String[][] Questions = {
                {"1. What does int stand for in Java", "A. Integer", "B. Internal", "C. Interval"},
                {"2. Which planet is known as the Red Planet?", "A. Venus", "B. Mars", "C. Jupiter"},
                {"3. What will 2 + 3 * 4 evaluate to in Java?", "A. 20", "B. 14", "C. 10"},
                {"4. Which keyword is used to define a class in Java?", "A. define", "B. object", "C. class"},
                {"5. What is the binary value of 5?", "A. 101", "B. 110", "C. 111"},
                {"6. What country has the city called 'Istanbul'", "A. Turkey", "B. Iran", "C. Egypt"},
        };

        for(int i = 0; i < Questions.length; i++) {
            for(int j = 0; j < Questions[i].length; j++) {
                System.out.println(Questions[i][j]);
            }
            System.out.print("Answer: ");
            answer = scanner.next().toUpperCase();

            switch (i) {
                case 0, 4, 5 -> {
                    if (answer.equals("A")) {
                        System.out.println("You are correct!");
                        correct += 1;
                    }
                    else {
                        System.out.println("Wrong! The answer was A");
                    }
                }
                case 1, 2 -> {
                    if (answer.equals("B")) {
                        System.out.println("You are correct!");
                        correct += 1;
                    }
                    else {
                        System.out.println("Wrong! The answer was B");
                    }
                }
                case 3 -> {
                    if (answer.equals("C")) {
                        System.out.println("You are correct!");
                        correct += 1;
                    }
                    else {
                        System.out.println("Wrong! The answer was C");
                    }
                }
            }

        }

        System.out.println("Thanks for playing the quiz!");
        System.out.printf("You got %d out of 6 questions right!\n", correct);

        scanner.close();
    }
}