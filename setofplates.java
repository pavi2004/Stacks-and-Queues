import java.util.*;
class Main {
  ArrayList<Stack> plates=new ArrayList<Stack>();
  int c=0;
  static int cp;
  Stack<Integer> stack;
  void push(int i)
  {
    if(c==cp || c==0)
    {
      c=0;
      stack=new Stack<>();
      plates.add(stack);
    }
    stack.push(i);
    c++;
  }
  int pop()
  {
    if(c==1)
    {
      c=cp;
    }
    else
    {
      c--;
    }
    return (Integer) plates.get(plates.size()-1).pop();
  }
  public static void main(String[] args) {
    Main m=new Main();
    Scanner sc=new Scanner(System.in);
    cp=sc.nextInt();
    int n=sc.nextInt();
    int j=0;
    int k[]=new int[n];
    for(int i=0;i<n;i++)
    {
      String action=sc.next();
      if(action.equals("push"))
      {
        int num=sc.nextInt();
        m.push(num);
      }
      else if(action.equals("pop"))
      {
        k[j]=m.pop();
        j++;
      }
    }
    for(int i=0;i<m.plates.size();i++)
      System.out.print(m.plates.get(i));
  }
}
