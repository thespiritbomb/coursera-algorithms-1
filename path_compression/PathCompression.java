//Weighted Quick Union with Path Compression
package path_compression;

public class PathCompression {
    private int[] arr;
    private int[] size;
    public PathCompression(int n){
        this.arr=new int[n];
        this.size=new int[n];
        //In the beginning, each element is itself's root and size of each tree is 1
        for(int i=0;i<n;i++){
            arr[i]=i;
            size[i]=1;
        }
    }
    //Function to find out the ROOT of an element
    public int root(int a){
        int i=a;
        while(i!=this.arr[i]){
            this.arr[i]=this.arr[this.arr[i]];
            i=this.arr[i];
        }
        return i;
    }
    //Function to determine if two elements are connected or not
    public boolean connected(int a,int b){
        return(this.root(a)==this.root(b));
    }
    public void Union(int a,int b){
        if(this.connected(a,b)){
            System.out.println("Already Connected");
            return;
        }
        int aRoot=this.root(a);
        int bRoot=this.root(b);
        if(this.size[aRoot]<=this.size[bRoot]){
            System.out.println(b+"'s tree is bigger. Therefore, "+a+"'s tree will be joined to "+b+"'s tree");
            this.arr[aRoot]=bRoot;
            this.size[bRoot]+=this.size[aRoot];
        }
        else{
            System.out.println(a+"'s tree is bigger. Therefore, "+b+"'s tree will be joined to "+a+"'s tree");
            this.arr[bRoot]=aRoot;
            this.size[aRoot]+=this.size[bRoot];
        }
    }
    public void arrDisplay(){
        for(int i=0;i<this.arr.length;i++){
            System.out.print(this.arr[i]+" ");
        }
        System.out.println();
    }
    public void sizeArrDisplay(){
        for(int i=0;i<this.size.length;i++){
            System.out.print(this.size[i]+" ");
        }
        System.out.println();
    }
}