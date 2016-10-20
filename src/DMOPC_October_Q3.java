import java.util.Scanner;
import java.util.ArrayList;
public class DMOPC_October_Q3 {
    static ArrayList<Integer> list;
    static ArrayList<Integer> totalPrices;
    public static void main(String a[]){
        Scanner scan = new Scanner(System.in);
        list = new ArrayList<>();
        totalPrices = new ArrayList<>();
        int shoes = scan.nextInt();
        for(int i=0;i<shoes;i++){
            list.add(scan.nextInt());
        }
        for(int i=0;i<list.size();i++) {
            int total=0;
            for(int j=0;j<list.size();) {
                int setTotal=0;
                try{
                    ArrayList<Integer> sublist = new ArrayList<>(list.subList(j, j+3));
                    sublist.sort(null);
                    setTotal+=sublist.get(0)+sublist.get(1);
                    j+=3;
                }catch(IndexOutOfBoundsException e){
                    try {
                        ArrayList<Integer> sublist = new ArrayList<>(list.subList(j, j+2));
                        sublist.sort(null);
                        setTotal += sublist.get(0)+(sublist.get(1)/2);
                        j+=2;
                    }catch(IndexOutOfBoundsException ee){
                        setTotal+=list.get(j);
                        j++;
                    }
                }
                total+=setTotal;
            }


            totalPrices.add(total);
        }
        totalPrices.sort(null);
        System.out.println(totalPrices.get(0));
    }
}
