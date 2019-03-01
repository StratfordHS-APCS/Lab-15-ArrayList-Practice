[![Build Status](https://travis-ci.com/StratfordHS-APCS/lab-15-arraylist-practice-username.svg?token=L8ZuTUsXtxKqevAPVWLC&branch=master)](https://travis-ci.com/StratfordHS-APCS/lab-15-arraylist-practice-username)

# Lab 15 - ArrayList Practice

## Lab Goal
This lab is designed to give you some more practice with ArrayList syntax and usage while completing some problems.

## Instructions for the following questions
Trace the code by hand, then enter your answers in the table below.  Commit your code (you don't have to push yet), then test your answers in BlueJ. If your answers were wrong, fix them, then add a brief comment describing why you got it wrong.  Commit again after fixing your answers and push when the lab is completed or the class period is over.  Doing this will let me see your original answers, your corrected answers, and what you think you were doing wrong so we can address it, if necessary.

## Question 1

Consider the following method:

```
public static void mystery1( ArrayList<Integer> list )
{
	for( int i = list.size() - 1; i > 0; i-- )
	{
		if( list.get(i) < list.get( i - 1 ) )
		{
			int element = list.get(i);
			list.remove(i);
			list.add(0, element);
		}
	}
	System.out.println( list );
}
```

Write the output produced by the method when passed each of the following ArrayLists:

|Input|Output|
|-----|------|
|`[2, 6, 1, 8]`|`your answer here`|
|`[30, 20, 10, 60, 50, 40]`|`your answer here`|  
|`[-4, 16, 9, 1, 64, 25, 36, 4, 49]`|`your answer here`|

Description of errors:

## Question 2

Consider the following method:

```
public static void mystery2( ArrayList<Integer> list )
{
	for( int i = list.size() - 1; i >= 0; i-- )
	{
		if( i % 2 == 0 )
		{
			list.add( list.get(i) );
		} else {
			list.add( 0, list.get(i) );
		}
	}
	System.out.println( list );
}
```

Write the output produced by the method when passed each of the following ArrayLists:

|Input|Output|
|-----|------|
|`[10, 20, 30]`|`your answer here`|
|`[8, 2, 9, 7, 4]`|`your answer here`|  
|`[-1, 3, 28, 17, 9, 33]`|`your answer here`|

Description of errors:

## Question 3

Consider the following method:

```
public static void mystery3( ArrayList<Integer> list )
{
	for( int i = list.size() -2; i > 0; i-- )
	{
		int a = list.get(i);
		int b = list.get(i+1);
		list.set(i, a+b);
	}
	System.out.println(list);
}
```

Description of errors:

Write the output produced by the method when passed each of the following ArrayLists:

|Input|Output|
|-----|------|
|`[72, 20]`|`your answer here`|
|`[1, 2, 3, 4, 5, 6]`|`your answer here`|  
|`[10, 20, 30, 40]`|`your answer here`|

## Question 4

Consider the following method:

```
public static void mystery4( ArrayList<Integer> list )
{
	for( int i = 0; i < list.size(); i++ )
	{
		int element = list.get(i);
		list.remove(i);
		list.add(0, element + 1);
	}
	System.out.println(list);
}
```

Write the output produced by the method when passed each of the following ArrayLists:

|Input|Output|
|-----|------|
|`[10, 20, 30]`|`your answer here`|
|`[8, 2, 9, 7, 4]`|`your answer here`|  
|`[-1, 3, 28, 17, 9, 33]`|`your answer here`|

Description of Errors:

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
