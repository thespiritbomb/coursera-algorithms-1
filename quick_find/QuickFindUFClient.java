/*Client to run QuickFindUF.java*/
package quick_find;
import java.util.Scanner;
public class QuickFindUFClient {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        QuickFindUF obj=new QuickFindUF(n);
        obj.union(2, 4);
        obj.union(1, 3);
        obj.union(5, 6);
        obj.union(2, 5);
        obj.union(0, 7);
        in.close();
    }
}