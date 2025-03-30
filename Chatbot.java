import java.util.Scanner;
import java.util.HashMap;

public class Chatbot {
    private static HashMap<String, String> responses;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        initializeResponses();

        System.out.println("AI Chatbot: Hello! How can I assist you today? (Type 'exit' to stop)");

        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine().toLowerCase();

            if (userInput.equals("exit")) {
                System.out.println("AI Chatbot: Goodbye! Have a great day!");
                break;
            }

            System.out.println("AI Chatbot: " + getResponse(userInput));
        }

        scanner.close();
    }

    // Initialize predefined responses
    private static void initializeResponses() {
        responses = new HashMap<>();
        responses.put("hi", "Hello! How can I help you?");
        responses.put("hello", "Hi there! What do you need?");
        responses.put("how are you", "I'm just a chatbot, but I'm doing great! How about you?");
        responses.put("what is your name", "I'm an AI Chatbot created to assist you.");
        responses.put("which resoures you will provide", "i will provide all which is needed for you i will give you any answer in the world");
        responses.put("bye", "Goodbye! Have a wonderful day!");
        responses.put("thank you", "You're welcome! Always happy to help.");
        responses.put("what can you do", "I can answer your questions, chat with you, and help with basic queries.");
        responses.put("your waste","i apologize! if i did not meet your expectation.i am constanly learning and improving so i appriciate your feedback");
    }

    // Get response based on user input
    private static String getResponse(String input) {
        for (String key : responses.keySet()) {
            if (input.contains(key)) {
                return responses.get(key);
            }
        }
        return "I'm sorry, I didn't understand that. Can you rephrase?";
    }
}
