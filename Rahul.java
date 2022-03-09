import java.util.*;
import java.io.*;
public class Rahul {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine().trim());

        int k=Integer.parseInt(sc.nextLine().trim());
        List<String> s=new ArrayList<>(n);
        for(int j=0;j<n;j++){
            s.add(sc.nextLine());
        }
        int result=strings(n,k,s);
        System.out.println(result);
        
        
    }
    public static int strings(int n,int k,List<String> s){
        int count=0;
        String s1="orz";
        for(int i=0;i<n;i++){
            boolean res=isSubSequence(s.get(i),s1,s.get(i).length(),s1.length());
if(res){
    count++;
}
            
        }
        return count;
    }
    static boolean isSubSequence(String str1,String str2,int m,int n){
        if(m==0){
            return true;
        }
        if(n==0){
            return false;
        }
        if(str1.charAt(m-1)==str2.charAt(n-1))
        return isSubSequence(str1, str2, m-1, n-1);
        return isSubSequence(str1, str2, m, n-1);
    }
    
    }
