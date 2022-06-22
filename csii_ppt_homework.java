import java.util.Scanner;
 /*回傳物件結構好像錯了，此檔案做到3033/06/08 */ 
public class csii_ppt_homework {

   
   

    public csii_ppt_homework(){
        //----設定菜單內容----
        
        String menu1= "       1.客戶信息管理";
        String menu2= "       2.購物結算";
        String menu3= "       3.真情回饋";
        String menu4= "       4.註銷";
        String line= "****************************";
        //----將菜單內容存進陣列----
        String [] menuArr = {line,menu1,menu2,menu3,menu4,line};
        //----定義sacnner----
        Scanner scanner = new Scanner(System.in);
        
        int input;

       //----迴圈菜單array 1-6做顯示----
        for(int i=0;i<menuArr.length;i++){
            System.out.println(menuArr[i]);
            
        }
        System.out.println("請輸入");

        //----將input寫在try catch裡避免錯誤----
        try{

            int input_01 = Integer.parseInt(scanner.next());

            //----以下執行選單switch case----


            switch(input_01){

                case 1://進入選單1
                innerMenu01();
                break;
    
                case 2://進入選單2
                innerMenu02();
                break;

                case 3:
                innerMenu03();
                break;
    
                case 4://選單4，離開系統
                System.out.println("掰掰!謝謝使用");
                break;
            }
            //----如輸入的數字沒有在選單內
            if(input_01>menuArr.length-2 || input_01 == 0  ){
                System.out.println("無此選項請重新輸入");
                new csii_ppt_homework();
            }    
        }
        //----如果輸入的不是數字則提示輸入數字----
        catch(Exception e){
            System.out.println("請輸入數字");
            new csii_ppt_homework();
        }
       
    }
    //--------選單1--------
    public static void innerMenu01(){
        
        String menu1 = "        1.客戶帳號";
        String menu2 = "        2.客戶姓名";
        String menu3 = "        3.返回";
        String line = "****************************";
        String[] innerMenuArr = {line,menu1,menu2,menu3,line};
        //----客戶帳號----
        String[] customerList = {
            "user001",
            "user002",
            "user003",};

        Scanner scanner = new Scanner(System.in);

        for(int i =0; i<innerMenuArr.length;i++){
            System.out.println(innerMenuArr[i]);
        }
        
        System.out.println("請輸入");
        int input_01 = scanner.nextInt();


        //----以下執行switch case選擇----
        switch(input_01){

            case 1:
         

            for(int i=0;i<customerList.length;i++){
                System.out.println(i+1+"."+"        "+customerList[i]);
            }
           
            
            innerMenu01();
            break;




            case 3:
            new csii_ppt_homework();
            break;

        }
        
    }
    //--------選單2--------
    public static void innerMenu02(){
        Scanner scanner = new Scanner(System.in);
        
        String menu1 = "        1.結帳";
        String menu2 = "        2.返回";
        String line = "****************************";
        String[] innerMenuArr = {line,menu1,menu2,line};
        for(int i=0;i<innerMenuArr.length;i++){
            System.out.println(innerMenuArr[i]);
        }

        try{

            int input_01 = scanner.nextInt();

            //----switch case----
            switch(input_01){

                case 2:
                new csii_ppt_homework();
                break;
    
            }




        }
        catch(Exception e){
            System.out.println("請輸入數字");
            innerMenu02();
        }
    }

    //--------選單3--------
    public static void innerMenu03(){
        /*預計再製作一個剪刀石頭布小遊戲 */
        Scanner scanner = new Scanner(System.in);

        String menu1 = "        1.猜數字遊戲";
        String menu2 = "        2.剪刀石頭布";
        String menu3 = "        3.返回";
        String line = "****************************";

        String[] innerMenuArr = {line,menu1,menu2,menu3,line};

        //----執行選單for迴圈----
        for(int i=0;i<innerMenuArr.length;i++){
            System.out.println(innerMenuArr[i]);
        }



        try{

            System.out.println("請輸入");
            int input_01 = scanner.nextInt();
            
            //----switch case
            switch(input_01){

                case 1:
                //----case1 猜數字遊戲----
                System.out.println("請猜一個數字");
                
                input_01 = scanner.nextInt();
                int randNum = (int)(Math.random()*10+1);
                //System.out.println(randNum);
                if(input_01 == randNum){
                    System.out.println("猜中!!!恭喜獲得一台IPHONE!!!");
                    new csii_ppt_homework();
                }
                
                else{
                    System.out.println("銘謝惠顧");
                    new csii_ppt_homework();
                }
                break;
                //---------------------------------------------------
                case 2:
                //----剪刀石頭布遊戲---------------------------

                int[] PssContianer = {1,2,3};
                String[] PssName = {"剪刀","石頭","布"};
                int PssRand = (int)(Math.random()*3+0);


                System.out.println("請出拳，1.剪刀/2.石頭/3.布");
                input_01 = scanner.nextInt();
                System.out.println("電腦出拳是"+PssName[PssRand]);
                System.out.println("您出的拳是"+PssName[input_01]);

                

                innerMenu03();





                break;
                //--------------------------------------------//
                
                case 3:
                
                new csii_ppt_homework();
                break;





            }


        }
        catch(Exception e){
            System.out.println("請輸入數字");
            innerMenu03();

        }

        
       

    }
    
    public String pssMethod(int x,int y){
        int z = x-y;
        String result;
        if(z == 1 || z ==-2){
            result = "你贏了!!!";
        }
        else if(z == -1 || z == 2){
            result = "你輸了!!!";
        }
        else if(z == 0){
            result = "平手!!!";
        }
        else{
            result = "結果錯誤!!!您可能輸入不對的數字";
        }
        return result;
    }
    
    
 /*回傳物件結構好像錯了，此檔案做到3033/06/08 */   

    
}
