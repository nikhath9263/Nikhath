class MyException extends Exception {
MyException (String message){
super(message);
}
}
public class DivisionByZero{
public static void main(String []args){
int a=10;
int b=0;
try{
if(b==0){
throw new MyException("Cannot divide by zero");
}
System.out.println(a/b);
}
catch(MyException e){
System.out.println(e.getMessage());
}
finally{
System.out.println("Finally block executed");
}
}
}
