
// stack to  queue adapet means we are creating queue using stack.



import java.io.*;
import java.util.*;

public class Main {

  public static class StackToQueueAdapter {
    Stack<Integer> mainS;
    Stack<Integer> helperS;

    public StackToQueueAdapter() {
      mainS = new Stack<>();
      helperS = new Stack<>();
    }

    int size() {
      // write your code here
        return mainS.size();
    }

    void add(int val) {
      // write your code here
      mainS.push(val);
    }

    int remove() {
      // write your code here
      if(size()==0){
        System.out.println("Queue underflow");
        return -1;
      }

      while(size()>0){ // here size() reperse mainS.size();

        helperS.push(mainS.pop());
      }
      int val=helperS.pop();
      while(helperS.size()>0){

        mainS.push(helperS.pop());
      }

    return val;

    }

    int peek() {

        if(size()==0){
        System.out.println("Queue underflow");
        return -1;
      }

      while(size()>0){ // here size() reperse mainS.size();

        helperS.push(mainS.pop());
      }
      int val=helperS.peek();
      while(helperS.size()>0){

        mainS.push(helperS.pop());
      }

    return val;



      // write your code here
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StackToQueueAdapter qu = new StackToQueueAdapter();

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("add")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        qu.add(val);
      } else if (str.startsWith("remove")) {
        int val = qu.remove();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("peek")) {
        int val = qu.peek();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("size")) {
        System.out.println(qu.size());
      }
      str = br.readLine();
    }
  }
}

//=================================================================================================================================================================================


add 10
add 20
add 30
add 40
add 50
remove
remove
add 60
add 70
peek
remove
peek
remove
peek
remove
peek
remove
peek
remove
peek
remove
quit

//===================================================================================================================================================================
// output
10
20
30
30
40
40
50
50
60
60
70
70
Queue underflow
Queue underflow

