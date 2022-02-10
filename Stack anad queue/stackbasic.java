import java.io.*;
import java.util.*;

public class Main {

public static void main(String [] args) throws Exception {
 
  // note 
  // stack can be created by using simple array , arraylist thay is mutable array and linked list
  
  // here we are using inbuild Stack<Wrapper class> stk=new Stack(); which is probided by java 
  // it used ArrayList for creating stack 
  
  // push(data)
  // pop()
  //peek()
  // it is all constant opration wile System.out.prinln(stk) is o(n) operation 
  // beacuse it call .toString() method wich apply loop inside to get data
  
  
 Scanner sc=new Scanner(System.in);
 Stack<Integer> stk =new Stack();
 // inicialization of an empty stack
 // here stk is reference varable of type stack 
 
 stk.push(10);
 System.out.println(stk.peek());
 System.out.println(stk);
 
 
 stk.push(20);
 System.out.println(stk.peek());
 System.out.println(stk);
 
 
 stk.push(30);
 System.out.println(stk.peek());
 System.out.println(stk);
 
 
 stk.push(40);
 System.out.println(stk.peek());
 System.out.println(stk);
 
 stk.pop();
 System.out.println(stk);
 
 
 stk.pop();
 System.out.println(stk);
 
 stk.pop();
 System.out.println(stk);
 
 
 stk.pop();
 System.out.println(stk);
 
  
  }
}



//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
10
[10]
20
[10, 20]
30
[10, 20, 30]
40
[10, 20, 30, 40]
[10, 20, 30]
[10, 20]
[10]
[]

