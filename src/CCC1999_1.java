import java.util.Scanner;
public class CCC1999_1 {
    public static void main(String a[]){
        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
        for(int i=0;i<cases;i++){
            int xMax=scan.nextInt(), yMax=scan.nextInt();
            int point1x = scan.nextInt(), point1y = scan.nextInt();
            int point2x = scan.nextInt(), point2y = scan.nextInt();
            int ballx = point1x, bally = point1y;
            String dir = scan.next();
            int dirY = dir.substring(0,1).equals("N")?-1:1,dirX = dir.substring(1).equals("E")?1:-1;
            boolean done=false, wont=false;
            int ctr = 0;
            while(!done){
                if(ballx+dirX>xMax || ballx+dirX<0) dirX=switchdir(dirX);
                ballx+=dirX;
                if(bally+dirY>yMax || bally+dirY<0) dirY=switchdir(dirY);
                bally+=dirY;
                if(ballx == point2x && bally == point2y) {
                    done=true;
                }else if(ctr!=0 && ballx == point1x && bally == point1y){
                    wont=true;
                    done=true;
                }
                ctr++;
            }
            if(wont) System.out.println("B cannot be reached from A.");
            else System.out.println("B can be reached from A after " + ctr + " move(s).");
        }
    }
    private static Integer switchdir(int dir){
        if(dir==-1) return 1;
        else return -1;
    }
}
