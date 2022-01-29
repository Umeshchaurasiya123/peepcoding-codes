

import java.io.*;
import java.util.*;

public class Main {


// here we are implemeneting stack using likedlist

 public static class LLToStackAdapter {
    LinkedList<Integer> list;
    // creating an reference 
    
// here LinkedList is a part of colllection framwork procided by java.util.*
    // basically it is an class which contain data member and member funtion already defied and we have to just use it 
// LinkedList is data struct which is use to implement implement Doublely linkedlist but sinle can also be implement.

//LinkedList<integer>=new LinkedList() allow us to creat object of LinkedList datastructure

// LinkedList<String> =new LinkedList() crete an object of LinkedList data structure where data part is of type string 

// here note that size(), addFirst(val), addLast() is a function which is alredy defiend in class LinkedList
// we are using it by using its obj 

    public LLToStackAdapter() {
      list = new LinkedList<>();
      // creating and object
    }


    int size() {
      return(list.size());
    }

    void push(int val) {
      list.addFirst(val);
    }

    int pop() {
      if(list.size()==0){
          System.out.println("Stack underflow");
          return -1;
      }
      return list.removeFirst();
    }

    int top() {
       if(list.size()==0){
          System.out.println("Stack underflow");
          return -1;
      }
      return list.getFirst();
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    LLToStackAdapter st = new LLToStackAdapter();

    String str = br.readLine();
    while(str.equals("quit") == false){
      if(str.startsWith("push")){
        int val = Integer.parseInt(str.split(" ")[1]);
        st.push(val);
      } else if(str.startsWith("pop")){
        int val = st.pop();
        if(val != -1){
          System.out.println(val);
        }
      } else if(str.startsWith("top")){
        int val = st.top();
        if(val != -1){
          System.out.println(val);
        }
      } else if(str.startsWith("size")){
        System.out.println(st.size());
      }
      str = br.readLine();
    }
  }
}




//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Linked List is a part of the Collection framework present in java.util package. 
 This class is an implementation of the LinkedList data structure which is a linear data structure where the elements are not stored in contiguous locations
  and every element is a separate object with a data part and address part.
   The elements are linked using pointers and addresses. Each element is known as a node. 
   \Due to the dynamicity and ease of insertions and deletions, they are preferred over the arrays. 
   It also has a few disadvantages like the nodes cannot be accessed directly instead we need to start from the head and follow through the link to reach a node we wish to access.
   
  Java LinkedList class
Java LinkedList class hierarchy
Java LinkedList class uses a doubly linked list to store the elements.
  It provides a linked-list data structure. It inherits the AbstractList class and implements List and Deque interfaces.
