package Views;
import java.util.*;
import brawlr.*;
public class ChatView {

    /**
     * Checks for the user's existing conversation and allows the user to select one.
     * The chat between the currentUser and the chosen match
     * is then displayed and printed out. The user is prompted to input a new
     * message after every message if they indicate they want to keep
     * messaging. The conversation log is updated and printed out every time.
     * @param currentUser local user viewing the chat
     */
    public static void displayChat(User currentUser) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please select a conversation to open using its associated number, or type 9999 to exit:");
        ChatManager userCM = currentUser.getuserCM();
        int i = 0;
        User[] matches = new User[userCM.conversations.size()];
        for (User match: userCM.conversations.keySet()){
            matches[i] = match;
            System.out.println(i + ": " + match.getId());
            i++;
        }

        int answer = in.nextInt();
        if (answer == 9999){
            //Does nothing, because this will help user exit/
        }
        else{
            User match = matches[answer];
            Chat chat = userCM.conversations.get(match);

            String response = "1";
            List<String> log = chat.DisplayLog();
            Scanner in2 = new Scanner(System.in);
            while(response.equals("1")){
                System.out.println("Would you like to send a message? (Type 0 for no and 1 for yes)");
                response = in2.nextLine();
                if (response.equals("1")) {
                    System.out.println("Please type the message you would like to send:");
                    String msg = in2.nextLine();
                    chat.SendMessage(currentUser, match, msg, true);
                }
                for (int x = 0; x < log.size(); x++){
                    System.out.println(log.get(x));
                }

            }
        }
    }
}

