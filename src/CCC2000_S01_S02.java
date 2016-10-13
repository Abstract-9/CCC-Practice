import java.util.Scanner;
public class CCC2000_S01_S02 {
    public static void main(String a[]){
        Scanner scan = new Scanner(System.in);
        int coins = scan.nextInt(), ctr1=scan.nextInt(), ctr2=scan.nextInt(), ctr3=scan.nextInt(), plays=0;
        while(true){
            if(coins==0) break;
            ctr1++;
            if(ctr1==35){
                coins+=30;
                ctr1=0;
            }
            plays++;
            coins--;
            if(coins==0) break;
            ctr2++;
            if(ctr2==100){
                coins+=60;
                ctr2=0;
            }
            plays++;
            coins--;
            if(coins==0) break;
            ctr3++;
            if(ctr3==10){
                coins+=9;
                ctr3=0;
            }
            plays++;
            coins--;
            if(coins==0) break;
        }
        System.out.println(plays);
    }
}
