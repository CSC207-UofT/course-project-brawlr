# Design Document

#### Specification:
Brawlr is a **Tinder-like app**, which, instead of connecting potential romantic partners, **connects potential sparring partners**. We want to create an app for individuals interested in MMA fighting to find someone to spar.
**A fighter using the app will be able to:**
1. **Make an account**, in which they can set their height, pronouns, weight, reach, location, style, description, controversial opinions, and photos.
2.  Sift through a **list of potential sparring partners**, and “swipe left” if they’re not interested (thus removing the other fighter from their list), and “swipe right” if they are interested in sparring with the individual 
3.  Once the user has swiped right, the other fighter is then **added to the user’s list of interested matches** (though this list is not viewable by the user)
4.  If a fighter in the user's list of interested matches also **swipes right** on the user (there is a mutual desire to spar), a **match** will occur between the two users, and **a chat window autimatically opens** between both users
5.  The user can then send messages to their match to set up where/when they want to spar

Description of **Application Layout**

There are three seperate pages within the **Brawlr application** that a user can navigate to by pressing corresponding buttons along the bottom of the screen. The left button navigates to a **edit information** page, where the user can set/edit their personal information(listed above). The right button navigates to a page that displays a list of chat windows for each of a users matches. From this page, the user can tap to expand a chat window with a specific user in their matches, and can then send messages to that user and see the messages that the other user has sent within the window. The middle button navigates to the main page, which displays the profile information/images of another user that the user has not yet swiped on (once a user swipes left or right on a profile, that profile will no longer be able to appear on the main screen). From here, the user can swipe on the profile depending on whether they would want to spar them or not. Every time a user swipes, the profile that they swiped on will be replaced on the home screen by a new profile that they have not yet swiped on.

#### Changes to Specification:
We have decided against implementing any automatic location-based functionality, and have switched from the normal Firebase database to Realtime Database in order to instantaneously send chat and match data to and from the database and greatly improve efficiency. Beyond that, our specification remains the same, and we have implemented and updated all of our functionality so that it properly works and adheres to the SOLID principles and Clean Architecture.

#### Major Design Decisions:
1. Using the Real-Time Firebase database in order to implement chat and swiping functions more efficiently
2. Using libraries to make certain features more powerful instead of building them from scratch; for example, using the Diolor Swipecards library for swipe gesture detection and card flinging
3. We have made a lot of the project architecture more UI-forward and have changed the implementation of certain controller classes due to certain limitations of the switch to Android Studio.

#### Clean Architecture:
1. The current Firebase database interaction implementation and usage of manager classes such as InputManager and UserManager have been built following Clean Architecture; they separate controllers from use cases and entities (User). 
2. The database is easily replaceable with a different database thanks to following Clean Architecture principles.
3. Our realtime database does not adhere to Clean Architecture principles, because we decided to abandon DatabaseManager, as realtime database works better with Chat. 
4. Unfortunately, due to the switch over to Android Studio, independence of business rules from UI and even the database has been violated and instead the two types of classes have become intertwined. It was difficult to make certain features, such as swiping, functional while adhering to Clean Architecture due to the adjustment to how Android Studio works. This is definitely something we’d appreciate more guidance on.
5. We also had some difficulty implementing test classes due to similar issues with transferring over to Android Studio, and have mainly been testing manually by building the app and interacting with the UI. 

#### SOLID Design Principles:
1. We have implemented the Single Responsibility Principle in nearly all of our classes and files so that the modules and classes are each responsible for one part of the program’s functionality. For instance, we have RegisterActivity for managing the registration of the users in the app. And we have ChatActivity for managing the chat functionality of the app.
2. We have applied the Open/Closed Principle with the AppCombatActivity and in the use of Firebase classes in our client classes. Each class can be extended in order to add new behaviors, by simply adding additional interactions with the database (and we have plans to add further functionality after the end of this course)
3. We have enforced the Liskov Substitution Principle using an interface for each of the screens used in the application, as they can be substituted without altering the base functionality of the program.
4. We have used the Interface Segregation Principle with all of the public methods in our program. Most methods in our program are small with a very specific purpose, and the larger methods are either protected, private, or default.
5. Both MatchesViewHolders and ChatViewHolders implement the interface View.OnClickListener instead of directly relying on their respective Activity classes, which is consistent with the Dependency Inversion Principle.

#### Packaging Strategies:
In our program, we packaged several features together to make our files more organized to anyone observing our code, and to ensure that the visibility of each component of our code was appropriately protected. We decided to use the by component packaging strategy, as it allowed us to encapsulate sets of related functions in order to ensure that our program was both cohesive and modular, and decoupling different functionalitites in order to better adhere to Clean Architecture. Features such as our user display cards, chat implementations, and matches implementations, all have their own packages which hold all their related classes.

#### Design Patterns:
We used the Factory Design Pattern for the views/screens

#### Progress Report:
1. Yixing and Josh have continued working on presentation/design document layout, chat functionality, fetching data from the realtime database, and debugging the chat implementation.
2. Zach and Anay have continued to work on the UI, improving on the design and fixing bugs since phase 1.
3. Pierre has ____
4. Ramy has ____
5. Jaden has ____

#### Significant Changes:
1. A significant pull request made by Zach can be found at: https://github.com/saleheza/brawlrUI/pull/5/files. This change was significant as it implemented the main screens of our application, which allowed the rest of the team to build off of for the implementation of the app's features.
2. A significant pull request made by Anay can be found at https://github.com/saleheza/brawlrUI/pull/18/files. This was important as it set up the format for chat screens, which allowed the team to build the chat interface and display messages.
3. A significant pull request made by Josh can be found at https://github.com/saleheza/brawlrUI/pull/11/files. This was important as it set up the structure for the chat backend, and created classes that allowed the program to read and write data to the database. This request was eventually linked to the UI to create the working chat interface.
4. A significant pull request made by Yixing can be found at ____
5. A significant pull request made by Pierre can be found at ____
6. A significant pull request made by Jaden can be found at ____
7. A significant pull request made by Ramy can be found at ____
