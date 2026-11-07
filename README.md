**Final Project - Among Us**

Student: Alina Ibadulla, Assem Tugelbay, Zhansaya Boranbaykyzy | SE-2540

Teacher: Software Design Patterns | Mektapbayeva Aruzhan

---

This is the final project for the Software Design Patterns course. Our team has developed a console-based simulation of the popular game "Among Us" using Java and Maven. The main goal of the project is to demonstrate the practical application of 6 different GoF Design Patterns.

---

**Team Members & Pattern Distribution**

The project was developed collaboratively using Git branches. Each team member was responsible for implementing 2 design patterns:

| Student Name | GitHub Username | Assigned Patterns |
| :--- | :--- | :--- |
| **Alina Ibadulla** | [@alina7-p](https://github.com/alina7-p) | Singleton, Factory Method |
| **Asem Tugelbai** | [@asemtygelbaeva-byte](https://github.com/asemtygelbaeva-byte) | Strategy, Observer |
| **[Student 3 Name]** | [@zhansayaboranbaykyzy07-code](https://github.com/asemtygelbaeva-byte) | Decorator, Command |

**🏗️ Project Architecture (Patterns Used)**

**Singleton** (com.amongus.singleton): Ensures only one GameSession exists to track the current phase of the game and active map rooms.

**Factory Method** (com.amongus.factory): Centralizes the creation of Player objects (Crewmates and Impostors) and game Task objects without tightly coupling classes.

**Observer** (com.amongus.observer): Allows the EmergencyPublisher to notify all subscribed Player objects when a body is reported or an emergency meeting is called.

**Strategy** (com.amongus.strategy): Enables the Impostor to dynamically switch between different sabotage tactics (LightsSabotage, ReactorSabotage) at runtime.

**Decorator** (com.amongus.decorator): Dynamically adds new abilities to players without altering their base class (e.g., GhostDecorator allows passing through walls after death).

**Command** (com.amongus.command): Encapsulates player actions (ReportBodyCommand, VoteCommand) into objects, allowing the MeetingInvoker to execute them and store a history of actions.

---

**Project Structure:**

src/main/java/com/amongus/
├── command/       # Command pattern implementations
├── decorator/     # Decorator pattern implementations
├── factory/       # Factory Method pattern implementations
├── model/         # Base domain models (Player, Task)
├── observer/      # Observer pattern implementations
├── singleton/     # Singleton pattern implementations
├── strategy/      # Strategy pattern implementations
└── Main.java      # Application entry point demonstrating all patterns

---

**🛠️ How to Run?**

Clone the repository:

git clone https://github.com/alina7-p/sdpFinalPro.git

Navigate to the project directory:

cd sdpFinalPro

Run the application from your IDE (IntelliJ IDEA / Eclipse) by executing the main method in src/main/java/com/amongus/Main.java.

---

**Sample Output:**

=== AMONG US DESIGN PATTERNS DEMO ===

[GameSession] Game phase changed to: TASKS_PHASE
Activating: Lights Sabotage
[Sabotage] Lights are turned OFF! Crewmates vision is reduced.

--- Player Effects ---
Crewmate RedPlayer (Red) is completing a task!
[Ghost Ability] RedPlayer can now pass through walls!

--- Emergency Meeting & Commands ---

[EMERGENCY ALERT] Body reported in Navigation!
Player RedPlayer (Red) received alert: Body reported in Navigation! -> Teleporting to Cafeteria table!
Player BlackPlayer (Black) received alert: Body reported in Navigation! -> Teleporting to Cafeteria table!
[Command Action] Player BlackPlayer reported a dead body!
[Command Action] Player BlackPlayer voted for RedPlayer!

--- Voting/Action History ---
Total actions executed during meeting: 2

---

🤝 Collaboration Workflow

This project was built strictly following a Git collaboration workflow:

The base structure was initialized on the main branch.

Each student branched off to a feature branch (e.g., student2-patterns, student3-patterns).

Commits were made using individual Git configurations (identifiable by user email/name).

Code was reviewed and merged back into main via GitHub Pull Requests.

---

**Conclusion:**

During this project, our team successfully developed a modular simulation of the "Among Us" game logic using Java and Maven. The main achievement was the successful integration of six GoF design patterns, making the application architecture flexible, scalable, and easy to maintain. Furthermore, the project demonstrated successful teamwork. Using Git and GitHub allowed three developers to write code in isolated branches and safely merge changes into the common codebase without data loss.

**Further Work:**
The current console-based implementation laid a solid foundation that can be easily scaled. Future improvements include:
GUI Implementation: Transitioning from console output to a fully windowed interface using JavaFX or Swing to visualize the map, player movements, and tasks.
Network Multiplayer: Implementing client-server architecture using Java Sockets or WebSockets to allow users to play together over a network.
Roles and Mechanics Expansion: Adding new roles (e.g., Engineer, Scientist) using existing factories and decorators, and complicating voting logic.
Database Integration: Connecting PostgreSQL or SQLite to save player statistics (win rates, match history).
