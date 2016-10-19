import java.util.Scanner;
import java.util.ArrayList;
public class DMOPC_October_Q3 {
    static ArrayList<Integer> list;
    static ArrayList<Integer> totalPrices;
    public static void main(String a[]){
        Scanner scan = new Scanner(System.in);
        list = new ArrayList<>();
        totalPrices = new ArrayList<>();
        for(int i=1;i<=3;i++){
            check(i);
        }
    }

    static void check(int num){
        for(int i=0;i<list.size();i+=num){
            int setPrice=0;
            ArrayList<Integer> set = (ArrayList<Integer>) list.subList(i, i+(num-1));
            if(set.size()==3){
                set.sort(null);
                setPrice+=set.get(1)+set.get(2);

            }
        }
    }
}
