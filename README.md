Final Project - Among Us
Student: Alina Ibadulla, Assem Tugelbay, Zhansaya Boranbaykyzy | SE-2540
Teacher: Software Design Patterns | Mektapbayeva Aruzhan

This is the final project for the Software Design Patterns course. Our team has developed a console-based simulation of the popular game "Among Us" using Java and Maven. The main goal of the project is to demonstrate the practical application of 6 different GoF Design Patterns.

 Team Members & Pattern Distribution:

The project was collaboratively built by a team of 3 students using Git for version control. Each student implemented 2 design patterns in separate branches before merging into main.

Student

GitHub Username

Implemented Patterns

Description

Student 1 (Lead)

alina7-p

Singleton, Factory Method

Managed global game state (GameSession) and object creation (Crewmates, Impostors, Tasks).

Student 2

asemtygelbaeva-byte

Observer, Strategy

Implemented the emergency alert system and dynamic sabotage behaviors (Lights, Reactor).

Student 3

(Student 3 Name)

Decorator, Command

Added dynamic player status effects (Ghost, Speed) and encapsulated meeting actions (Report, Vote).

🏗️ Project Architecture (Patterns Used)

Singleton (com.amongus.singleton): Ensures only one GameSession exists to track the current phase of the game and active map rooms.

Factory Method (com.amongus.factory): Centralizes the creation of Player objects (Crewmates and Impostors) and game Task objects without tightly coupling classes.

Observer (com.amongus.observer): Allows the EmergencyPublisher to notify all subscribed Player objects when a body is reported or an emergency meeting is called.

Strategy (com.amongus.strategy): Enables the Impostor to dynamically switch between different sabotage tactics (LightsSabotage, ReactorSabotage) at runtime.

Decorator (com.amongus.decorator): Dynamically adds new abilities to players without altering their base class (e.g., GhostDecorator allows passing through walls after death).

Command (com.amongus.command): Encapsulates player actions (ReportBodyCommand, VoteCommand) into objects, allowing the MeetingInvoker to execute them and store a history of actions.

📂 Project Structure

src/main/java/com/amongus/
├── command/       # Command pattern implementations
├── decorator/     # Decorator pattern implementations
├── factory/       # Factory Method pattern implementations
├── model/         # Base domain models (Player, Task)
├── observer/      # Observer pattern implementations
├── singleton/     # Singleton pattern implementations
├── strategy/      # Strategy pattern implementations
└── Main.java      # Application entry point demonstrating all patterns


🛠️ How to Run

Clone the repository:

git clone https://github.com/alina7-p/sdpFinalPro.git


Navigate to the project directory:

cd sdpFinalPro


Run the application from your IDE (IntelliJ IDEA / Eclipse) by executing the main method in src/main/java/com/amongus/Main.java.

🤝 Collaboration Workflow

This project was built strictly following a Git collaboration workflow:

The base structure was initialized on the main branch.

Each student branched off to a feature branch (e.g., student2-patterns, student3-patterns).

Commits were made using individual Git configurations (identifiable by user email/name).

Code was reviewed and merged back into main via GitHub Pull Requests.
