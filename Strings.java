public class Strings {
    public static void main(String[] args) {

        String name = new String("Shalini");
        System.out.println(name);
        //Strings objects are immutable ,they cannot be changed
        //you can make its copy and change it

        //Ways of printing 
        System.out.print("Aloo ");
        System.out.println("is potato.");
        
        String v ="Potato";
        System.out.printf("He has 20 %s %n",v);

        int x =12;
        System.out.printf("%16d\n",x);

        String date = "13th August";
        System.out.printf("%16s\n",date);
        
        String u ="Mango";
        System.out.format("He has 20 %s",u);
    }
}
