
/*
 * Manage Recipe Program, ITC 115 Assign 6
 * 
 * Ingredient.java class, extends Item
 * 
 * -Sarah Symonds 3-9-15
 */

public class Ingredient extends Item{
	//Variables
	public String name;
	public String unitSize;
	public double calories;
	public double fat;
	public double carbs;
	public double protein;
	
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUnitSize() {
		return unitSize;
	}
	public void setUnitSize(String unitSize) {
		this.unitSize = unitSize;
	}
	public double getCalories() {
		return calories;
	}
	public void setCalories(double calories) {
		this.calories = calories;
	}
	public double getFat() {
		return fat;
	}
	public void setFat(double fat) {
		this.fat = fat;
	}
	public double getCarbs() {
		return carbs;
	}
	public void setCarbs(double carbs) {
		this.carbs = carbs;
	}
	public double getProtein() {
		return protein;
	}
	public void setProtein(double protein) {
		this.protein = protein;
	}
}
