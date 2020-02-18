import java.util.*; 

class Queue 
{ 
	Stack<Integer> s1 = new Stack<Integer>(); 
	Stack<Integer> s2 = new Stack<Integer>(); 

	void enQueue(int x) 
	{ 

		while (!s1.isEmpty()) 
		{ 
			s2.push(s1.pop());  
		} 

		s1.push(x); 
 
		while (!s2.isEmpty()) 
		{ 
			s1.push(s2.pop()); 
		} 
	} 

	int deQueue() 
	{ 

		if (s1.isEmpty()) 
		{ 
			System.out.println("Q is Empty"); 
			System.exit(0); 
		} 

		int x = s1.peek(); 
		s1.pop(); 
		return x; 
	} 
}; 

class StackedQueue 
{ 

public static void main(String[] args) 
{ 
  Scanner sc=new Scanner(System.in);
	Queue q = new Queue(); 
  System.out.println("1.enqueue 2.dequeue 0.exit");
  while(true)
    {
      System.out.println("Enter choice:");
    Integer choice=sc.nextInt();
    switch(choice)
    {
      case 1:
        System.out.println("Enter data:");
        q.enQueue(sc.nextInt());
        break;
      case 2:
        System.out.println(q.deQueue());
        break;
      case 0:
        return;
    }
    }
} 
} 

