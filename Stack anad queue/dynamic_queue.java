

import java.io.*;
import java.util.*;

public class Main {

  public static class CustomQueue {
    int[] data;
    int front;
    int size;
    int rear;

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
      // write ur code here
      for(int i = 0; i < size; i++){
        int idx = (front + i) % data.length;
        System.out.print(data[idx] + " ");
      }
      System.out.println();
    }

    // change this code
    void add(int val) {
      // write ur code here
      if(size() == data.length){
        int [] temp=new int[2*data.length];

        int idx=front;
        int j=0;
        int counter=size();
        while(counter>0){

          temp[j]=data[idx];
          j++;
          idx=(idx+1)%data.length;
          counter--;


        }

        front=0;
        rear=size();
        data=temp;

        data[rear]=val;
        rear=(rear+1)%data.length;
        size++;
        
      } else {
        //int idx = (front + size) % data.length;
        data[rear]=val;
        rear=(rear+1)%data.length;
        //data[idx] = val;
        size++;
      }
    }

    int remove() {
      // write ur code here
      if(size == 0){
        System.out.println("Queue underflow");
        return -1;
       } else {
        int val = data[front];

        front = (front + 1) % data.length;
        size--;

        return val;
       }
    }

    int peek() {
       // write ur code here
       if(size == 0){
        System.out.println("Queue underflow");
        return -1;
       } else {
        int val = data[front];
        return val;
       }
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


//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//input
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
10 20 30 40 50 60 
10
10
20 30 40 50 60 
20
20
30 40 50 60 
30
30
40 50 60 
40
40
50 60 
50
50
60 
60
60

