

import java.io.*;
import java.util.*;

public class Main {

  public static class CustomQueue {
    int[] data;
    int front;
    int rear;
    int size;

    public CustomQueue(int cap) {
      data = new int[cap];
      front = 0;
      rear=0;
      size = 0;
    }

    int size() {
      // write ur code here
      return size;
    }

    void display() {
      int counter=size();
      int idx=front;
      while(counter-->0){
        System.out.print(data[idx]+" ");
        idx=(idx+1)%data.length;
        //counter--;
      }
      System.out.println();
    }

    void add(int val) {
      // write ur code here
      if(size()==data.length){
        System.out.println("Queue overflow");
        return;
      }
      data[rear]=val;
      size++;
      rear=(rear+1)%data.length;
    }

    int remove() {
      // write ur code here
      if(size()==0){
        System.out.println("Queue underflow");
        return -1;
      }

      int val=data[front];
      size--;
      front=(front+1)%data.length;
      return val;

    }

    int peek() {

       if(size()==0){
        System.out.println("Queue underflow");
        return -1;
      }

      int val=data[front];
      return val;

       // write ur code here
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    CustomQueue qu = new CustomQueue(n);

    String str = br.readLine();
    while(str.equals("quit") == false){
      if(str.startsWith("add")){
        int val = Integer.parseInt(str.split(" ")[1]);
        qu.add(val);
      } else if(str.startsWith("remove")){
        int val = qu.remove();
        if(val != -1){
          System.out.println(val);
        }
      } else if(str.startsWith("peek")){
        int val = qu.peek();
        if(val != -1){
          System.out.println(val);
        }
      } else if(str.startsWith("size")){
        System.out.println(qu.size());
      } else if(str.startsWith("display")){
        qu.display();
      }
      str = br.readLine();
    }
  }
}


// input
5
add 10
display
add 20
display
add 30
display
add 40
display
add 50
display
add 60
display
peek
remove
display
peek
remove
display
peek
remove
display
peek
remove
display
peek
remove
display
peek
remove
quit

// output
10 
10 20 
10 20 30 
10 20 30 40 
10 20 30 40 50 
Queue overflow
10 20 30 40 50 
10
10
20 30 40 50 
20
20
30 40 50 
30
30
40 50 
40
40
50 
50
50

Queue underflow
Queue underflow
