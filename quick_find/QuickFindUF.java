/*In Quick Find, Find(or Connected) operation takes O(1) but Union for each
pair of item takes O(n) time. So, for n elements, O(n^2) time is required.*/
package quick_find;
public class QuickFindUF{
    private int[] arr;
    //In the beginning, each element's entry is its ROOT in the tree
    public QuickFindUF(int n){
        this.arr=new int[n];
        for(int i=0;i<n;i++){
            this.arr[i]=i;
        }
    }
    //Function to determine if two elements are connected or not
    public boolean connected(int a, int b){
        return(this.arr[a]==this.arr[b]);
    }
    //Function to JOIN two elements
    //Each element will have its ROOT at it's place in the array
    //All connected elements will have the same ROOT and the same value in the array
    public void union(int a,int b){
        if(this.connected(a,b)){
            System.out.println("Already Connected");
            return;
        }
        int aRoot=this.arr[a];
        int bRoot=this.arr[b];
        System.out.println("Before Union: ");
        this.display();
        for(int i=0;i<this.arr.length;i++){
            if(this.arr[i]==aRoot){
                this.arr[i]=bRoot;
            }
        }
        System.out.println("Union Done. Result:");
        this.display();
    }
    //Function to display the array
    public void display(){
        for(int i=0;i<this.arr.length;i++){
            System.out.print(this.arr[i]+" ");
        }
        System.out.println();
        return;
    }
}