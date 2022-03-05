/**
A Discrete Mathematics professor has a class of students. Frustrated with their lack of discipline, the professor decides to cancel class if fewer than some number of students are present when class starts. Arrival times go from on time () to arrived late ().

Given the arrival time of each student and a threshhold number of attendees, determine if the class is cancelled.

Example




The first  students arrived on. The last  were late. The threshold is  students, so class will go on. Return YES.

Note: Non-positive arrival times () indicate the student arrived early or on time; positive arrival times () indicate the student arrived  minutes late.

Function Description

Complete the angryProfessor function in the editor below. It must return YES if class is cancelled, or NO otherwise.

angryProfessor has the following parameter(s):

int k: the threshold number of students
int a[n]: the arrival times of the  students
Returns

string: either YES or NO
Input Format

The first line of input contains , the number of test cases.

Each test case consists of two lines.

The first line has two space-separated integers,  and , the number of students (size of ) and the cancellation threshold.
The second line contains  space-separated integers () that describe the arrival times for each student.

Constraints

Sample Input

2
4 3
-1 -3 4 2
4 2
0 -1 2 1
Sample Output

YES
NO
 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class AngryProfessor {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);

    int t=sc.nextInt();
    for(int i=0;i<t;i++)
        {
        int n=sc.nextInt();
        int k=sc.nextInt();
        int count=0;
        for(int j=0;j<n;j++)
            {
            int temp=sc.nextInt();
            if(temp<=0)
                count++;
        }
        if(count>=k)
            System.out.println("NO");
        else
            System.out.println("YES");
    }
    }
}

/**
Input (stdin):-
2
4 3
-1 -3 4 2
4 2
0 -1 2 1

Your Output (stdout):-
YES
NO

Expected Output:-
YES
NO
 */ 