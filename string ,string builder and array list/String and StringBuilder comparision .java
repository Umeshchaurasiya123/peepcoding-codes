




import java.io.*;
import java.util.*;

public class Main {
    
    public static void fun(String x, StringBuilder y)
    {
        //now here we collect 4k in x and 6k in y 
        //now as we know string are immutable that leads to creation of new object in   x=x+" is changed";
        //and refrencd varablr point to that new objecct
        //in case of y StringBuilder is mutable that leads to chage happaning in place 6k place it will reflect in whole program
        
        x=x+" is changed";
        y=y.append(" is changed");
        
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String str="String";
        StringBuilder strb=new StringBuilder("StringBuilder");
        fun(str,strb);
        System.out.println(str);
        System.out.println(strb);
        
      //  ----------------------------------------------------------------------------------------------------------------------------
		//output
	   //String
        //StringBuilder is changed
        //from main we are passing refren of string and string bulder supoose 4k and 6k
        

	}

}
