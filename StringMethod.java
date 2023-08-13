public class StringMethod {

    public static void main(String args[]){

        String name ="Shalini";
        //name.length method is used to return the length of the String
        int value = name.length();
        System.out.println(value);

        //tolowercase & touppercase 
        String lstring= name.toLowerCase();
        System.out.println(lstring);

        String uString= name.toUpperCase();
        System.out.println(uString);

        System.out.println(name);

        /*Trim :It trims the extra spaces from sides of the
              string but doesnot affect the in between spaces*/

        String nonTrimmedString = "     Shalini  is  ";
        System.out.println(nonTrimmedString);
        //String trimmedString;
        System.out.println(nonTrimmedString.trim());

        //Substring(int start)
        //Substring(int start,int end) catch:End index is not included
        System.out.println(name.substring(0,3));

        //replace
        System.out.println(name.replace('i','o'));

        //startwith
        System.out.println(name.startsWith("Sh"));
        System.out.println(name.endsWith("ni"));
        
        //charAt()
        System.out.println(name.charAt(4));
        //indexOf()
        System.out.println(name.indexOf('l'));
        //indexof("s",3)
        System.out.println(name.indexOf('l',3));
        //lastindexOf()
        System.out.println(name.lastIndexOf('i'));
        //lastindexOf()
        System.out.println(name.lastIndexOf('i',3));
        //equals("")
        System.out.println(name.equals("shalini"));
        //equalsIgnoreCase("")
        System.out.println(name.equalsIgnoreCase("shalini"));
    }
}
