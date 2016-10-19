import java.util.Scanner;
import java.util.ArrayList;
public class DMOJ_Back_To_School_Paradox {
    public static void main(String a[]){
        Scanner scan = new Scanner(System.in);
        ArrayList<Boolean> list = new ArrayList<>();
        int sets=scan.nextInt();
        boolean t=false, f=false;
        for(int i=0;i<sets;i++){
            int s = scan.nextInt();
            boolean next = scan.nextBoolean();
            switch(s){
                case 1:
                    if(next) {
                        if (t) System.out.println("false");
                        else {
                            System.out.println("true");
                            t = true;
                        }
                    }
                    else {
                        if(f) System.out.println("false");
                        else{
                            System.out.println("true");
                            f=true;
                        }
                    }
                    break;
                case 2:
                    if(next){
                        if(t){
                            System.out.print("true");
                            t=false;
                        }else{
                            System.out.println("false");
                        }
                    }else{
                        if(f){
                            System.out.println("true");
                            f=false;
                        }else{
                            System.out.println("false");
                        }
                    }
                    break;
                case 3:


            }
        }
    }
}
