package queue_using_two_stack;

import java.io.*; 
import java.util.*; 

public class queue_using_two_stack
{
	int size;
	int top = -1;
	int front = 0;
	int send = 0;
	Stack stack1;
	Stack stack2;

	public queue_using_two_stack(int queueSize)
	{
		size = queueSize;
		stack1 = new Stack(size);
		stack2 = new Stack(size);
	}

	public void enqueue(int value)
	{
		if(stack1.isFull())
			System.out.println("Queue is full");
		else
		{
			stack1.push(value);	
			if(top == -1)
				front = value;
			top++;
		}
	}

	public int dequeue()
	{
		while(!stack1.isEmpty())
		{
			stack2.push(stack1.pop());
			top--;
		}
		
		send = stack2.pop();
		front = stack2.peek();
		
		while(!stack2.isEmpty())
		{
			stack1.push(stack2.pop());
			top++;
		}
		
		return send;
	}

	public int peek()
	{
		return front;
	}

}