------------------------------------------------------------------------------------------------------------------------------------------------------------
import java.util.*;
public class Main{
    public static void main(String[]Args){
        String word="Hello World";
        int vows=0;
        int con=0;
        word=word.toLowerCase();
        for(int i=0;i< word.length();i++)
        {
            char temp=word.charAt(i);
            if(temp=='a'||temp=='e'||temp=='i'||temp=='o'||temp=='u')
            {   
                vows++;
            }else if(temp!= ' ')
            {
                con++;
            }
        }
        System.out.println("Vowels: "+vows);
        System.out.print("Vowels: "+con);
    }
}

----------------------------------------------------------------------------------------------------------------------------------------------------------
import java.util.*;
public class Main{
    public static void main(String[]Args){
        String a= "I love India";
        String []arr= a.split(" ");
        String b="";
        for(int i=arr.length-1;i>=0;i--){
            b=b+arr[i];
            b=b+" ";
        }System.out.print(b);
    }
}
-------------------------------------------------STRING TO IP-----------------------------------------------------------------------------------------------
import java.util.Scanner;
public class Main
{
    public static void main(String[]args)
    {
        String a="12";
        String b="24";
        int a1=0,b1=0;
        for(int i=0;i<a.length();i++)
        {
            char ch=a.charAt(i);
            a1=a1*10+(ch-'0');
        }
        for(int i=0;i<b.length();i++)
        {
            char ch=b.charAt(i);
            b1=b1*10+(ch-'0');
        }
        System.out.print(a+"+"+b+"="+(a1+b1));
    }
}
---------------------------------------------------STRING COMPRESSION---------------------------------------------------------------------------------------
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
       String str="aaaabbbbccccc";
       String res="";
       int c=1;
       for(int i=0;i<str.length();i++){
           if(i+1<str.length()&&str.charAt(i)==str.charAt(i+1)){
               c++;
           }else{
               res= res+str.charAt(i);
               res= res+c;
               c=1;
           }
       }
       System.out.print(res);
    }
}
-------------------------------------------------------------ANAGRAM----------------------------------------------------------------------------------
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) 
	{
      String one = "bat";
      String two = "tab";
      char [] a = one.toCharArray();
      char [] b = two.toCharArray();
      Arrays.sort(a);
      Arrays.sort(b);
      boolean res = Arrays.equals(a,b);
      if(res)
      {
          System.out.print("yes");
      }
	}
}
------------------------------------------------------------------------PASSWORD CHECKER--------------------------------------------------------------------
import java.util.*;
public class password_checker{
    public static void main(String[]Args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Password:");
        String password=sc.nextLine();
        int up=0;
        int lw=0;
        int sp=0;
        int dg=0;
        if(password.length()>7){
            for(int i=0;i<password.length();i++){
                char ch=password.charAt(i);
                if(Character.isUpperCase(ch)){
                    up++;
                }else if(Character.isLowerCase(ch)){
                    lw++;
                }else if(Character.isDigit(ch)){
                    dg++;
                }else {
                    sp++;
                }
            }
            if(up>0&&lw>0&&dg>0&&sp>0){
            System.out.print("Strong password");
        }else{
            System.out.print("Weak password");
        }
        }else{
            System.out.print("less characters");
        }
       
    }
}
------------------------------------------------------------------FLAMES-----------------------------------------------------------------------------------
7.import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class Main{
    public static void main(String[]Args){
        Scanner sc=new Scanner(System.in);
        //getting input
        System.out.print("Enter Boy name:");
        String name1=sc.nextLine();
        System.out.print("Enter Girl name:");
        String name2=sc.nextLine();
        //creating empty list
        List<Character>l1=new ArrayList<>();
        List<Character>l2=new ArrayList<>();
        //convert to array
        for(char c:name1.toCharArray()){
            l1.add(c);
        }for(char c:name2.toCharArray()){
            l2.add(c);
        }System.out.println(l1);
        System.out.println(l2);
        int a= l1.size();
        int b= l2.size();
        //replace same character
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                if(l1.get(i)==l2.get(j)){
                    l1.set(i,'2');
                    l2.set(j,'2');
                }
            }
        }
        System.out.println(l1);
        System.out.println(l2);
        int count1=0;
        int count2=0;
        for(char c:l1){
            if(c!= '2'){
                count1++;
            }
        }
         for(char c:l2){
            if(c!= '2'){
                count2++;
            }
        }int final_count= count1+count2;
        System.out.println(final_count);
        String relation;
        switch(final_count){
            case 1:
                relation="Friend";
                break;
            case 2:
                relation="Lover";
                break;
            case 3:
                relation="Affection";
                break;
            case 4:
                relation="Marriage";
                break;
            case 5:
                relation="Enemy";
                break;
            case 6:
                relation="Sister";
                break;
            case 7:
                relation="Friend";
                break;
            case 8:
                relation="Lover";
                break;
            case 9:
                relation="Affection";
                break;
            case 10:
                relation="Marriage";
                break;
            case 11:
                relation="Enemy";
                break;
            case 12:
                relation="Sister";
                break;
            default:
                relation="unknown";
        }
        System.out.print("The relation is "+relation);
    }
}
-----------------------------------------------------------------LCM--------------------------------------------------------------------------------

8. import java.util.*;
public class main{
    public static void main(String[]Args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number1:");
        int num1=sc.nextInt();
        System.out.print("Enter number2:");
        int num2=sc.nextInt();
        int max=(num1>num2)?num1:num2;
        int step =max;
        while(true){
            if(max%num1==0 && max%num2==0){
                break;
            }
            max=step+max;
        }
        System.out.print("LCM: "+max);
    }
}


----------------------------------------------------------------------------PALINDROME----------------------------------------------------------------------
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter word:");
        String a=sc.nextLine();
        a= a.toUpperCase();
        a= a.replaceAll("\\s+","");
        int front,back;
        for(front=0,back=a.length()-1;front<back;front++,back--){
            if(a.charAt(front)!=a.charAt(back)){
                System.out.print("Not a Palindrome");
                return ;
            }
        }System.out.print("Palindrome");
    }
}
--------------------------------SORTED ARRAY---------------------------------------------------------------------------------------------------
import java.util.*;
public class Main{
    public static void main(String[]Args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of names:");
        int n=sc.nextInt();
        sc.nextLine();
        String[] arr= new String[n];
        System.out.print("Enter the names:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLine();
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i].compareTo(arr[j])>0){
                    String temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }System.out.print("Sorted names:");
        for(int i=0;i<n-1;i++){
            System.out.print(arr[i]);
        }
        
    }
}
