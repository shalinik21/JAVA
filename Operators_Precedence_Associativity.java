
public class Operators_Precedence_Associativity {
    public static void main(String args[])
    {
        //Precedence
        // *has higher precedence than -
        int a = 6*3-9;
        // 18-9
        //9
        System.out.println(a);

        //Associativity
        //when two operators have same precedence ,associativity comes into play

        int b = 6*6 - 60/5;
        //for * & /
        //associativity is from left to right
        //36 - 60/5
        //36-12
        //24
        System.out.println(b);

    }
}
