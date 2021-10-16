public class RemoveDigits {
    public static void main (String args[])
    {
       //Remove special characters from given string
        String removespecial = "Rajesh Patel's home number  0751254698 £50.00 Java & Selenium * * *";
        String amendremoveword = removespecial.replaceAll("[^a-zA-Z0-9]", " ");
        System.out.println( amendremoveword);
        //Remove digits from given string
        String replaceremovedigits = removespecial.replace("  0751254698 £50.00", "");
        System.out.println(replaceremovedigits);
        //Extract numbers from given string
        String rextractno = removespecial.replaceAll("\\D+","");
        System.out.println(rextractno);
        //Remove word ‘Java’ from given string
        String wordremoveword = removespecial.replace(" Java", "");
        System.out.println( wordremoveword);
    }
}
