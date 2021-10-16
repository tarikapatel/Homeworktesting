public class UpperCase {
    public static void main(String args[])
    {   //Convert to uppercase given string
        String upper = "Rajesh Patel's home number  0751254698 £50.00 Java & Selenium * * *";
        String upperCase = upper.toUpperCase();
        System.out.println(upperCase);
        //Convert to lowercase given string
        String lower = "Rajesh Patel's home number  0751254698 £50.00 Java & Selenium * * *";
        String lowerCase = lower.toLowerCase();
        System.out.println(lowerCase);
        // Find length of string given string
        System.out.println("string length is: "+upper.length());//67 is the length of string
        //Find index of P  given string
        int index1 =upper.indexOf("P"); //returns the index of is substring
        System.out.println(index1); //7
        //Remove word "Patel's"
        String word = upper.replace("Patel's", "");
        System.out.println(word);
    }
}
