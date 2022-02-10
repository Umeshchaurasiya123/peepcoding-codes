
//Queue To Stack Adapter - Push Efficient\


import java.io.*;
import java.util.*;

public class Main {

  public static class QueueToStackAdapter {
    Queue<Integer> q;

    // here we are creating a stack using queue

    public QueueToStackAdapter() {
      q = new ArrayDeque<>();
    }

    int size() {
       return q.size();
    }

    void push(int val) {
      q.add(val);
    }

    int pop() {
      // write your code here
      if(size()==0){
        System.out.println("Stack underflow");
        return -1;
      }

      for(int i=0;i<size()-1;i++){

        int value=q.remove();
        q.add(value);

      }
      int val=q.remove();
      return val;

    }

    int top() {
      // write your code here

       if(size()==0){
        System.out.println("Stack underflow");
        return -1;
      }
      int val=0;
      for(int i=0;i<size();i++){

        val=q.remove();
        q.add(val);


      }
      return val;
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    QueueToStackAdapter st = new QueueToStackAdapter();

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("push")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        st.push(val);
      } else if (str.startsWith("pop")) {
        int val = st.pop();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("top")) {
        int val = st.top();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("size")) {
        System.out.println(st.size());
      }
      str = br.readLine();
    }
  }
}


//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// input
push 10
push 20
push 5
push 8
push 2
push 4
push 11
top
size
pop
top
size
pop
top
size
pop
top
size
pop
top
size
pop
top
size
pop
top
size
pop
quit

// output
11
7
11
4
6
4
2
5
2
8
4
8
5
3
5
20
2
20
10
1
10

