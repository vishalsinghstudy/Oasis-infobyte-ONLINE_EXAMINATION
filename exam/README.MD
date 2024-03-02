# Online Exam System

This is a simple online exam system implemented in Java using Swing for GUI. The system consists of a login form and an online test.

## Login Form
The `login` class creates a login form with fields for Username and Password. When the Submit button is clicked, it checks if the Password field is empty. If it is not empty, it opens the online test window with the Username as the title. If the Password field is empty, it displays a message to enter the Password.

## Online Test
The `OnlineTestBegin `class implements the online test. It has a time limit of 10 minutes, which is displayed in a label. The test consists of 10 questions, each with 4 options. The user can select an option for each question using radio buttons. The user can save and move to the next question or save for later. If the user selects "Save for later", the question is saved and can be reviewed later. The user can also review the saved questions.

The test also calculates the score of the user. For each correct answer, the score is incremented by 1. The final score is displayed in a message dialog when the user clicks on the Result button.

The questions and their correct options are hardcoded in the `set()` and `check()` methods.

## Main Method
The `main` method in the` OnlineExam` class creates an instance of the `login` class and sets the size and visibility of the window.

## Note
This is a simple implementation of an online exam system and can be improved in various ways, such as adding a database to store user information and test results, adding more features to the test like randomizing the questions, adding negative marking, etc.

## License
This project is licensed under the MIT License - see the LICENSE.md file for details

## 🔗 Contact
[![portfolio](https://img.shields.io/badge/my_portfolio-000?style=for-the-badge&logo=ko-fi&logoColor=white)](https://github.com/vishalsinghstudy)
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](linkedin.com/in/vishal-kumar-singh-492920256)
