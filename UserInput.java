import java.util.Scanner;

class Userinput{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        System.out.println("My name is "+ name);

        sc.close();
    }

}
    
