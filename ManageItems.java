
/*
 * Manage Recipe Program, ITC 115 Assign 6
 * 
 * ManageItems.java Class, Interface
 * 
 * -Sarah Symonds 3-9-15
 */

public interface ManageItems {
	void addItem(Item I);
	Item getItem(String name);
	void editItem(Item I);
	void removeItem(Item I);
}
