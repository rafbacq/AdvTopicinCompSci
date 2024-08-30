package bruh;

public class Stack_11<E> {
	private Object[] array;
	private Object lastElement;
	private int lastIndex;
	public Stack_11()
	{
		array = new Object[10];
		lastElement = 0;
		lastIndex=-1;
	}
	public void push(E e)
	{
		if(lastIndex+2>array.length)
		{
			grow();
			
		}
		lastIndex = lastIndex+1;
		lastElement=e;
		array[lastIndex]=lastElement;

	}
	public void grow() //works
	{
		Object [] newArray = new Object[(int)(array.length*1.5)];
		for(int i=0; i<array.length; i++)
		{
			newArray[i] = array[i];
		}
		array = newArray;
	}
	@SuppressWarnings("unchecked")
	public E peek()
	{
		return (E) lastElement;
	}
	public E pop() //todo
	{
		array[lastIndex]=0;
		@SuppressWarnings("unchecked")
		E temp = (E)lastElement;
		if(lastIndex-1>=0)
		{
			lastElement = array[lastIndex-1];
		}
		else
		{
			lastElement = 0;
		}
		lastIndex = lastIndex-1;
		return temp;
		
	}
	public int size()
	{
		return array.length;
	}
	public boolean isEmpty()//todo
	{
		return lastIndex==-1;
	}
	public Object [] getStack()
	{
		return array;
	}
	public int search(E e)
	{
		
		for(int i=lastIndex; i>=0; i--)
		{
			if(array[i]==e)
			{
				return i;
			}
		}
		return -1;
	}
	

}
