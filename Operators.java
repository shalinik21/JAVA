public class Operators {
    public static void main (String args[]){
        //Arithematic operators & Assignment operators
        //Remainder operator also works in decimal number
        float a =9.7f;
        float b =10.6f;
        System.out.println("sum :" + (a+b));
        System.out.println("Remainder: "+(b%a));

        //Comparision operators

        int c =10;
        int d=10;
        System.out.println(c==d);

        //Logical Operator

        System.out.println((a==d)&&(b==c));

        //Bitwise Operator
        //adds the given no. in bitwise where the no. of bits is fixed
        System.out.println(7&11);
    }
}
