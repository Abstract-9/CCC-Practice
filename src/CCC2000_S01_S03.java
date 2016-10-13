import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
public class CCC2000_S01_S03 {
    public static void main(String a[]){
        Scanner scan = new Scanner(System.in);
        int numSites = scan.nextInt();
        scan.nextLine();
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        ArrayList<String> sites = new ArrayList<>();
        for(int i=0;i<numSites;i++){
            String URL = scan.nextLine(), site = "";
            if(!sites.contains(URL)) sites.add(URL);
            ArrayList<String> connections = new ArrayList<>();
            int index = 0;
            boolean insite=true;
            while(insite){
                String line = scan.nextLine();
                if(line.equals("</HTML>")) insite=false;
                else site+=line;
            }
            while(true){
                index = site.indexOf("<A HREF=", index+1);
                if(index==-1) break;
                else{
                    String connection = site.substring(index, site.indexOf(">", index)).split("=")[1].replace('"', ' ').trim();
                    connections.add(connection);
                    System.out.println("Link from " + URL + " to " + connection);
                    if(!sites.contains(connection)) sites.add(connection);
                }
            }
            map.put(URL, connections);
        }
        while(true){
            String site = scan.nextLine();
            if(site.equals("The End")) break;
            else{
                ArrayList<String> tmpsites = new ArrayList<>();
                tmpsites.addAll(sites);
                String site2 = scan.nextLine();
                int[] dist = new int[tmpsites.size()];
                String[] prev = new String[tmpsites.size()];
                for(int j = 0;j<tmpsites.size();j++){
                    String s = tmpsites.get(j);
                    if(j!=0) dist[j]=(int)10e3;
                    if(s.equals(site)){
                        tmpsites.remove(s);
                        tmpsites.add(0, s);
                        dist[tmpsites.indexOf(s)]=0;
                    }
                }

                boolean siteFound = false;
                while(!tmpsites.isEmpty()){
                    String currentSite = "";
                    int u = (int)10e3;
                    //extract min dist value from tmpsites( basically takes the first site in the set)
                    for(String s : tmpsites){
                        if(dist[tmpsites.indexOf(s)]<u){
                            u = dist[tmpsites.indexOf(s)];
                            currentSite=s;
                        }
                    }

                    tmpsites.remove(currentSite);
                    for(String s : map.get(currentSite)){
                        if(tmpsites.contains(s)){
                            if(u+1<dist[tmpsites.indexOf(s)]){
                                dist[tmpsites.indexOf(s)] = u+1;
                                prev[tmpsites.indexOf(s)] = currentSite;
                            }
                        }
                    }
                    if(currentSite.equals(site2) && u!=(int)10e3){
                        siteFound = true;
                        break;
                    }else if(u==(int)10e3) break;
                }
                if(siteFound) System.out.println("Can surf from " + site + " to " + site2);
                else System.out.println("Can't surf from" + site);

            }
        }
    }
}
