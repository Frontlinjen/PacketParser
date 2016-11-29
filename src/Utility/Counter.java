package Utility;

public class Counter {
	private int counter = 0;
	public Counter(int c)
	{
		counter = c;
	}
	public void Increment()
	{
		++counter;
	}
	public int Count()
	{
		return counter;
	}
	@Override
	public String toString() {
		return Integer.toString(counter);
	}
}
