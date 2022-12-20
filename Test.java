import java.util.*;
public class Test 
{
static Scanner sc=new Scanner(System.in);

public static void main(String args[])
{
    System.out.println("You are Bowling");
    int v1=0;
    int u1=0;
    int r1=0;
    int CompBatting=0;
    while(r1==0)
    {
        v1=(int)(Math.random()*10);
        System.out.print("Your Turn : ");
        u1=sc.nextInt();
        System.out.println("Computer's Number ="+v1);
        CompBatting=CompBatting+u1;
        r1=v1==u1?1:0;
        if(v1==u1)
        System.out.println("Computer is OUT");

}    
}
}
