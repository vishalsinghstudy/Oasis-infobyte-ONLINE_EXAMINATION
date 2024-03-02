import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

class Question {
    private String questionText;
    private ArrayList<String> options;
    private int correctOption;

    public Question(String questionText, ArrayList<String> options, int correctOption) {
        this.questionText = questionText;
        this.options = options;
        this.correctOption = correctOption;
    }

    public String getQuestionText() {
        return questionText;
    }

    public ArrayList<String> getOptions() {
        return options;
    }

    public int getCorrectOption() {
        return correctOption;
    }
}

public class OnlineExamSystem {
    private static User currentUser;
    private static int timeRemaining;
    private static ArrayList<Question> questions; // Moved to class level

    public static void main(String[] args) {
        // Set up users
        Map<String, User> users = new HashMap<>();
        users.put("user1", new User("user1", "password1"));
        users.put("user2", new User("user2", "password2"));

        // Set up questions
        questions = new ArrayList<>();
        questions.add(new Question("What is the capital of France?",
                new ArrayList<>(List.of("A. Paris", "B. Berlin", "C. London", "D. Madrid")), 0));
        // Add more questions...

        // Main menu
        while (true) {
            System.out.println("1. Login");
            System.out.println("2. Exit");
            System.out.print("Select option: ");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    loginUser(users, scanner);
                    break;
                case 2:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void loginUser(Map<String, User> users, Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.next();
        System.out.print("Enter password: ");
        String password = scanner.next();

        if (users.containsKey(username) && users.get(username).getPassword().equals(password)) {
            currentUser = users.get(username);
            timeRemaining = 300; // 5 minutes for the exam

            startExam(scanner);
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }
    }

    private static void startExam(Scanner scanner) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Time is up! Automatically submitting the exam.");
                submitExam(scanner);
            }
        }, timeRemaining * 1000);

        // Display questions and options
        for (Question question : questions) {
            System.out.println(question.getQuestionText());
            for (String option : question.getOptions()) {
                System.out.println(option);
            }

            System.out.print("Enter your choice (A, B, C, or D): ");
            String userChoice = scanner.next().toUpperCase();

            if (validateChoice(userChoice)) {
                int userOption = userChoice.charAt(0) - 'A';
                if (userOption == question.getCorrectOption()) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect!");
                }
            } else {
                System.out.println("Invalid choice. Skipping to the next question.");
            }
        }

        // Finish the exam
        timer.cancel();
        submitExam(scanner);
    }

    private static boolean validateChoice(String choice) {
        return choice.length() == 1 && choice.charAt(0) >= 'A' && choice.charAt(0) <= 'D';
    }

    private static void submitExam(Scanner scanner) {
        System.out.println("Exam submitted successfully. Thank you!");
        logoutUser();
    }

    private static void logoutUser() {
        currentUser = null;
    }
}
