package quick_union_weighted;
import java.util.Scanner;
public class QuickUnionWeightedClient {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        QuickUnionWeighted obj=new QuickUnionWeighted(n);
        obj.Union(4,3);
        obj.Union(3,8);
        obj.Union(6,5);
        obj.Union(9,4);
        obj.Union(2,1);
        obj.Union(5,0);
        obj.Union(7,2);
        obj.Union(6,1);
        obj.Union(7,3);
        obj.arrDisplay();
        in.close();
    }
}