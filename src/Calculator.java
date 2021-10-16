public class Calculator
{ //instance variable or non-static variables - declared globally without static keyword
    int a = 20; int b = 40;
    //no return type non parameterised static method
    public static void addition() { //create the object
        Calculator calculator = new Calculator();
        System.out.println(calculator.a+ calculator.b);}
    public static void subtraction() {Calculator calculator = new Calculator();
        System.out.println(calculator.a - calculator.b);}
    public static void multiply() {Calculator calculator = new Calculator();
        System.out.println(calculator.a * calculator.b);}
    public static void division() {Calculator calculator = new Calculator();
        System.out.println(calculator.b / calculator.a );}
    public static void main (String args[]) {
        Calculator.addition(); // calling static method addition() inside the main method
        Calculator.subtraction();
        Calculator.multiply();
        Calculator.division();}
}
