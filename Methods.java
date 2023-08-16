import java.util.Scanner;

public class Methods {
    static void logic(int x,int y){

        if (x>y){
            System.out.println(x+" is greater");
        }
        else
            System.out.println(y+" is greater");
            
       
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int x =sc.nextInt();
        int y =sc.nextInt();

        logic(x, y);
        sc.close();
    }

    
}
