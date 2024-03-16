package week1DynamicConnectivity;

public class QuickFind {
    private int []id;
    public QuickFind(int n)
    {
        id=new int[n];
        for(int i=0;i<n;i++)
        {
            id[i]=i;
        }
    }

    public boolean connected(int p , int q)
    {
        if(id[p]==id[q])return true;
        else return false;
    }

    public void union (int p , int q)
    {
        int pid=id[p];
        int qid=id[q];

        for(int i=0;i<id.length;i++)
        {
            if(id[i]==pid) id[i]=qid;
        }
    }
    public static void main(String[] args) {
        QuickFind qf=new QuickFind(9);
        qf.union(0,1);
        qf.union(5,7);
        qf.union(8,7);
        qf.union(8,1);
        System.out.println((qf.connected(6,1)));
    }
}
