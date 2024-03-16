package week1DynamicConnectivity;

public class QuickUnion { //lazzzzy approach
    private int []id;
    public QuickUnion(int n)
    {
        id=new int[n];
        for(int i=0;i<n;i++)
        {
            id[i]=i;
        }
    }

    private int root(int i)
    {
        while(i != id[i]) i=id[i];
        return i;
    }

    public boolean connected(int p, int q)
    {
        return root(p)==root(q);
    }

    public void union(int p ,int q)
    {
        int i=root(p);
        int j=root(q);
        id[i]=j;
    }
    public static void main(String[] args) {
        QuickUnion qf=new QuickUnion(9);
        qf.union(0,1);
        qf.union(5,7);
        qf.union(8,7);
        qf.union(8,1);
        System.out.println((qf.connected(6,1)));
    }
}
