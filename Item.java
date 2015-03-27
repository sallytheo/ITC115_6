
/*
 * Manage Recipe Program, ITC 115 Assign 6
 * 
 * Item.java Class, Abstract
 * 
 * -Sarah Symonds 3-9-15
 */
public abstract class Item {

	// Variables
	String name;
	
	//get and set
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//Functions
	public String returnName(){
		return name;
	}
}
