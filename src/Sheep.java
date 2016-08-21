
public class Sheep extends Countable implements Cloneable {
	
	public Countable clone(Countable c){
		Countable d = new Sheep();
		((Sheep)d).setName(name);
		return d;	
	}
	
	public void setName(String name) {
		this.name = name;
	}


}
