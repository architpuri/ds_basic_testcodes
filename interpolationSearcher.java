import java.util.Scanner;
public class interpolationSearcher {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
       System.out.println("Enter Size of Array");
        int n=sc.nextInt();
        int a[]= new int[n];
        System.out.println("Enter Elements");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter element to be found");
        int element=sc.nextInt();
        boolean b=interpolationSearch(a,0,n-1,element);
        if(b)System.out.println("Element Found");
        else System.out.println("Not Found");
    }
    protected static boolean interpolationSearch(int p[],int lo,int hi,int x)
    {
        if(lo>=hi || x<p[lo] || x > p[hi])return false;
        boolean found=false;
        int pos = lo + ((x-p[lo])*(hi-lo)) / (p[hi]-p[lo]);
        if(p[pos]==x)found=true;
        else if(p[pos]>x)interpolationSearch(p,lo,pos-1,x);
        else interpolationSearch(p,pos+1,hi,x);
        return found;
    }
}