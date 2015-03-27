
import java.util.ArrayList;

/*
 * Manage Recipe Program, ITC 115 Assign 6
 * 
 * Recipes.java Class, Implements ManageItem
 * 
 * -Sarah Symonds 3-9-15
 */

public class Recipes implements ManageItems{
	//Variables
	public ArrayList<Recipe> recipeList = new ArrayList<Recipe>();
	

	//Getters and Setters
	public ArrayList<Recipe> getRecipeList() {
		return recipeList;
	}

	public void setRecipeList(ArrayList<Recipe> recipeList) {
		this.recipeList = recipeList;
	}

	//Manage Items Interface Methods
	@Override
	public void addItem(Item i) {
		recipeList.add((Recipe)(i));	
	}
	
	public void addItem(Recipe i) {
		recipeList.add(i);	
	}


	@Override
	public Item getItem(String name) {
		Item item=null;
		for(Item i: recipeList){
			if(i.getName().equals(name)){
				item=i;
			}
		}
		return item;
	}

	@Override
	public void editItem(Item i) {
		  for(Item item: recipeList){
				if (item.getName().equals(i.getName())){
					recipeList.remove(item);
					recipeList.add((Recipe)i);
				}
			}
	}

	@Override
	public void removeItem(Item i) {
		for(Item item : recipeList){
			if(item.getName().equals(i.getName())){
				recipeList.remove(item);
			}
		}
	}
	

	public ArrayList<Recipe> getItems() {
		return recipeList;
	}

}
