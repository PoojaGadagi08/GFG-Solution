Write a program to implement a Stack using Array. Your task is to use the class 
  as shown in the comments in the code editor and complete the functions push() and pop() to implement a stack. 


class MyStack
{

    int top;
	int arr[] = new int[1000];

    MyStack()
	{
		top = -1;
	}
	
	
	//Function to push an integer into the stack.
    void push(int a)
	{
	    // Your code here
	    if(top>=arr.length-1)
	    System.out.println("Overflow");
	    
	    else{
	        top++;
	        arr[top]=a;
	    }
	} 
	
    //Function to remove an item from top of the stack.
	int pop()
	{
        // Your code here
        if(top==-1)
       return -1;
        else{
            return arr[top--];
        }
        
	}
	
}
