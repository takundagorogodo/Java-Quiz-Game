import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Question {
    private String questionText;
    private String[] options;
    private int correctAnswerIndex;
    
    public Question(String questionText, String[] options, int correctAnswerIndex) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswerIndex = correctAnswerIndex;
    }
    
    public String getQuestionText() {
        return questionText;
    }
    
    public String[] getOptions() {
        return options;
    }
    
    public int getCorrectAnswerIndex() {
        return correctAnswerIndex;
    }
    
    public boolean isCorrect(int userAnswer) {
        return userAnswer == correctAnswerIndex;
    }
    
    public void displayQuestion() {
        System.out.println("\n" + questionText);
        for (String option : options) {
            System.out.println(option);
        }
    }
}

class Quiz {
    private List<Question> questions;
    private int score;
    private Scanner scanner;
    
    public Quiz() {
        questions = new ArrayList<>();
        scanner = new Scanner(System.in);
        score = 0;
        initializeQuestions();
    }
    
    private void initializeQuestions() {
        // Computer Science Questions
        questions.add(new Question(
            "What is the main function of a router?",
            new String[]{"1. Store files", "2. Encrypt data", "3. Direct network traffic", "4. Process data"},
            3
        ));
        
        questions.add(new Question(
            "Which part of computer is considered the brain?",
            new String[]{"1. CPU", "2. Hard Drive", "3. RAM", "4. GPU"},
            1
        ));
        
        questions.add(new Question(
            "What year was Facebook launched?",
            new String[]{"1. 2006", "2. 2004", "3. 2005", "4. 2008"},
            2
        ));
        
        questions.add(new Question(
            "Who is known as the father of computer?",
            new String[]{"1. Steve Jobs", "2. Bill Gates", "3. Alan Turing", "4. Charles Babbage"},
            4
        ));
        
        questions.add(new Question(
            "What was the first programming language?",
            new String[]{"1. COBOL", "2. C", "3. Fortran", "4. Assembly"},
            3
        ));
        
        // Additional Computer Science Questions
        questions.add(new Question(
            "What does CPU stand for?",
            new String[]{"1. Central Processing Unit", "2. Computer Personal Unit", "3. Central Program Utility", "4. Core Processing Unit"},
            1
        ));
        
        questions.add(new Question(
            "Which company developed the Java programming language?",
            new String[]{"1. Microsoft", "2. Apple", "3. Sun Microsystems", "4. IBM"},
            3
        ));
        
        questions.add(new Question(
            "What is the full form of RAM?",
            new String[]{"1. Random Access Memory", "2. Read Access Memory", "3. Rapid Access Module", "4. Random Allocation Memory"},
            1
        ));
        
        questions.add(new Question(
            "Which operating system is open source?",
            new String[]{"1. Windows", "2. macOS", "3. Linux", "4. iOS"},
            3
        ));
        
        questions.add(new Question(
            "What does HTML stand for?",
            new String[]{"1. Hyper Text Markup Language", "2. High Tech Modern Language", "3. Hyper Transfer Markup Language", "4. Home Tool Markup Language"},
            1
        ));
        
        // General Knowledge Questions
        questions.add(new Question(
            "What is the capital of France?",
            new String[]{"1. London", "2. Berlin", "3. Paris", "4. Madrid"},
            3
        ));
        
        questions.add(new Question(
            "Which planet is known as the Red Planet?",
            new String[]{"1. Venus", "2. Mars", "3. Jupiter", "4. Saturn"},
            2
        ));
        
        questions.add(new Question(
            "Who painted the Mona Lisa?",
            new String[]{"1. Vincent van Gogh", "2. Pablo Picasso", "3. Leonardo da Vinci", "4. Michelangelo"},
            3
        ));
        
        questions.add(new Question(
            "What is the largest ocean on Earth?",
            new String[]{"1. Atlantic Ocean", "2. Indian Ocean", "3. Arctic Ocean", "4. Pacific Ocean"},
            4
        ));
        
        questions.add(new Question(
            "In which year did World War II end?",
            new String[]{"1. 1944", "2. 1945", "3. 1946", "4. 1947"},
            2
        ));
        
        // Science Questions
        questions.add(new Question(
            "What is the chemical symbol for gold?",
            new String[]{"1. Go", "2. Gd", "3. Au", "4. Ag"},
            3
        ));
        
        questions.add(new Question(
            "What is the hardest natural substance on Earth?",
            new String[]{"1. Gold", "2. Iron", "3. Diamond", "4. Platinum"},
            3
        ));
        
        questions.add(new Question(
            "How many bones are in the adult human body?",
            new String[]{"1. 206", "2. 208", "3. 210", "4. 204"},
            1
        ));
        
        questions.add(new Question(
            "What is the largest mammal?",
            new String[]{"1. Elephant", "2. Blue Whale", "3. Giraffe", "4. Great White Shark"},
            2
        ));
        
        questions.add(new Question(
            "What is the boiling point of water at sea level?",
            new String[]{"1. 90°C", "2. 100°C", "3. 110°C", "4. 120°C"},
            2
        ));
    }
    
    public void start() {
        displayWelcomeScreen();
        
        for (int i = 0; i < questions.size(); i++) {
            Question currentQuestion = questions.get(i);
            System.out.println("\n--- Question " + (i + 1) + " of " + questions.size() + " ---");
            currentQuestion.displayQuestion();
            
            int userAnswer = getUserAnswer();
            
            if (currentQuestion.isCorrect(userAnswer)) {
                handleCorrectAnswer();
            } else {
                handleWrongAnswer(currentQuestion.getCorrectAnswerIndex());
            }
        }
        
        displayFinalResults();
    }
    
    private void displayWelcomeScreen() {
        System.out.println("*******************************************");
        System.out.println("       Welcome to Java Quiz Game!");
        System.out.println("*******************************************");
        System.out.println("Total Questions: " + questions.size());
        System.out.println("Categories: Computer Science, General Knowledge, Science");
        System.out.println("*******************************************");
    }
    
    private int getUserAnswer() {
        int answer = 0;
        boolean validInput = false;
        
        while (!validInput) {
            System.out.print("Enter your answer (1-4): ");
            if (scanner.hasNextInt()) {
                answer = scanner.nextInt();
                if (answer >= 1 && answer <= 4) {
                    validInput = true;
                } else {
                    System.out.println("Please enter a number between 1 and 4.");
                }
            } else {
                System.out.println("Invalid input! Please enter a number.");
                scanner.next(); // Clear invalid input
            }
        }
        
        return answer;
    }
    
    private void handleCorrectAnswer() {
        System.out.println("*****************");
        System.out.println("*****CORRECT******");
        System.out.println("*****************");
        score++;
    }
    
    private void handleWrongAnswer(int correctAnswer) {
        System.out.println("*****************");
        System.out.println("*****WRONG******");
        System.out.println("*****************");
        System.out.println("Correct answer was option " + correctAnswer);
    }
    
    private void displayFinalResults() {
        System.out.println("\n*******************************************");
        System.out.println("         QUIZ COMPLETED!");
        System.out.println("*******************************************");
        System.out.println("Your final score: " + score + "/" + questions.size());
        
        double percentage = ((double) score / questions.size()) * 100;
        System.out.printf("Percentage: %.2f%%\n", percentage);
        
        // Performance rating
        System.out.print("Rating: ");
        if (percentage >= 90) {
            System.out.println("Excellent! 🌟");
        } else if (percentage >= 70) {
            System.out.println("Good! 👍");
        } else if (percentage >= 50) {
            System.out.println("Fair. Keep practicing! 📚");
        } else {
            System.out.println("Need more practice. Try again! 💪");
        }
        System.out.println("*******************************************");
    }
    
    public void close() {
        scanner.close();
    }
}

class QuizCategory {
    private String name;
    private List<Question> categoryQuestions;
    
    public QuizCategory(String name) {
        this.name = name;
        this.categoryQuestions = new ArrayList<>();
    }
    
    public void addQuestion(Question question) {
        categoryQuestions.add(question);
    }
    
    public String getName() {
        return name;
    }
    
    public List<Question> getQuestions() {
        return categoryQuestions;
    }
}

public class QuizGame {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        quiz.start();
        quiz.close();
    }
}
