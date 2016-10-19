import java.util.Scanner;
public class DMOJ_Back_To_School_Harambe {
    public static void main(String a[]){
        Scanner scan = new Scanner(System.in);
        String essay = scan.nextLine();
        int lower=0, upper=0;
        for(char c : essay.toCharArray()){
            if(c>=97) lower++;
            else if(c>=65) upper++;
        }
        if(lower>upper) System.out.println(essay.toLowerCase());
        else if(upper>lower) System.out.println(essay.toUpperCase());
        else System.out.println(essay);

    }
}
