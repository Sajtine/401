import java.util.*;

public class Main{
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("This is a mini AI Chat Bot!!");
        System.out.println("Type 'bye' to end the conversation.");

        String userInput;

        while(true){
            System.out.print("You: ");
            userInput = sc.nextLine().toLowerCase();

            if(userInput.equalsIgnoreCase("bye")){
                System.out.println("Bot: Thanks have a nice day. Bye!");
                break;
            }

            String botResponse = get_bot_response(userInput);
            System.out.println("Bot: " + botResponse);
        }
        
        sc.close();
        

    }

    public static String get_bot_response(String userInput){

        Map<String, String> responses = new HashMap<>();

        responses.put("hello", "Tell me about yourself!");
        responses.put("hi", "What can I do for you?");
        responses.put("what is java?", "Java is a popular programming language. Java is used to develop mobile apps, web apps, desktop apps, games and much more.");
        responses.put("do you know about gilo?", "Yes, He is an IT Student in UI.");
        responses.put("thanks", "It's my pleasure to assist you!");
        responses.put("thank you", "That's my pleasure to assist you!");

        for(String key: responses.keySet()){
            if(key.equals(userInput)){
                return responses.get(key);
            }
        }   

        return "I don't understand. Can you say that again?";
    }
}