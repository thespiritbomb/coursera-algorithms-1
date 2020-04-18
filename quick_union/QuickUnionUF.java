package quick_union;

public class QuickUnionUF {
    private int[] arr;
    public QuickUnionUF(int n){
        this.arr=new int[n];
        //In the beginning, each element is itself's root
        for(int i=0;i<this.arr.length;i++){
            this.arr[i]=i;
        }
    }
    //Function to find out the ROOT of an element
    public int root(int a){
        int i=a;
        while(i!=this.arr[i]){
            i=this.arr[i];
        }
        return i;
    }
    //Function to determine if two elements are connected or not
    public boolean connected(int a,int b){
        return(this.root(a)==this.root(b));
    }
    //Function to JOIN two elements
    //Each element will have its PARENT at it's place in the array
    public void union(int a, int b){
        if(this.connected(a,b)){
            System.out.println("Already Connected");
            return;
        }
        System.out.println("Before Union: ");
        this.display();
        int aRoot=this.root(a);
        int bRoot=this.root(b);
        this.arr[aRoot]=bRoot;
        System.out.println("Union Done. Result: ");
        this.display();
    }
    public void display(){
        for(int i=0;i<this.arr.length;i++){
            System.out.print(this.arr[i]+" ");
        }
        System.out.println();
    }
}