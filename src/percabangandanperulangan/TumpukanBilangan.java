package percabangandanperulangan;

import java.util.EmptyStackException;
import java.util.Stack;

public class TumpukanBilangan {

static void showPush(Stack st, int a){
 st.push(new Integer(a));
 System.out.println("Push (" +a+ ")");
 System.out.println("Stack: "+st);
 }

 static void showPop(Stack st){
 System.out.print("Pop -> ");
 Integer a = (Integer) st.pop();
 System.out.println(a);
 System.out.println("Stack: " + st);
 }


 public static void main(String[] args) {
 Stack st = new Stack();
 System.out.println("Stack: "+st);
 showPush(st, 1);
 showPush(st, 5);
 showPush(st, 10);
 showPush(st, 20);
 showPush(st, 30);
 showPop(st);
 showPop(st);
 try {
 showPop(st);
 } catch (EmptyStackException e) {
 System.out.println("Error, pesan: " 
         +e.getMessage());
 }
 }
}
