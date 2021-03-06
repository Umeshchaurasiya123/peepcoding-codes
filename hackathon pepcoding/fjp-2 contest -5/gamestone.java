There is a collection of rocks where each rock has various minerals embeded in it. Each type of mineral is designated by a lowercase letter in the range . There may be multiple occurrences of a mineral in a rock. A mineral is called a gemstone if it occurs at least once in each of the rocks in the collection.

Given a list of minerals embedded in each of the rocks, display the number of types of gemstones in the collection.

Example

The minerals  and  appear in each rock, so there are  gemstones.

Function Description

Complete the gemstones function in the editor below.

gemstones has the following parameter(s):

string arr[n]: an array of strings
Returns

int: the number of gemstones found
Input Format

The first line consists of an integer , the size of .
Each of the next  lines contains a string  where each letter represents an occurence of a mineral in the current rock.

Constraints


 | arr[i] | 
Each composition  consists of only lower-case Latin letters ('a'-'z').

Sample Input

STDIN       Function
-----       --------
3           arr[] size n = 3
abcdde      arr = ['abcdde', 'baccd', 'eeabg']
baccd
eeabg
Sample Output

2
Explanation

Only  and  occur in every rock.
  //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  
  
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

class Result {

    /*
     * Complete the 'gemstones' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING_ARRAY arr as parameter.
     */

    public static int gemstones(List<String> arr) {
    // Write your code here
        int [] freqarray= new int[26];
        //first we get string from array of string 
        for(int i=0;i<arr.size();i++)
        {
            String s=arr.get(i);
            //ones we get string  array ofstring  now time to get character
            //here we are creating frequacy array for each string localy
            int [] tempfreq=new int [26];
            for(int j=0;j<s.length();j++)
            {
                char ch=s.charAt(j);
                if(ch>='a'&&ch<='z')
                {
                    tempfreq[ch-'a']++;
                    
                }
                
            }
            // After exit of this for loop we get freq array of each string but problem is freq array may
            //counten freqancy value more then one,ie one character may be present more then one in one string                //but charater to become game stone it is impoertant that 
            //length of string array is equal to freqancy of charter in total aaya string .
            //here we basicallu make freqany of each hareter which is one or more then one to becomes one 
            for(int j=0;j<26;j++)
            {
                if(tempfreq[j]>0)
                {
                    freqarray[j]=freqarray[j]+ 1;
                }
                
            }
                    
        }// now 
        
          int countofgamestone =0;
            for(int i=0;i<26;i++)
            {
                if(freqarray[i]==arr.size())
                {
                    countofgamestone++;
                }
            }
        
        
        return countofgamestone;    
        
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> arr = IntStream.range(0, n).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        int result = Result.gemstones(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

  
  
  
