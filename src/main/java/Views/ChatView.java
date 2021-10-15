package Views;
import java.util.*;
import brawlr.*;
public class ChatView {

    /**
     * Checks if the user has an existing conversation with the match.
     * If not, creates new chat. The chat between the currentUser and match
     * is then displayed and printed out. The user is prompted to input a new
     * message after every message if they indicate they want to keep
     * messaging. The conversation log is updated and printed out every time.
     * @param currentUser local user viewing the chat
     * @param match Conversation partner user.
     */
    public static void displayChat(User currentUser, User match) {

        ChatManager userCM = currentUser.getuserCM();
        if (!userCM.conversations.containsKey(match)){
            userCM.createChat(match);
        }
        Chat chat = userCM.conversations.get(match);
        Scanner in = new Scanner(System.in);
        String response = "1";
        List<String> log = chat.DisplayLog();
        while(response.equals("1")){
            System.out.println("Would you like to send a message? (Type 0 for no and 1 for yes)");
            response = in.nextLine();
            if (response.equals("1")) {
                System.out.println("Please type the message you would like to send:");
                String msg = in.nextLine();
                chat.SendMessage(currentUser, match, msg, true);
            }
            for (int i = 0; i < log.size(); i++){
                System.out.println(log.get(i));
            }
        }
    }
}

