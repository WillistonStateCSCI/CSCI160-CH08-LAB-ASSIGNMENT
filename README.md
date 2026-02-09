# CSCI160-CH08-LAB
Programming Exercises From Java Illuminated Book by Anderson and Franceschi  
**Before You Begin:  Keep in mind that when compiling multiple .java files, it is a good idea to use the terminal to compile and run code as you make changes.  Terminal commands are provided for problems where this is relevant.  Make sure you run BOTH commands in the terminal EVERY TIME you want to check changes in your code.**  
## Q08_62 Instructions  
*Terminal Compiling Command*  
- *javac Q08_62/\*.java*  
- *See each test for their appropriate run command* 
  
Write a class encapsulating the concept of statistics for a baseball team, which has the following attributes: a number of players, a list of number of hits for each player, a list of number of at-bats for each player.  
Write the following methods:
- A constructor with two equal-length arrays as parameters, the number of hits per player, and the number of at-bats per player  
- Accessors, mutators, *toString*, and *equals* methods  
- Generate and return an array of batting averages based on the attributes given  
- Calculate and return the total number of hits for the team.  
- Calculate and return the number of players with a batting average greater than .300  
- A method returning an array holding the number of hits, sorted in ascending order  

**Note:  A client class (BattingStatsClient.java) is provided to test all the methods in your class.  Do not make ANY changes to this client class.**
### Q08_62 Test 1
*Use Above Compile Command*  
*Terminal Run Command with Arguments:*  
- *java -cp Q08_62 BattingStatsClient 34 35 30 23 24 32 22 38 26 79 95 81 100 84 71 70 94 75*  

**Input:**  
*None*  
**Output:**  
bStat1:  
Number of players: 9  
Hits:  
34 35 30 23 24 32 22 38 26   
At bats:  
79 95 81 100 84 71 70 94 75   
  
bStat2:  
The number of players is 9  
The hits for each player are: 34 35 30 23 24 32 22 38 26   
The at-bats for each player are: 79 95 81 100 84 71 70 94 75   
Objects are equal  
  
Using mutators to change bStat2 data  
  
bStat2:  
Number of players: 9  
Hits:  
30 35 30 23 24 32 22 38 26   
At bats:  
99 95 81 100 84 71 70 94 75   
Objects are not equal  
  
bStat2 batting averages:  
.303 .368 .370 .230 .286 .451 .314 .404 .347  
  
bStat2: The total number of hits is 260  
  
bStat2: The number of players with a batting average greater than .300 is 7  
The hits are:  
30 35 30 23 24 32 22 38 26  
The sorted hits are:  
22 23 24 26 30 30 32 35 38   
### Q08_62 Test 2
*Use Above Compile Command*   
*Terminal Run Command with Arguments:*  
- *java -cp Q08_62 BattingStatsClient 20 33 35 40 25 15 21 24 36 100 99 101 100 99 75 88 90 103*  

**Input:**  
*None*  
**Output:**  
bStat1:  
Number of players: 9  
Hits:  
20 33 35 40 25 15 21 24 36   
At bats:  
100 99 101 100 99 75 88 90 103   
  
bStat2:  
The number of players is 9  
The hits for each player are: 20 33 35 40 25 15 21 24 36   
The at-bats for each player are: 100 99 101 100 99 75 88 90 103   
Objects are equal  

Using mutators to change bStat2 data  

bStat2:  
Number of players: 9  
Hits:  
30 33 35 40 25 15 21 24 36   
At bats:  
99 99 101 100 99 75 88 90 103   
Objects are not equal  

bStat2 batting averages:
.303 .333 .347 .400 .253 .200 .239 .267 .350   

bStat2: The total number of hits is 259  

bStat2: The number of players with a batting average greater than .300 is 5  
The hits are:   
30 33 35 40 25 15 21 24 36   
The sorted hits are:   
15 21 24 25 30 33 35 36 40   
## Q08_63 Instructions  
*Terminal Commands to Compile and Run*  
- *javac Q08_63/\*.java*   
  
Write a class encapsulating the concept of student grades on a test, assuming student grades are composed of a list of integres between 0 and 100.  
Write the following methods:  
- A constructor with just one parameter, the number of students; all grades can be randomly generated  
- Accessor, mutator, *toString*, and *equals* methods  
- A method returning an array of the grades sorted in ascending order  
- A method returning the highest grade  
- A method returning the average grade  
- A method returning the median grade (Hint: the median grade will be located in the middle of the sorted array of grades.)  
- A method returning the mode (the grade that occurs most often)  
  
**Note:  A client class (GradesClient.java) is provided to test all the methods in your class.  Do not make ANY changes to this client class.**  
### Q08_63 Test 1
*Use Above Compile Command*   
*Terminal Run Command with Arguments:*  
- *java -cp Q08_63 GradesClient 31 21 72 81 31 81 32 0 38 74 91*  

*Note: This activity requires you to create random values to fill g1 and g2.  So you are only graded on the printout that begins after g1 and g2 are set to studentGrades.*  
**Input:**  
*None*  
**Output:**  
Setting g1 and g2 arrays to studentGrades  
Grades: 31 21 72 81 31 81 32 0 38 74 91   
Comparing g1 and g2 for equality  
Objects are equal  
  
Sorted grades:  
0 21 31 31 32 38 72 74 81 81 91   
The highest grade is 91  
The average grade is 50.18  
The median grade is 38  
The mode is 31  

### Q08_63 Test 2
*Use Above Compile Command*   
*Terminal Run Command with Arguments:*  
- *java -cp Q08_63 GradesClient 4 15 92 31 42 55 61 78 80 23 99*  

*Note: This activity requires you to create random values to fill g1 and g2.  So you are only graded on the printout that begins after g1 and g2 are set to studentGrades.*  
**Input:**  
*None*  
**Output:**  
Setting g1 and g2 arrays to studentGrades  
Grades: 4 15 92 31 42 55 61 78 80 23 99   
Comparing g1 and g2 for equality  
Objects are equal  
  
Sorted grades:  
4 15 23 31 42 55 61 78 80 92 99  
The highest grade is 99  
The average grade is 52.73  
The median grade is 55  
The mode is 4  
