import java.util.Scanner;

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
    
                case 4://選單4，離開系統
                System.out.println("掰掰!謝謝使用");
                break;
            }
            //----如輸入的數字沒有在選單內或是非數字
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
        
        int input_01 = scanner.nextInt();

        //----switch case----

        switch(input_01){

            case 2:
            new csii_ppt_homework();
            break;

        }

    }

    
}
