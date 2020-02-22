import java.util.*; 
 class Node 
	{ 
		String name; 
    int arivaltime;
		Node next; 
 
		public Node(String name,int arivaltime) 
		{ 
			this.name = name; 
      this.arivaltime = arivaltime; 
		} 
	} 
 
public class Main 
{ 
	
	Node head;
  void insert(String n,int data)
  {
    Node newnode=new Node(n,data);
    if(this.head==null)
    {
      this.head=newnode;
      return;
    }
    Node temp=this.head;
    while(temp.next!=null)
    {
      temp=temp.next;
    }
    temp.next=newnode;
  }
void deQueue()
{
	if(head!=null)
	{
String res=this.head.name;
this.head=this.head.next;
System.out.println("the adopted one is "+ res);
return;
	}
System.out.println("none left for adoption");

}
 void deQueueAny(Main dog,Main cat) 
	{ if(dog.head==null && cat.head==null)
    {
      System.out.println("none left for adoption");
      return;
    }
    if(dog.head==null )
    {
      cat.deQueue();
      return;
    }
    if(cat.head==null)
    {
      dog.deQueue();
      return;
    }
    if(dog.head.arivaltime<cat.head.arivaltime)
	{
dog.deQueue();
	}
   else
   {
cat.deQueue();
	}
	} 
 
	 void printList() 
	{ 
    Node temp=this.head;
		while (temp.next != null ) 
		{ 
			System.out.print(temp.name + "->"); 
			temp = temp.next; 
		} 
    System.out.println(temp.name);
	} 
 
	public static void main(String[] args) 
	{ 
    Scanner sc=new Scanner(System.in);
		Main dog=new Main(); 
    Main cat=new Main(); 
    Main any=new Main(); 
   
    while(true)
    {
      System.out.println("1.insert dog \n2.insert cat \n3.adopt dog \n4.adopt cat \n5.adopt any \n0.exit"); 
      int n1=sc.nextInt();
      int t=0;
      switch(n1)
      {
        case 1:
          System.out.println("Enter name:");
          String n=sc.next();
          dog.insert(n,t);
          t++;
          break;
        case 2:
          System.out.println("Enter name:");
          String n2=sc.next();
          cat.insert(n2,t);
          t++;
          break;
        case 3:
          dog.deQueue();
          break;
        case 4:
          cat.deQueue();
          break;
        case 5:
          any.deQueueAny(dog, cat);
          break;
        case 0:
          System.exit(0);
      }
    } 
    
	} 
} 
