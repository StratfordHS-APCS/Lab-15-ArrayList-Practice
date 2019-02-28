[![Build Status](https://travis-ci.com/StratfordHS-APCS/lab-15-arraylist-practice-username.svg?token=L8ZuTUsXtxKqevAPVWLC&branch=master)](https://travis-ci.com/StratfordHS-APCS/lab-15-arraylist-practice-username)

# Lab 15 - ArrayList Practice

## Lab Goal
This lab is designed to give you some more practice with ArrayList syntax and usage while completing some problems.

## Instructions
 * Complete the `filterRange` method.  This method receives an ArrayList and two integers as a parameter.  You will remove any values between the two integers (including the two integers) from the ArrayList.  You do not need to make a new ArrayList or return anything because operating on the ArrayList parameter alters the original ArrayList.
 * Complete the `interleave` method.  This method receives to ArrayLists as parameters.  You will interleave list2 into list1 in the order list1[0], list2[0], list1[1], list2[1], etc.  If there are any values left in a list after exhausting the other list, just add them onto (or leave them on) the end of list1.
 * Complete the `minToFront` method.  This method receives an ArrayList as a parameter.  You will move the smallest value in the list to the front of the list while preserving the order of the rest of the list.
 * Edit the `main` method to test each of the previous 3 methods.
 * Make sure you add a javadoc comment on each method.  You'll need to include a `@param` tag for each method that accepts a parameter.  Include a `@return` tag on any method that returns a value.

## Notes
* Checkstyle config link is http://www.daveavis.com/cs/checkstyle_SHS.xml
* After cloning your repo from GitHub you can open your code in BlueJ by double clicking on the **package** file.
* Edit the first line of the Readme.md file and put your username in both locations that say "username".  This is necessary if you want the badge at the top of the instructions to show red or green based on your most recent commit.

## Grading
* 30 - `filterRange`
* 30 - `interleave`
* 30 - `minToFront`
* 10 - style

Note that these are potential maximums; the computer can only check so much.  If your code passes Checkstyle, but I see non-descriptive variable names, then your style grade will go down.  If your code passes all tests, but I see code that was copied off of the internet or from another student your grade will go *way* down.
