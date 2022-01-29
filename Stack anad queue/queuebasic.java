
import java.io.*;
import java.util.*;

public class Main {

public static void main(String [] args) throws Exception {
 
 Scanner sc=new Scanner(System.in);
 Queue<Integer> q =new ArrayDeque();
 
//Queue<Integer> q =new Queue(); is wrong beacuse queue is an  interface and you can not instantiation .i.e object can not created 

// here note that q is an reference and new ArrayDequeue() creat an onject in heap whose refereancae  we are storing in q variable or reference variabl 

// here arraydequeue is also an arraylist

// we can create queue by using two methos 
// 1st by using arraylisy and 2nd by using linked list

q.add(10);
System.out.println(q.peek());
System.out.println(q);

q.offer(20);
System.out.println(q.peek());
System.out.println(q);

q.add(30);
System.out.println(q.peek());
System.out.println(q);

q.add(40);
System.out.println(q.peek());
System.out.println(q);

System.out.println(q.remove());
System.out.println(q);

System.out.println(q.poll());
System.out.println(q);

System.out.println(q.remove());
System.out.println(q);

System.out.println(q.remove());
System.out.println(q);
 
// here add() remove() peek() is constant operation i.e o(1) and display is order(n)

// in queue 
// to inset we are add(data) offer(data)
// to remove we use remove() or poll()

// to get an eleemtn at top we use peek()


  
  }
}
