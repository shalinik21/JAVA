public class MethodOverloading {

    // public static void tellJoke()
    // {
    //     System.out.println("I invented a new word Plagarism");
    // }

    // public static void change(int a[]){
    //     a[0]=98;
    // }

    // public static void main(String args[]){
    //     //tellJoke();
    //     int [] marks ={52,73,77,89,98,94};

    //     //Case 1 : Changing the integer
    //     // int x=45;
    //     // change(x);
    //     // System.out.println("X after running change is: "+x);

    //     //case 2 : Changing the array
    //     // marks is a reference to the array object i.e where the array is

    //     change(marks);
    //     System.out.println(marks[0]);

    // }



    //METHOD OVERLOADING

    static void foo(){
        System.out.println("Good Morning Bro!");

    }
    //we cannot do method overloading with same parameter and differnt return type.
    //It will throw an error
    
    static void foo(String a)
    {
        System.out.println("Good Morning "+a);
    }

    public static void main(String args[]){

        foo();
        foo("Shalini");
        //arguments are actual

    }
}
