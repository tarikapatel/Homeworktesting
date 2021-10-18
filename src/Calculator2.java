public class Calculator2 {
    int a= 30;
    int b= 10;
    public static void addition(){
        //Creating the object
        Calculator2 calculator2 = new Calculator2();
        System.out.println(calculator2.a + calculator2.b);}
    public static void substraction(){
        //Creating an object
        Calculator2 calculator2 = new Calculator2();
        System.out.println(calculator2.a - calculator2.b);}
    public static void multiplication(){
        //Creating an object
        Calculator2 calculator2 = new Calculator2();
        System.out.println(calculator2.a * calculator2.b);}
    public static void division(){
        //Creating an object
        Calculator2 calculator2 = new Calculator2();
        System.out.println(calculator2.a / calculator2.b);}
    public static void main(String[]args){
        //Calling the static method addition() into the main method.
        Calculator2.addition();
        //Calling the static method substraction() into the main method.
        Calculator2.substraction();
        //Calling the static method multiplication() into the main method.
        Calculator2.multiplication();
        //Calling the static method division() into the main method.
        Calculator2.division();
    }
}
