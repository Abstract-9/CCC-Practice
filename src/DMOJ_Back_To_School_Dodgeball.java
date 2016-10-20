import java.util.Scanner;
import java.util.ArrayList;

public class DMOJ_Back_To_School_Dodgeball {
    public static void main(String a[]){
        Scanner scan = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        long total=0;
        int students = scan.nextInt();
        for(int i=0;i<students;i++){
            list.add(scan.next());
        }
        total+=list.size();
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i).toLowerCase().charAt(0)==list.get(i+1).toLowerCase().charAt(0)){
                int ctr = 2;
                char c = list.get(i).toLowerCase().charAt(0);
                while(true){
                    if(i+ctr<list.size()) {
                        if (c != list.get(i + ctr).toLowerCase().charAt(0)) break;
                        else ctr++;
                    }else break;
                }
                total+=1;
                i+=ctr-1;
            }
        }
        System.out.println(total%1000000007);
    }
}
