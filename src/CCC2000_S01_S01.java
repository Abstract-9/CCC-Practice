import java.util.Scanner;
public class CCC2000_S01_S01 {
    public static void main(String a[]){
        Scanner scan = new Scanner(System.in);
        int lower = scan.nextInt(), higher = scan.nextInt(), ctr=0;
        for(int i=lower;i<higher;i++){
            if(i<10) {
                if (i == 0 || i == 1|| i == 8) {
                    ctr++;
                }
            }else{
                String tmp = String.valueOf(i);
                if(!tmp.contains("2") && !tmp.contains("3") && !tmp.contains("4") && !tmp.contains("5") && !tmp.contains("7")) {
                    String inverse = inverse(tmp);
                    if (inverse.equals(tmp)) {
                        ctr++;
                    }
                }
            }
        }
        System.out.println(ctr);
    }
    public static String inverse(String s){
        char[] letters = s.toCharArray();
        String inverse = "";
        int ctr =letters.length-1;
        for(int i=0;i<s.length();i++){
            switch (letters[ctr]){
                case '6':
                    inverse+= 9;
                    break;
                case '9':
                    inverse+= 6;
                    break;
                default:
                    inverse+=letters[ctr];
                    break;
            }
            ctr--;
        }
        return inverse;
    }
}
