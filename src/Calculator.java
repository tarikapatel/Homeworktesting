public class Calculator
{ //instance variable or non-static variables - declared globally without static keyword
    int a = 20; int b = 40;
    //no return type non parameterised static method
    public  void addition() {
        System.out.println(a+ b);}
    public  void subtraction(){
        System.out.println(a-b);}
    public void multiply(){
        System.out.println(a * b);}
    public void division() {
        System.out.println(b / a );}
    public static void main(String args[]) {
        Calculator calculator = new Calculator();//create the object
        calculator.addition(); // calling static method addition() inside the main method
        calculator.subtraction();
        calculator.multiply();
        calculator.division();}
}
