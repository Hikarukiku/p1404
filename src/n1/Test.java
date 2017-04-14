package n1;

import java.util.Scanner;

/**
 * Created by admin on 14.04.2017.
 */
public class Test {
    public static void main(String[] args) {
        ToDoList list = new ToDoList();

        System.out.println("1.add;\n2.delete;\n3.view.");

        Scanner s = new Scanner(System.in);
        while (true){
            System.out.println("Enter key:");
            String cmd = s.nextLine();
            switch (cmd){
                case "1":{
                    System.out.println("Enter message");
                    String msg = s.nextLine();
                    list.add(msg);
                    break;
                }
                case "2":{
                    System.out.println("Enter id:");
                    int id = Integer.parseInt(s.nextLine());
                    break;
                }
                case "3":{
                    list.view();
                    break;
                }
            }
        }
    }
}
