
public abstract class Countable {
	public String name;
	private int count;
	
	public void incrementCount() {
		count++;

	}
	public String getName(){
		return name;
	}
	
	public void resetCount() {
		count = 0;
	}

	
	public int getCount() {
		
		return count;
	}

	
	public String getCountString() {
	
		return String.valueOf(getCount());
	}
}
