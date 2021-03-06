import java.io.*;
import java.util.*;

public class manhat{
  public static int manhatdis(int xa, int xb, int ya, int yb){
    int xt = xa - xb;
    if(xt<0){
      xt = xt * -1;
    }
    int yt = ya - yb;
    if(yt<0){
      yt= yt * -1;
    }
    int total = xt + yt;
    return total;
  }
  public static void main(String args[] ) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int cases = Integer.parseInt(br.readLine().trim());
      for(int i=0; i<cases; i++){
        String s[] = br.readLine().trim().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int y = n*m;
        int xr[] = new int[y];
        int yr[] = new int[y];
        y = n+m-1;
        int dist[] = new int[y];
        int c =0;
        for(int j=0; j<n; j++){
          String t = br.readLine().trim();
          for(int k=0; k<m; k++){
            if(t.charAt(k)=='1'){
              xr[c]=j;
              yr[c]=k;
              c++;
            }
          }
        }
        for(int j=0; j<c; j++){
          for(int k=j+1; k<c; k++){
            int d = manhatdis(xr[j], xr[k], yr[j], yr[k]);
            dist[d]++;
          }
        }
        for(int j=1; j<(n+m-1); j++){
            System.out.print(""+dist[j]);
            if(j!=(n+m-2)){
              System.out.print(" ");
            }
        }
        System.out.print("\n");
      }
    }
}
