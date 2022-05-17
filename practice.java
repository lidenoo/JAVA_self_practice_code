import java.util.Scanner;
public class practice {
    static int myMethod(int a,int b,int c){
        
        int temp = a+b;
        int temp2 = c;
        
        if(temp < temp2){
            return 0;
        }      
            return (a + b)*c;
    }


    
    
    public static void main(String[] args) {


        System.out.println("現在輸入三個數字");
       // System.out.println("第一個數字");
        Scanner myObj1 = new Scanner(System.in);
        //System.out.println("第二個數字");
        Scanner myObj2 = new Scanner(System.in);
        //System.out.println("第三個數字");
        Scanner myObj3 = new Scanner(System.in);

        
        int num1 = myObj1.nextInt();
        int num2 = myObj2.nextInt();
        int num3 = myObj3.nextInt();


        System.out.println(myMethod(num1, num2, num3));
        
        

  }
}
