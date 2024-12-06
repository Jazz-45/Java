import java.util.Scanner;

public class Taking_Input {
  
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input you page");
        int age=sc.nextInt();
        System.out.println(age);

        System.out.println("Input your name");
        String name=sc.next();
        System.out.println(name);

        System.out.println("Input your name");
        String name2=sc.nextLine();
        System.out.println(name2);
    }
}
