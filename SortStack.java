import java.util.*; 

class SortStack 
{ 

static Stack<Integer> sortstack(Stack<Integer> 
											input) 
	{ 
		Stack<Integer> tmpStack = new Stack<Integer>(); 
		while(!input.isEmpty()) 
		{ 
			int tmp = input.pop(); 

			while(!tmpStack.isEmpty() && tmpStack.peek() 
												< tmp) 
			{ 
			input.push(tmpStack.pop()); 
			} 
			
			tmpStack.push(tmp); 
		} 
		return tmpStack; 
	} 
	
	public static void main(String args[]) 
	{ 
    Scanner sc=new Scanner(System.in);
		Stack<Integer> input = new Stack<Integer>(); 
    while(true)
    {
      Integer n=sc.nextInt();
      if(n==-1)
        break;
	  	input.push(n); 
    }
		
	
		Stack<Integer> tmpStack=sortstack(input); 
		System.out.println("Sorted numbers are:"); 
	
		while (!tmpStack.empty()) 
		{ 
			System.out.print(tmpStack.pop()+" "); 
		} 
	} 
} 

