import java.util.Scanner;
public class ConditionalStatements{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter a number: ");
        int a = sc.nextInt();

    
        //int a = sc.nextInt();
        if(a % 2 == 0){
            System.out.println("given number is a even number");
        }else{
            System.out.println("given number is a odd number");
        }
        //Scanner ab = new Scanner();
        //System.out.printf("user input %d" ,ab.b);
        sc.close();
    }
    
}

//class Scanner{
  //  
    //int b = sc.nextInt();
    ///static void Msg(){
    //System.out.println("Enter a number:" + b);
    //int b = sc.nextInt();
    
    

    //}
//}
