package lab3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        ArrayList<String> list  = new ArrayList<String>();
        
        Scanner reader = new Scanner(System.in);

       String input;

       while(true){
        System.out.println("Enter a word: ");
        input = reader.nextLine();
        if(list.contains(input)){
            System.out.println("You have entered word " + input + " twice");
            break;
        } else {
            list.add(input);
       } 
       }   
    }
}

