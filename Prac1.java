import java.util.*;
interface exam{
boolean pass(int marks);
}
interface classify{
 public string division(int average);
}
class result implements exam,classify {
public String division(int average) {
if(average>60) return "First Divsion";
else if(average>50) return "Second Division";
else if(average>40) return "Third Division";
else return "Failed Division";
}
public boolean pass(int marks) {
return (marks>40?true:false);
}
}
public class Prac1 {
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
result ob = new result();
System.out.println("Enter the marks of three subjects (out of hundred)");
int a =sc.nextInt();
int b =sc.nextInt();
int c =sc.nextInt();
boolean res = ob.pass((a+b+c)/3);
String div = ob.division((a+b+c)/3);
String r = (res) ? "passed" : "failed";
System.out.println("the student "+r+" with " +div);
}
}
