import java.util.Scanner;
import java.util.regex.Pattern;

import javax.swing.*;
//mport javax.swing.JFrame;
public class idcheck {
    public static void main(String[] args) {

        

        

        String id;
        int[] nums = {1,10,19,28,37,46,55,64,39,73,82,11,20,48,29,38,65,74,83,21,3,30,2,47,56,12};
        char[] alphabets = {'A','B','C','D','E','F','G','H','I','J','K','M','N','O','P','Q','T','U','V','W','X','Z','L','R','S','Y'};
        int headNum = 0;
        String idcheck = ".*[A-Za-z][1-2][0-9]{8}.*";

        Scanner myObj1 = new Scanner(System.in);
        id = myObj1.nextLine().toUpperCase();

        boolean isMatch = Pattern.matches(idcheck, id);
        int result=0;
        //int result=0;

            if(isMatch == true){
                char[] a = id.toCharArray();
                for(int i=0;i<26;i++){

                    if(a[0] == alphabets[i]){
                        headNum=nums[i];
                    }
                }

                for(int i=1;i<=9;i++){
                    
                    int num = Character.getNumericValue(a[i]);
                    
                    result=result+(num*(9-i));
                    if((9-i)<1){
                        result=result+num;
                    }
                    //System.out.println(result+headNum);
                }
                if((result+headNum)%10 == 0){
                    System.out.println("有效身份證字號");

                }
                else{
                    System.out.println("無效身份證字號"); 
                }
                
            }
        
            

            else{
                System.out.println("格式不符");

            }


    }
  


}


    
  

  

