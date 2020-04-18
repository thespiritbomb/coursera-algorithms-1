public class QuickFindUF{
    private int[] arr;
    public QuickFindUF(int n){
        this.arr=new int[n];
        for(int i=0;i<n;i++){
            this.arr[i]=i;
        }
    }
    public boolean connected(int a, int b){
        return(this.arr[a]==this.arr[b]);
    }
    public void union(int a,int b){
        int aParent=this.arr[a];
        int bParent=this.arr[b];
        if(aParent==bParent){
            System.out.println("Already Connected");
            return;
        }
        System.out.println("Before Union: ");
        this.display();
        for(int i=0;i<this.arr.length;i++){
            if(this.arr[i]==aParent){
                this.arr[i]=bParent;
            }
        }
        System.out.println("Union Done. Result:");
        this.display();
    }
    public void display(){
        for(int i=0;i<this.arr.length;i++){
            System.out.print(this.arr[i]+" ");
        }
        System.out.println();
        return;
    }
}