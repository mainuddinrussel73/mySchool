import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class OfflineA1 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        int k;
        Scanner in = new Scanner(System.in);
        k = in.nextInt();
        int a[],b[];
        int [][] q=null;
        //q = null;
        //q[][]= {{0}};
        int counter = 0;
        a = new int[k];
        b = new int[k];
        q = new int [k][k];
        for(int i = 0;i<k;i++)
        {
           a[i] = in.nextInt();
        }
        int l = 0,c = a.length,p = 0,o =0, v =0;
        while(c>(a.length-(a.length-2)))
        {
            for(int j = p;j<a.length-1;j++)
            {
                c--;
                p = j;
                q[o][v] = a[j];
                v++;
                if(a[j]>a[j+1]){counter++;break;}
                counter++;
            }
            p++;
            o++;
            b[l] = counter;
            l++;
            counter = 0;
        }
        int size = 0;
        sort(b);
        int w[];
        w = new int [10];
        System.out.println(Arrays.toString(b));
        for(int u = 0;u<q.length;u++)
        {
            for(int j = 1;j<q[u].length;j++)
            {
                if(q[u][j]!=0)
                {
                    for(int h = 1;h<q[u].length;h++)
                    {
                        
                    }
                }
            }
            
            w[u] = size;
            System.out.println(size);
            size=0;
        }
        for(int u = 0;u<w.length;u++)
        {
            System.out.println(Arrays.toString(q[u]));
            if(b[b.length-1]==w[u])
            {
                System.out.println(Arrays.toString(q[u]));
                break;
            }
        }
    }

    public static void sort(int[] b) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for (int i = 1; i<b.length; i++){
          int j = i;
          int B = b[i];
          while ((j > 0) && (b[j-1] > B)){
            b[j] = b[j-1];
            j--;
          }
          b[j] = B;
        }
    }
    
}
