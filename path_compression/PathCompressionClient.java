//Client for Weighted Quick Union with Path Compression
package path_compression;
import java.util.Scanner;
public class PathCompressionClient {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        PathCompression obj=new PathCompression(n);
        obj.Union(4,3);
        obj.Union(3,8);
        obj.Union(6,5);
        obj.Union(9,4);
        obj.Union(2,1);
        obj.Union(5,0);
        obj.Union(7,2);
        obj.Union(6,1);
        obj.Union(0,3);
        obj.arrDisplay();
        obj.sizeArrDisplay();
        in.close();
    }
}