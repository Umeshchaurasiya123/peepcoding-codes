

Get Maze Path With Jumps
Easy

1. You are given a number n and a number m representing number of rows and columns in a maze.
2. You are standing in the top-left corner and have to reach the bottom-right corner. 
3. In a single move you are allowed to jump 1 or more steps horizontally (as h1, h2, .. ), or 1 or more steps vertically (as v1, v2, ..) or 1 or more steps diagonally (as d1, d2, ..). 
4. Complete the body of getMazePath function - without changing signature - to get the list of all paths that can be used to move from top-left to bottom-right.
Use sample input and output to take idea about output.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

Constraints

0 <= n <= 10
0 <= m <= 10

Format

Input

A number n
A number m

Output

Contents of the arraylist containing paths as shown in sample output

Example

Sample Input

2
2

Sample Output

[h1v1, v1h1, d1]


//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int column=sc.nextInt();
        ArrayList<String> str=getMazePaths(0,0,row-1,column-1); //expectation that it will 
        //give all the path from sorce to destination
        System.out.println(str);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) 
    {
        //base case 
        if(sr==dr&&sc==dc)
        {
            ArrayList<String> base=new ArrayList();
            base.add("");
            return base;
        }


        ArrayList<String> res=new ArrayList();
        //first ham sare horizontal option ok collect karege
        
        for(int jump=1;sc+jump<=dc;jump++)
        {

        ArrayList<String> horizontal= getMazePaths(sr,sc+jump,dr,dc);

        for(String str:horizontal){
            res.add("h"+jump+str);

        }
        }
    
        //then ham sare vertical option ok collect karege
        for(int jump=1;sr+jump<=dr;jump++)
        {

        ArrayList<String> vertical= getMazePaths(sr+jump,sc,dr,dc);

        for(String str:vertical){
            res.add("v"+jump+str);
        }
        }

        //then ham sare diagnonal ko select karege

        for(int jump=1;sc+jump<=dc&&sr+jump<=dr;jump++)
        {

        ArrayList<String> diagonal= getMazePaths(sr+jump,sc+jump,dr,dc);
         for(String str:diagonal){
            res.add("d"+jump+str);
        }

        }

    return res;

    }

}
