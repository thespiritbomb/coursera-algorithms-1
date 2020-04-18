/*Client to run QuickUnionUF.java*/
package quick_union;
import java.util.Scanner;
public class QuickUnionUFClient {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        QuickUnionUF obj=new QuickUnionUF(n);
        obj.union(4,3);
        obj.union(3,8);
        obj.union(6,5);
        obj.union(9,4);
        obj.union(2,1);
        obj.union(5,0);
        obj.union(7,2);
        obj.union(6,1);
        obj.union(7,3);
        in.close();
    }
}