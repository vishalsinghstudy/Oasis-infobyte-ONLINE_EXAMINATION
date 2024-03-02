## ONLINE EXAMINATION
# Online Test Java Program

This is a simple Java program that creates a multiple-choice quiz GUI using the Swing library. The quiz has 10 questions, each with four possible answers, and the user can navigate through the questions using "Next" and "Bookmark" buttons. The user's score is displayed at the end of the quiz.

## Screenshots
Here are some screenshots of the quiz GUI:

![App Screenshot](https://github.com/vishalsinghstudy/Oasis-infobyte-ONLINE_EXAMINATION/blob/main/image/Screenshot%201.png)
![App Screenshot](https://github.com/vishalsinghstudy/Oasis-infobyte-ONLINE_EXAMINATION/blob/main/image/Screenshot%202.png)
![App Screenshot](https://github.com/vishalsinghstudy/Oasis-infobyte-ONLINE_EXAMINATION/blob/main/image/Screenshot%203.png)
![App Screenshot](https://github.com/vishalsinghstudy/Oasis-infobyte-ONLINE_EXAMINATION/blob/main/image/Screenshot%204.png)

## How to Run
To run the program, follow these steps:
1. Install a Java Development Kit (JDK) if you haven't already.
2. Save the code in a file named `OnlineTest.java`.
3. Open a terminal or command prompt and navigate to the directory where you saved the file.
4. Compile the code by running `javac OnlineTest.java`.
5. Run the program by executing `java OnlineTest`.

## Code Overview
Here's a brief overview of the classes and methods used in this program:

## Classes
- `OnlineTest`: This is the main class that extends `JFrame` and implements `ActionListener`. It creates the quiz GUI and handles user input.
- `JFrame`, `JLabel`, `JRadioButton`,` JButton`, `ButtonGroup`: These are Swing classes used to create the GUI components.

## Methods
- `OnlineTest(String s)`: This is the constructor of the `OnlineTest `class, which initializes the quiz GUI with the given title.
- `actionPerformed(ActionEvent e)`: This method is called when the user clicks on the "Next", "Bookmark", or "Result" buttons. It handles the user input and updates the GUI accordingly.
- `set()`: This method sets the question text and answer options based on the current question index.
- `check()`: This method checks if the selected answer for the current question is correct.

The main method creates an instance of the OnlineTest class with the title "Online Test Of Java", which starts the quiz.

Note: The quiz questions, answer options, and correct answers are hard-coded in the set() and check() methods. In a real-world scenario, you would likely want to load this information from a file or a database to make the quiz more flexible and customizable.

## License
This project is licensed under the MIT License - see the LICENSE.md file for details

## 🔗 Contact 
[![portfolio](https://img.shields.io/badge/my_portfolio-000?style=for-the-badge&logo=ko-fi&logoColor=white)](https://github.com/vishalsinghstudy)
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](linkedin.com/in/vishal-kumar-singh-492920256)
