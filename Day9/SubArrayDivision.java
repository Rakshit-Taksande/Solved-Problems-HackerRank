/**
Two children, Lily and Ron, want to share a chocolate bar. Each of the squares has an integer on it.

Lily decides to share a contiguous segment of the bar selected such that:

The length of the segment matches Ron's birth month, and,
The sum of the integers on the squares is equal to his birth day.
Determine how many ways she can divide the chocolate.

Example



Lily wants to find segments summing to Ron's birth day,  with a length equalling his birth month, . In this case, there are two segments meeting her criteria:  and .

Function Description

Complete the birthday function in the editor below.

birthday has the following parameter(s):

int s[n]: the numbers on each of the squares of chocolate
int d: Ron's birth day
int m: Ron's birth month
Returns

int: the number of ways the bar can be divided
Input Format

The first line contains an integer , the number of squares in the chocolate bar.
The second line contains  space-separated integers , the numbers on the chocolate squares where .
The third line contains two space-separated integers,  and , Ron's birth day and his birth month.

Constraints

, where ()
Sample Input 0

5
1 2 1 3 2
3 2
Sample Output 0

2
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



public class SubArrayDivision {
    public static void main(String[] args) throws IOException {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=scan.nextInt();
        int d=scan.nextInt();
        int m=scan.nextInt();
        int answer=0;
        int sum=0;

        for(int i=0;i<n-m+1;i++)
        {
            for(int j=i;j<i+m;j++)
                sum+=arr[j];
            if(sum==d)
                answer+=1;
            sum=0;
        }
        System.out.println(answer);


    }
}

/**
Input (stdin) :-
5
1 2 1 3 2
3 2

Your Output (stdout):-
2

Expected Output:-
2

 */