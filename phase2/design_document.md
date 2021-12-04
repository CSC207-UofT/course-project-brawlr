# Design Document
#### Changes to Specification:
We have not changed any functionality for our app, but we have implemented and updated all of our functionality so that it properly works and adheres to the SOLID principles and Clean Architecture.

#### Major Design Decisions:
1. Using the Real-Time Firebase database in order to implement chat and swiping functions more efficiently
2. Using libraries to make certain features more powerful instead of building them from scratch; for example, using the Diolor Swipecards library for swipe gesture detection and card flinging
3. Making a lot of the project architecture more UI-forward and neglecting certain controller classes due to certain limitations of the switch we made to Android Studio; however, we’re not sure if this is the best direction to go and are devising ways to refactor this into the Clean Code Architecture we leveraged in the skeleton project

#### Clean Architecture:
1. The current Firebase database interaction implementation and usage of manager classes such as InputManager and UserManager have been built following Clean Architecture; they separate controllers from use cases and entities (User)
2. The database is easily replaceable with a different database thanks to following Clean Architecture principles.
3. Our realtime database does not adhere to Clean Architecture principles, because we decided to abandon DatabaseManager, as realtime database works better with Chat. 
4. Unfortunately, due to the switch over to Android Studio, independence of business rules from UI and even the database has been violated and instead the two types of classes have become intertwined. It was difficult to make certain features, such as swiping, functional while adhering to Clean Architecture due to the adjustment to how Android Studio works. This is definitely something we’d appreciate more guidance on.
5. We also had some difficulty implementing test classes due to similar issues with transferring over to Android Studio, and have mainly been testing manually by building the app and interacting with the UI. 

#### SOLID Design Principles:
1. We have implemented the Single Responsibility Principle in nearly all of our classes and files so that the modules and classes are each responsible for one part of the program’s functionality. For instance, we have RegisterActivity for managing the registration of the users in the app. And we have ChatActivity for managing the chat functionality of the app.
2. We have applied the Open/Closed Principle with the AppCombatActivity and in the use of Firebase classes in our client classes.
3. We have enforced the Liskov Substitution Principle using an interface for all of the screens.
4. We considered using the inside/outside and the by feature packaging strategies. We settled on using the inside/outside packaging system. Our project is a android web application, which takes user input in the form of button presses or swipes on our user interface classes, and passes them to lower level classes which implement the actions from the controller. Finally, all classes access Firebase, which saves all information to the database. This aligns most closely to the inside/outside packaging system, and it allows us to control which of the UI controller classes can see each part of the backend code. 

#### Design Patterns:
We used the Factory Design Pattern for the views/screens (particularly in the Fragment classes).

#### Progress Report:
1. Yixing and Josh have continued working on chat functionality, fetching data from the realtime database, and debugging the chat implementation.



