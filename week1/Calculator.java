package week1;
import java.util.*;
import java.io.*;
public class Calculator {
    static void display(){
        System.out.println("1.addition");
        System.out.println("2.subtraction");
        System.out.println("3.multipication");
        System.out.println("4.division");
        System.out.println("5.modulus");
    
    }
    static int add(int a, int b){
        return a+b;
    }
    static int sub(int a, int b){
        return a-b;
    }
    static int mul(int a, int b){
        return a*b;
    }
    static double div(int a, int b){
        return a/b;
    }
    static int mod(int a, int b){
        return a%b;
    }
    public static void main(String[] args) {
    int n;
    Scanner read=new Scanner(System.in);
    
    display();


    int a=read.nextInt();
    int b=read.nextInt();
    int count=1;
    while(count>0){
        n=read.nextInt();
switch (n) {
    case 1: System.out.println(add(a,b)); break;
    case 2:System.out.println(sub(a,b));break;
    case 3:System.out.println(mul(a,b));break;
    case 4:System.out.println(div(a,b));break;
    case 5:System.out.println(mod(a,b));break;
    case 6:count=0;break;
}
display();
    }
    }
    
}
