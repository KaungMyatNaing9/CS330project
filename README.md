# A Security device

## What is this project about?
In our offices or homes there are some kinds of security installation that has a keypad and an engine to decide either locking or unlocking the device depending on what user input is. As from the real life, the keypad has numbers varies from 0 to 9 and the security device will unlock or lock if the inputs are definitely same with the access code you have set before. In this project I set the lock code as 993064 and unlocking code as 993061. The purpose of this project is to use Finite Automata concepts to solve this problem. 
## Project Description
There are two parts in this project. I use java as my programming language. 

The first part takes the integer inputs from the user and check with the access code that I have set and print either unlock or lock when the access code the user type in is correct. The code will run infinite time until user want to quit the running. The java file of the first part is called coding.java.

For the second part of the project instead of user input, I changed it to random number generator that will put a random number from 0 to 9. The main purpose of the second part is to test how many random inputs the device takes to unlock the device. To do that I put a status that is locked when the program ran and the program will stop when the random number generator got the access code to unlock the device. In java file for the second part is called securitydevice.java and after running this program it will output unlock and the number of times it takes to unlock this device. 
 
## How do I get setup?
The instructions in this README file will be for Window11 power shell or Eclipse IDE (if you cannot ran in power shell).

#### Summary of setup
You must have java installed in your power shell. Big suggestion to have GitHub desktop installed in your computer, this can make the clonning easier. If you want to ran the unit test you must have gradle installed.

#### Configuration
1. Clone the repository:
```
git clone https://github.com/KaungMyatNaing9/CS330project.git
```
If you have a GitHub desktop in your computer you can use
```
gh repo clone KaungMyatNaing9/CS330project
```
2. Find the files that you have clone and change directory(cd) to the file CS330project using
```
cd CS330project
```
If you are already in that directory you can skip this step.
3. 
