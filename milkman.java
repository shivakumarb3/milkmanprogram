import java.util.*;
public class milkman{

     public static void main(String []args){
       int dp[]=new int[1001];
       dp[0]=0;
       Scanner as=new Scanner(System.in);
       for(int i=1;i<=1000;i++)
       {
           int min=(int)1e9+7;
           if((i-1)>=0 && dp[i-1]<min)
           min=dp[i-1];
           if((i-5)>=0 && dp[i-5]<min)
           min=dp[i-5];
           if((i-7)>=0 && dp[i-7]<min)
           min=dp[i-7];
           if((i-10)>=0 && dp[i-10]<min)
           min=dp[i-10];
           dp[i]=min+1;
           
           
           
       }
       int t=as.nextInt();
       for(int i=0;i<t;i++)
       {
           int n=as.nextInt();
           System.out.println(dp[n]);
       }
     }
}
