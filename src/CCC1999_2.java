import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
public class CCC1999_2 {
    public static void main(String a[]){
        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
        for(int i=0;i<cases;i++){
            int words = scan.nextInt(), common = scan.nextInt();
            HashMap<String, Integer> map = new HashMap<>();
            ArrayList<String> wordlist = new ArrayList<>();
            for(int j=0;j<words;j++){
                String word = scan.next();
                if(wordlist.contains(word)){
                    map.put(word, map.get(word)+1);
                }else{
                    wordlist.add(word);
                    map.put(word, 1);
                }
            }
            for(int j=0;j<wordlist.size()-1;j++) {
                int current = map.get(wordlist.get(j)), next = map.get(wordlist.get(j + 1));
                if (current < next) {
                    String tmp = wordlist.get(j + 1);
                    wordlist.remove(j + 1);
                    wordlist.add(j, tmp);
                    j = 0;
                }
            }
            System.out.println(common + " most common words(s):");
            int ctr=1, num=0;
            for(int j=0;j<wordlist.size();j++){
                int current = map.get(wordlist.get(j));
                if(j==0){
                    num = current;
                }else if(num!=current){
                    ctr++;
                    num=current;
                }
                if(ctr==common){
                    System.out.println(wordlist.get(j));
                }

            }
            System.out.println();
        }
    }
}
