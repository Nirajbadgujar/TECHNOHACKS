import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        String[] questions = {
                "What is the capital of India?",
                "Which river is considered the holiest river in Hinduism?",
                "Who wrote the Indian national anthem, 'Jana Gana Mana'?",
                "Which state is known as the 'Land of Five Rivers'?",
                "Who was the first Prime Minister of India?"
        };

        String[] options = {
                "A) New Delhi\tB) Mumbai\tC) Chennai\tD) Kolkata",
                "A) Yamuna\tB) Ganges\tC) Brahmaputra\tD) Godavari",
                "A) Rabindranath Tagore\tB) Mahatma Gandhi\tC) Jawaharlal Nehru\tD) Subhas Chandra Bose",
                "A) Punjab\tB) Haryana\tC) Uttar Pradesh\tD) West Bengal",
                "A) Jawaharlal Nehru\tB) Indira Gandhi\tC) Rajiv Gandhi\tD) Morarji Desai"
        };

        char[] correctAnswers = {'A', 'B', 'A', 'A', 'A'};

        int score = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Kaun Banega Crorepati");
        System.out.println("Answer the following questions:");

        for (int i = 0; i < questions.length; i++) {
            System.out.println("\n" + questions[i]);
            System.out.println(options[i]);
            System.out.print("Enter your choice (A, B, C, D): ");

            char userChoice = Character.toUpperCase(scanner.next().charAt(0));

            if (userChoice == correctAnswers[i]) {
                System.out.println("Correct!");
                score += 2000000;
            } else {
                System.out.println("Incorrect! The correct answer was " + correctAnswers[i]);
                break;
            }
        }

        System.out.println("\nGame Over!");
        System.out.println("Congratulations your winning amount is: Rs. " + score);
    }
}
