## QUESTION ARRAY NUMBER
1. If the contents of each element of the array num are changed with numbers 5.0, 12867,
7.5, 2000000. What happens? How can it be like that?
2. Modify the program code by initializing the array elements at the same time when
declaring the array.
3. Change the statement in step 6 to be like this
What is the result? How can it be like that?
4. If the condition in the for-loop statement is changed to i <= 4, what is the output of
the program? Why is the result like that?
5. Commit and push the changes to GitHub.

## ANSWER ARRAY NUMBER
1.the program will not work when using int[] num. its because int is only work for whole number not a decimal. the program will be work if we use a double data type. becausedauble data type support with decimal number
3. the result 
## ANSWER ARRAY VALUE
1.The change makes the program dynamic, because using finalScores.length allows the loop to follow the real array size instead of using a fixed number.
2. Loop akan berjalan selama i masih berada dalam batas index array.
3. explanation is i starts at 0, each loop i increases by 1, num[i] prints the correct element based on index
4.If the condition is changed to i <= 4, the loop will run 5 times and then Java will produce ArrayIndexOutOfBoundsException because the array only has valid index 0–3, but the loop reaches index 4

## QUESTION ARRAY VALUE
1. Change the statement in step 5 to be like this
Run the program. Have there been any changes? How can it be like that?
Programming Fundamentals 2025
4
Programming Fundamentals Teaching
Team 2025
Politeknik Negeri Malang
2. Apa yang dimaksud dengan kondisi i < finalScore.length?
3. Change the statement in step 6 to be like this, so that the program only displays the
grades of students who passed, students who have a score > 70
Run the program and describe the flow of the program!
4. Modify the program so that it displays all students, and mark which one passed, and
which did not!
5. Commit and push the changes to GitHub.

## ANSWER ARRAY VALUE
1.The change makes the program dynamic, because using finalScores.length allows the loop to follow the real array size instead of using a fixed number.
2. Loop akan berjalan selama i masih berada dalam batas index array.
3. first the program ask a score if the score less then 70 theres no passed output, if we put score above 70 then the output will show a passed output.


## QUESTION ARRAY AVERAGE SCORE
1. Modify the program in Experiment 3 so that the program can display the number of
students who passed, students who have a score greater than 70 (>70)
2. Modify the program in Experiment 3 so that it can produce output like the following
display
3. Commit and push the changes to GitHub

## ANSWER ARRAY AVERAGE SCORE
THE ANSWER WAS IN REPOSITORY THAT IVE PUSH BEFORE

## QUESTION LINEAR SEARCH
1. Explain the meaning of the break; statement on line 13 of the program code in
Experiment 4.
2. Modify the program code in experiment 4 so that the program can receive input
in the form of the number of array elements, the contents of the array, and the
key you want to search for. Then, print to the screen the index of the element
positions of the searched key. Example of program results:
3. Modify the program in experiment 4 so that the program will give the message
"key not found" if the key is not in the array. Example of program results:

## ANSWER LINEAR SEARCH
1. Without break;, the loop would keep running until the end, even though the key was already found earlier.
2.


