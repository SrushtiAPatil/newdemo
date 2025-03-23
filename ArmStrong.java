import java.util.Scanner;


class CheckArmStrong{
    int sum=0;
   int arm(int n){
      while (n>0) {
        int k=n%10;
        sum=sum+(k*k*k);
        n=n/10;
      }
      return sum;
    }
}
public class ArmStrong {
    public static void main(String Args[]){
        Scanner sc=new Scanner(System.in);
   
     System.out.println("Enter number :");
     int num=sc.nextInt();
     CheckArmStrong obj=new CheckArmStrong();
     int a=obj.arm(num);
     if(num==a){
        System.out.println("Entered number is armstrong :"+num);
     }else{
        System.out.println("Entered number is not armstrong :"+num);
     }
}
}