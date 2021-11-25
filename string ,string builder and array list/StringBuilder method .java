


import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		StringBuilder str1=new StringBuilder(str);
		//input umesh 
		
		
        System.out.println(str1.toString());
        //putput umesh
		System.out.println(str1.length()) ;
		//lenghth 5
		//-------------------------------------------------------------------------------------------------------------------------
		//traveral 
		for(int i=0;i<str1.length();i++)
		{
		    System.out.println(str1.charAt(i));
		}
		//output 
		//u
		//m
		//e
		//s
		//h
		//----------------------------------------------------------------------------------------------------------------
		// to update any character in string buildder
		//use setCharAt()
		
		str1.setCharAt(3,'d');
		
	    //here 3 is index where wwe updating and 'd 'is character with wich we are updating
	    
	    System.out.println(str1.toString());
		 //output 
		//umedh
	    //---------------------------------------------------------------------------------------------------------------------------
	
		 //delet
		 str1.deleteCharAt(3);
		 System.out.println(str1.toString());
		 //output
		 //umeh
		 //-----------------------------------------------------------------------------------------------------------------------
		 
		 //to insert any character in mutable string i.e string builder we use 
		 //.Insert(index,'character')
		 str1.insert(3,'s');
		 System.out.println(str1.toString());
		  //umesh
		  
		  //---------------------------------------------------------------------------------------------------------------------
		  //to append character or word at end we use append
		  //here double quotes for string and single quotes for character
		  str1.append(" chaurasiya");
		  str1.append('@');
		   System.out.println(str1.toString());
		
		//output
	//	umesh chaurasiya@
		 
		
		
	    
	}

}
