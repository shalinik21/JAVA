public class Arrays {
    public static void main(String args[]){

        // int []marks ={76,89,90,92,94};
        // for(int i=0;i<marks.length;i++){

        //     System.out.println("Marks of index "+i+" is " +marks[i]);

        // int []marks=new int[5];//Allocates 5 memory spaces in the heap
        // marks[0]=80;
        // marks[1]=78;
        // marks[2]=78;
        // marks[3]=78;
        // marks[4]=78;

        // System.out.println(marks[3]);

        //Displaying elements in reverse order

        int []marks={1,2,3,4,5,6};
        for(int i=marks.length-1;i>=0;i--){

            System.out.print(marks[i] + " ");

        }
        System.out.println();
        
        //Printing using "for each loop"
        //for each loop is introduced in new version of
        for(int element:marks){
            System.out.println(element);
        }

        
     }
    
    
}
