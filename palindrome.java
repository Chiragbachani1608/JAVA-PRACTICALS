import java.util.*;
class Q8a{ public static void main (String args[]) {
Scanner sc= new Scanner(System.in);
System.out.print("Enter String");
String str=sc.nextLine();
int a= str.length()-1;
int flag=0;
for(int i=0;i<(a)/2;i++){
if(str.charAt(i)!=str.charAt(a-i)){
flag=1;
break;}}
if (flag==0)
System.out.print("Palindrome");
else
System.out.print("Not Palindrome");
}}