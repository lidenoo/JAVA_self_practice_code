/*
*20220609作成 Shane
*主選單畫面功能 
*/


import java.io.*;
import java.util.Scanner;

public class Shopmenu  {

    public int input;
    String menuSheet;
    String[] menuShow;
    public Shopmenu(){
        int[] SheetCnt = new int[100];
        //----取用選單長度的迴圈----
        for(int i=0;i<=3;i++){
            /*
             *SheetCnt[0]是主選單
             */
            SheetCnt[i]=menuList(i).length-2;
        }

        boolean isInMenuSheet = false;
        Scanner scanner = new Scanner(System.in);

            
        try{
              
            menuSheet(0);//執行主選單
            input = scanner.nextInt();
            if(input>0 &&  input<SheetCnt[0]) isInMenuSheet = true;
            //-------switch case from here------
            switch(input){
                case 1:
                System.out.flush();
                while(isInMenuSheet == true){
                    menuSheet(1);
                    input = scanner.nextInt();
                    //----裡選單從這裡開始SWITCH  
                    switch(input){
                        case 1:
                        Program(11);
                        break;



                    }
                    if(input == SheetCnt[1]){
                        new Shopmenu();
                    }   
                }
                break;

                case 2:
                while(isInMenuSheet == true){
                    menuSheet(2);
                    input = scanner.nextInt();
                    if(input == SheetCnt[2]){
                        new Shopmenu();
                    }   
                }
                break;

                case 3:
                while(isInMenuSheet == true){
                    menuSheet(3);
                    input = scanner.nextInt();
                    //----裡選單從這裡開始SWITCH    
                    switch(input){
                        case 1:
                        Program(31);
                        break;
                        case 2:
                        Program(32);
                        break;
                    }
                    if(input == SheetCnt[3]){
                        new Shopmenu();
                    }             
                }
                break;















                
            }//-----這裡是switch的引號

            if(input == 0 && input >SheetCnt[0]){
                new Shopmenu();
            }
            if(input == SheetCnt[0]) System.exit(0);

        }  
        catch(Exception e){

            System.out.println("請輸入數字");
            new Shopmenu();

        }
        
    } //-----class結束引號

    //-----取用menu的載體-----
    public void menuSheet(int x){
        /*丟數值到menuList呼叫選單 */
        String[] menuArr = menuList(x);
        for(int i=0;i<menuArr.length;i++){
            System.out.println(menuArr[i]);
        }

    }
    
    //----程式寫在裡面----
    public void Program(int pgmNum) throws FileNotFoundException{
        /*
        1.程式全部都寫在這裡面
        2.在這裡只創造CASE
        3.所有CASE皆用數字命名 
        */          
        int input_01;
        Scanner scanner = new Scanner(System.in);
        
        //-----pgmNum就是代表程式的號碼-----
        switch(pgmNum){
            case 0:
            //---PROGRAM HERE---
            break;

            case 1:
            //---PROGRAM HERE---
            break;

            case 3:
            //---PROGRAM HERE---
            break;
            
            case 31:
            
            //----猜數字遊戲----
            System.out.println("請猜一個數字1~10");   
            try{
                input_01 = scanner.nextInt();
                int randNum = (int)(Math.random()*10+1);

                if(input_01 == randNum){
                    System.out.println("猜中!!!恭喜獲得一台IPHONE!!!");
                 }   
                else{
                    System.out.println("銘謝惠顧");
                }
            }
            catch(Exception e){
                System.out.println("請輸入數值");
                Program(31);
            }
            break;    

            case 32:
            
            try{

                String[] PssName = {"剪刀","石頭","布"};
                int PssRand = (int)(Math.random()*3+0);
                System.out.println(PssRand);
                int cpuCnt = 0;
                int playerCnt = 0;
                for(int i=1;i<=5;i++){
                    System.out.println("第"+i+"回合");
                    System.out.println("請出拳，1.剪刀/2.石頭/3.布");
                    input_01 = scanner.nextInt();
                    System.out.println("電腦出拳是"+PssName[PssRand]);
                    System.out.println("您出的拳是"+PssName[input_01-1]);
            
                    int result = pssMethod(input_01,PssRand+1);//計算贏或輸
                    
                    if(result == 2){
                        System.out.println("WIN");
                        playerCnt++;
                    } 
                    if(result == 1){
                        System.out.println("LOOSE");
                        cpuCnt++;
                    } 
                    if(result == 0){
                        System.out.println("FAIR");
                    } 
                
                }
                if(playerCnt>cpuCnt) System.out.println("你贏了!!!");
                if(playerCnt<cpuCnt) System.out.println("你輸了!!!");
                if(playerCnt==cpuCnt) System.out.println("平手!!!");
            }
            catch(Exception e){
                System.out.println("輸入錯誤，遊戲重新啟動");
                Program(32);

            }
            break;  

            case 11:
            //---PROGRAM HERE---
            //---客戶帳號-讀取txt程式----

            File file = new File("C:/Users/L21412/JAVA/userlist.txt");
            Scanner fileScanner = new Scanner(file);
            int i = 0;
            while(fileScanner.hasNextLine()){
                
                i++;

                System.out.println(i+"."+fileScanner.nextLine());
            }
            





            break;
        }
    }
     
   //}
    //--------選單總匯--------
    public static String[] menuList(int x){
        /*需要修改選單都是在這裏面進行修改 */
        String space = "        ";
        String menu1 = space+"1.客戶信息管理";
        String menu2 = space+"2.購物結算";
        String menu3 = space+"3.迷你遊戲";
        String menu4 = space+"4.退出";
        String line = "****************************";
        String[] defultMenu = {line,menu1,menu2,menu3,menu4,line};
        if(x == 1){
            menu1 = space+"1.客戶帳號";
            menu2 = space+"2.客戶姓名";
            menu3 = space+"3.返回";
            String[] menuListArr = {line,menu1,menu2,menu3,line};
            return menuListArr ;
        }
        else if(x == 2){
            menu1 = space+"1.結帳";
            menu2 = space+"2.返回";
            String[] menuListArr = {line,menu1,menu2,line};
            return menuListArr;


        }
        else if(x == 3){
            menu1 = space+"1.猜數字遊戲";
            menu2 = space+"2.剪刀石頭布";
            menu3 = space+"3.返回";
            String[] menuListArr = {line,menu1,menu2,menu3,line};
            return menuListArr;
        }
        else{
            return defultMenu;
        }
        
       
    }

    //----剪刀石頭布遊戲的小function----
    public int  pssMethod(int x,int y){
        int z = x-y;
        int result;
        if(z == 1 || z ==-2){
            result = 2;//WIN
        }
        else if(z == -1 || z == 2){
            result = 1;//LOOSE
        }
        else if(z == 0){
            result = 0;//FAIR
        }
        else{
            result = 99;//NO RESULT
        }
        return result;
    }
    
    


    
}
