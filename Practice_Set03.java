public class Practice_Set03 {
    public static void main(String args[]){
        
        //Problem 1

        float marks[]={6.7f,8.9f,7.8f,8.6f,5,6f};
        float Total_marks = 0;

        for(int i =0;i<marks.length;i++){

            Total_marks= marks[i] + Total_marks ;
        }

        System.out.println(Total_marks);

        //Problem 2

        float num = 8.9f;
        for(int i=0;i<marks.length;i++){
            if(num==marks[i]){

                System.out.println(num+" is present at index "+i);
            }
        }

        //Problem 3

        int M []={76,87,89,90,99};
        int T_M =0;
        for(int element:M){
            T_M=T_M + element;
        }
        System.out.println("Average marks:"+(T_M/M.length));

        //Problem 4 
        //Matrix Addition

        int m[][]=new int[2][3];
        int n[][]=new int[2][3];

        m[0][0]=40;
        m[0][1]=50;
        m[0][2]=60;
        m[1][0]=70;
        m[1][1]=80;
        m[1][2]=90;

        n[0][0]=42;
        n[0][1]=52;
        n[0][2]=62;
        n[1][0]=72;
        n[1][1]=82;
        n[1][2]=92;


        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
            m[i][j]=m[i][j]+n[i][j];

            }
            
        }

        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                System.out.print(m[i][j]+" ");

            }

            System.out.println();
            
        }

     }
}        
    

       


        



    

