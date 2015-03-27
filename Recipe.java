
import java.util.ArrayList;

/*
 * Manage Recipe Program, ITC 115 Assign 6
 * 
 * Recipe.java Class, Extends Item, Implements ManageItem
 * 
 * -Sarah Symonds 3-9-15
 */

public class Recipe extends Item implements ManageItems{
	// Variables
	public ArrayList<Ingredient> ingredientList;
	String instructions ;
	
	// getters and setters
	public ArrayList<Ingredient> getRecipeIngredients() {
		return ingredientList;
	}
	public void setRecipeIngredients(ArrayList<Ingredient> recipeIngredients) {
		this.ingredientList = recipeIngredients;
	}
	public String getInstructions() {
		return instructions;
	}
	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}
	
	//Manage item Interface Functions
	@Override
	public void addItem(Item i) {
		ingredientList.add((Ingredient) i);
		
	}
	@Override
	public Item getItem(String name) {
		Item item=null;
		for(Item i: ingredientList){
			if(((Ingredient) i).getName().equals(name)){
				item=i;
			}
		}
		return item;
	}
	@Override
	public void editItem(Item i) {
		for(Item item: ingredientList){
			if (((Ingredient) item).getName().equals(((Ingredient) i).getName())){
				ingredientList.remove(item);
				ingredientList.add((Ingredient)i);
			}
		}
	}
	@Override
	public void removeItem(Item i) {
		for(Item item: ingredientList){
			if (((Ingredient) item).getName().equals(((Ingredient) i).getName())){
				ingredientList.remove(item);
			}
		}
		
	}
	public ArrayList<Ingredient> getIngred() {
		return ingredientList;
	}

}
