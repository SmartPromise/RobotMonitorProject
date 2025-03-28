# **Robot Monitor Project**

The Robot Monitor Project is a comprehensive system designed to simulate and manage a robot's movement on a grid. The project includes a formal specification written in VDM-SL, a Java-based implementation with both a graphical user interface (GUI) and a text-based interface, and detailed test documentation.

**Overview**

The Robot Monitor system is structured around the following key components:

**VDM-SL Specification:**

The formal model defines the robot’s state (position and last move), the allowed movements (RIGHT, LEFT, UP, DOWN), and invariant conditions. The VDM-SL model specifies operations for moving the robot and resetting its state, ensuring that all moves obey preconditions and postconditions.
​

**Java Implementation:**

The Java code implements the specified operations and enforces the invariants described in the VDM-SL model. Key classes include:

RobotMonitor.java: Implements the movement operations, invariant checks, and state management.
​

Move.java: An enumeration defining the possible movement directions (LEFT, RIGHT, UP, DOWN).
​

VDMException.java: A custom unchecked exception used to signal VDM-specific errors in the Java implementation.
​

User Interfaces:

The project provides two modes of interaction:

Graphical User Interface (GUI):

RobotGUI.java: A Swing-based GUI that displays the grid, current robot position, and last move. It provides buttons for each movement command and an exit option.
​

RunRobotGUI.java: The main class to launch the GUI version of the application.
​

Text-Based Interface:

RunRobotText.java: A command-line interface that allows users to input commands to control the robot. This interface displays the current position and accepts user choices for movement or exit.
​

Testing Documentation:
Testing is thoroughly documented to ensure that both the VDM-SL specification and the Java implementation meet the desired behavior. Documentation includes:

ROMAdvancedTest.rtf: Contains advanced test cases with various initial states, edge cases, and expected outcomes for movement operations and the exit function.
​

sampleTestDocumentation.docx: Provides a detailed testing plan outlining the purpose, input data, expected results, and pass/fail status of each test case.
​

**Project Structure**

```markdown
/RobotMonitorProject
├── Documentation
│   ├── RobotMonitor Main.rtf      // VDM-SL Specification
│   ├── ROMAdvancedTest.rtf          // Advanced test cases for VDM-SL
│   └── sampleTestDocumentation.docx // Detailed test documentation
├── src
│   ├── Move.java                    // Enumeration for move directions
│   ├── RobotMonitor.java            // Core Java implementation of robot movements
│   ├── VDMException.java            // Custom exception for VDM errors
│   ├── RobotGUI.java                // Swing-based GUI implementation
│   ├── RunRobotGUI.java             // Main class to run the GUI application
│   └── RunRobotText.java            // Main class to run the text-based application
└── Project Files (e.g., TASK C files-20250324.iml)
```

**Features**

Formal Specification:
The VDM-SL model defines types, initial state, invariants, and operations to ensure the robot always remains within the grid and avoids invalid moves.

Robust Implementation:
The Java implementation enforces preconditions (e.g., preventing moves beyond grid boundaries and avoiding repeated moves in the same direction) and maintains state consistency through invariant validation.

**Dual User Interfaces:**

GUI: Provides an intuitive graphical representation of the grid and robot movements.

Text-Based Interface: Offers a command-line alternative for environments without GUI support.

Comprehensive Testing:
Detailed test documentation supports verification of both the model and implementation, ensuring robust operation through a variety of test cases and edge conditions.

Custom Error Handling:
The use of a dedicated VDMException helps in identifying and debugging errors related to invariant violations or illegal state transitions.

# Getting Started

Prerequisites
Java Development Kit (JDK): Version 8 or higher is recommended.

IDE or Text Editor: For editing and compiling Java code.

VDM Tools: If you wish to work with the formal VDM-SL specification.

Compiling and Running the Application
For the GUI Version:

Compile:

```markdown

javac *.java
Run the GUI:
```


```markdown
java RunRobotGUI
For the Text-Based Version:
Compile:
```


```markdown
javac *.java
Run the Text Interface:
```


```markdown
java RunRobotText
```

**Testing**

Testing is an integral part of the Robot Monitor Project. The testing framework covers:

Invariant Checking: Verifies that the robot's state remains valid after each operation.

Precondition and Postcondition Testing: Confirms that each movement operation adheres to its defined behavior.

Edge Cases: Includes tests for boundary conditions (e.g., attempting to move outside the grid or repeating the same move consecutively).

Exit Operation: Tests that the robot resets correctly only when at the designated exit position (6,6).

For detailed test cases and outcomes, please refer to:

ROMAdvancedTest.rtf
​

sampleTestDocumentation.docx
​

**Future Work**
Enhanced Features: Further enhancements may include additional movement logic, sensor integration, or support for more complex grid operations.

Extended Testing: Automating the test suite and expanding test coverage for further reliability.

User Interface Improvements: Refining the GUI for better usability and adding visual feedback for more interactive robot control.
