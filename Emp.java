import java.util.Scanner;

class Desiganation{
    Boolean verify(String Desg){
        return switch(Desg){
            case "SE": yield true;
            case "ME": yield true;
            case "EE": yield true;
            default :yield false; 
        };
    }
}
class Empsalary{
    float calculate(int bSal){
        return bSal+(0.93f*bSal)+(0.63f*bSal);
    }
}
public class Emp {
   public static void main(String Args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Employee name :");
     String name=sc.nextLine();
     System.out.println("Enter Employee Degisnation :");
     String eDesg=sc.nextLine();
    Desiganation obj=new Desiganation();
    boolean k=obj.verify(eDesg);
    if(k){
        System.out.println("Enter Employee Id :");
        String eId=sc.nextLine();
        System.out.println("Enteer bSalary :");
        int bSal=sc.nextInt();

        if(bSal>=12000){
            Empsalary es=new Empsalary();
            Float totsal=es.calculate(bSal);
            System.out.println("--- Employee Details---");
            System.out.println("Name : "+name);
            System.out.println("Designation : "+eDesg);
            System.out.println("Id : "+eId);
            System.out.println("Bsalary : "+bSal);
            System.out.println("Total Salary : "+totsal);
            

        }
    }else{
        System.out.println("Invalid Designation..");
    }
   }
}
