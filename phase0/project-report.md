# Project Report
### Specification
Our app is a tinder-like app that lets you match with other people to spar. You can open the app and make an account (or log in) and start swiping on potential fighting partners. If both you swipe right on someone and they also swipe right on you it starts a chat between the two of you where you can organize where and when to meet to spar.
### CRC models
The classes in our crc model can be split into 4 sections: controller classes, entity classes, use case classes, and presenter cards. The main way that our app interacts is that it starts in the brawlr class, the brawlr class then interacts with the viewmanager to load the right views which then interacts with the inputmanager which takes care of user input. Depending on the input the Usermanager takes care to change our users and all of our users are passed through our database manager for interaction, only usernames are passed on to other manager classes, not user objects.
### Scenario walk-through
The user will open the app and be prompted to either log in or create a new account. They will input their personal information before viewing a series of potential opponents, swiping right on those they wish to fight and left otherwise. After the user and a potential opponent have both indicated they wish to fight each other, a chat window will be set up in order to orchestrate the fight.

### Skeleton program
For our UI, we have implemented a basic home page for the app in Android Studio (located in a separate repository which was shared with the TA). This demo screen demonstrates what our ideal final home screen will look like. Our skeleton program asks if the user has an existing account. If so, ViewManager will display login, which will take an inputted username and password and check if it matches in the system. If the user indicates that they are new, ViewManager will display UserCreation, and prompt the user to set username, password, and profile details. Next, it will ask if the user wants to swipe or look at chats. If they choose swipe, InputView will display unseen user cards. If the user selects chat, it will bring up a list of users that the user has chats with, and prompt them to choose a conversation or exit.
We also left extra test code in Brawlr with example users to run the program.

### Team Members

 - Ramy: wrote ChatManager skeleton and ChatManagerTest, as well as helped write project specification, scenario walkthrough. Next up: implement sockets and server/client class for chat feature
    
-   Pierre: wrote Brawlr class and BrawlrTest, wireframing, CRC modelling, base class templates, project management, primary code reviewer. Next up: continue to oversee project, and implement main controller classes.
    
-   Jaden: wrote Chat skeleton and ChatTest, as well as the project specification, scenario walkthrough, attributes of the program. Next up: implement sockets and server/client class for chat feature
    
-   Anay: Worked with Zach on basic UI and home screen, helped review documents. Next up: creating UI and programming interactions with Zach.
    
-   Josh: wrote UserDataBase, Swipe. Created test cases and folders, and created packages. Helped with Input Manager, brawlr, user classes. Helped with CRC modelling. Next up: plans to work on user interactions with other classes and other users, while helping with the classes that have not been implemented yet.
    
-   Yixing: all code documentation, console interface interactions for Chat, all skeleton program display for Chat, code review, sendUserCreation for the InputManager. Next up: implement location finder.
    
-   Zach: made User and UserTest classes. Worked with Anay on creating the UI demo. Next up: continue to do UI and interactions with Anay.
 
### What has worked well?
Our demo UI is beautiful! We have a lot of code that will be useful for phase 1 that we have not fully implemented yet for phase 0. This will make our lives easier when we start implementing them because the base classes have already been created.

### Question
How do we implement database interactions as well chat server interactions while still maintaining clean coding architecture? How do we run API calls from Google Maps while also still maintaining clean coding architecture?
