public class ReplaceSpace {
    public static void main(String args[])
    {
        String sentence ="Rajesh Patel's home number  0751254698 £50.00 Java & Selenium * * *";
        //Remove  spaces  from given string
        /*
        Classname(String) variablename = variable.replace(old char, New char);
        System.out.println( replacevariablename);
         */
        //String replacesentence = sentence.replace(" ", "");//replaces all spaces in given string

         /*
        Classname(String) variablename = variable.replace(regex, replacement);
        System.out.println( replacevariablename);
         */
        String replacesentence =sentence.replaceAll("\\s","");
        System.out.println(replacesentence);
    }
}
