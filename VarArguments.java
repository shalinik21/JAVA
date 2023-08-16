public class VarArguments {

    // public static int sum(int a,int b){
    //     return a+b;
    // }

    // public static int sum(int a,int b,int c){
    //     return a+b+c;
    // }
    // public static int sum(int a,int b,int c,int d){
    //     return a+b+c+d;
    // }

    public static int sum(int x,int ...arr){
        //available as int []args
        //Here atleast one argument is compulsory.
        int result=x;
        for(int a:arr){
            result+=a;
            
        }
        return result;
    }

    public static void main(String args[]){

        System.out.println("Welcome to Varargs Tutorial");
        // System.out.println("Sum of nothing is:"+sum());
        // Since it doesnot contain any argument.
        System.out.println("Sum of 4 and 5 is:"+sum(4,5));
        System.out.println("Sum of 4, 5 and 9 is:"+sum(4,5,9));
        System.out.println("Sum of 4 ,5 ,9 and 7 is:"+sum(4,5,9,7));

    }

    
}
