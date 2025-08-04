import  java.util.ArrayList;
import java.util.List;
import  java.util.Scanner;

public  class Main {
public static void main(String[] args) {
    List<String> names = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    int counter = 5;
    for (int i = 0 ; i < counter; i++ ){
        System.out.println("Please enter a Name !");
        String input = scanner.nextLine();
        names.add(input);
    }
    System.out.println(names);
    String i ;
    int c = 1;
    for (String elem : names) {
        i = String.format("name : %s is position %d" , elem , c);
        System.out.println(i);
        c += 1;
    }
} 
}
