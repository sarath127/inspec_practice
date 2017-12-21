import java.util.*;
class Add
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    System.out.print("Enter the number of elements in the array");
    int n=in.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
      System.out.print("Enter the "+ (i+1) +"th element ::");
      a[i]=in.nextInt();
    }
    Arrays.sort(a);
    System.out.println("Array elements in sorted order");
    for(int i=0;i<n;i++)
    {
      System.out.println(a[i]);
    }
  }
}
