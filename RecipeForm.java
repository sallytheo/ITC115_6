
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;
//import javax.swing.event.ListSelectionEvent;
//import javax.swing.event.ListSelectionListener;


/*
 * Manage Recipe Program, ITC 115 Assign 6
 * 
 * RecipeForm.java, swing form for Recipe.java
 * 
 * -Sarah Symonds 3-9-15
 */

public class RecipeForm {
	Recipes rs = new Recipes();
	
	private JFrame frame;
//	private JPanel borderPanel;
//	private JPanel spanel;
	private JPanel npanel;
	private JPanel wpanel;
//	private JPanel epanel;
	
	private JLabel nlabel;
	private JTextArea nRecipeNameText;
	private JButton nAddRecipeBtn;
	private JButton nGoToList;
	private JButton nExitbtn;

	private JLabel wLabel;
	private JTextArea wInstructionTextArea;
	private JButton wEditInstuctBtn;
	private JButton wAddInstructBtn;
	private JButton wDeleteInstructBtn;
	
	private JLabel eIngredNameLabel;
	private JTextArea eIngredNameTextArea;
	private JLabel eIngredUnitLabel;
	private JTextArea eIngredUnitTextArea;
	private JLabel eIngredCalLabel;
	private JTextArea eIngredCalTextArea;
	private JLabel eIngredFatLabel;
	private JTextArea eIngredFatTextArea;
	private JLabel eIngredCarbLabel;
	private JTextArea eIngredCarbTextArea;
	private JLabel eIngredProtLabel;
	private JTextArea eIngredProtTextArea;
	private JButton eEditIngredBtn;
	private JButton eAddIngredBtn;
	private JButton eDeleteIngredBtn;
	
	Program p = new Program();
	
	public RecipeForm(){
		
		createFrame();
		
	}
	
	private void createFrame(){
		  frame = new JFrame();
		  frame.setBounds(100, 100, 550, 310);
		  frame.add(createPanel());
		  frame.setVisible(true);
	}
	

	
	private JPanel createPanel(){
	  npanel = new JPanel();
	  npanel.setLayout(new FlowLayout());
	  
	  nlabel = new JLabel("Recipe : ");
	  Border border = BorderFactory.createLineBorder(Color.BLUE, 3);
	  //directionsTextArea
	  nRecipeNameText = new JTextArea(1, 15);
	  nRecipeNameText.setBorder(border);
	  nAddRecipeBtn = new JButton("Add New Recipe");
	  nAddRecipeBtn.addActionListener(new nAddRecipeButtonListener());
	  nGoToList = new JButton("Go To List");
	  nGoToList.addActionListener(new nGoToListButtonListener());
	  nExitbtn = new JButton("Exit");
	  nExitbtn.addActionListener(new ExitListener());
	  
	  wpanel = new JPanel();
	  wpanel.setLayout(new FlowLayout());
	  wLabel = new JLabel("Instructions:");
	  wInstructionTextArea = new JTextArea(10, 15);
	  wEditInstuctBtn= new JButton("Edit");
	  wEditInstuctBtn.addActionListener(new editInstructButtonListener());
	  wAddInstructBtn = new JButton("Add New");
	  wAddInstructBtn.addActionListener(new addNewInstuctButtonListener());
	  wDeleteInstructBtn = new JButton("Delete");
	  wDeleteInstructBtn.addActionListener(new DeleteInstructListener());
	  
	  eIngredNameLabel = new JLabel("Ingredient:");
	  eIngredNameTextArea = new JTextArea (1, 10);
	  eIngredUnitLabel = new JLabel("Unit name:");
	  eIngredUnitTextArea = new JTextArea(1, 10);
	  eIngredCalLabel = new JLabel("Calories:");
	  eIngredCalTextArea = new JTextArea(1, 10);
	  eIngredFatLabel = new JLabel("       Fat:");
	  eIngredFatTextArea = new JTextArea(1, 10);
	  eIngredCarbLabel = new JLabel("      Carbs:");
	  eIngredCarbTextArea = new JTextArea(1, 10);
	  eIngredProtLabel = new JLabel("Protein:");
	  eIngredProtTextArea = new JTextArea(1, 10);
	  eEditIngredBtn= new JButton("Edit");
	  eEditIngredBtn.addActionListener(new editIngredButtonListener());
	  eAddIngredBtn = new JButton("Add New");
	  eAddIngredBtn.addActionListener(new addNewIngredButtonListener());
	  eDeleteIngredBtn = new JButton("Delete");
	  eDeleteIngredBtn.addActionListener(new DeleteIngredtListener());
	  
	  
	  
	  npanel.setComponentOrientation(
              ComponentOrientation.LEFT_TO_RIGHT);
	  npanel.add(nlabel);
	  npanel.add(nRecipeNameText);
	  npanel.add(nAddRecipeBtn);
	  npanel.add(nGoToList);
	  npanel.add(nExitbtn);
	  
	  npanel.add(wLabel);
	  npanel.add(wInstructionTextArea);
	  npanel.add(wEditInstuctBtn);
	  npanel.add(wAddInstructBtn);
	  npanel.add(wDeleteInstructBtn);
	  
	  npanel.add(eIngredNameLabel);
	  npanel.add(eIngredNameTextArea);
	  npanel.add(eIngredUnitLabel);
	  npanel.add(eIngredUnitTextArea);
	  npanel.add(eIngredCalLabel);
	  npanel.add(eIngredCalTextArea);
	  npanel.add(eIngredFatLabel);
	  npanel.add(eIngredFatTextArea);
	  npanel.add(eIngredCarbLabel);
	  npanel.add(eIngredCarbTextArea);
	  npanel.add(eIngredProtLabel);
	  npanel.add(eIngredProtTextArea);
	  npanel.add(eEditIngredBtn);
	  npanel.add(eAddIngredBtn);
	  npanel.add(eDeleteIngredBtn);
	  
	  
	  return npanel;
	 } 
	
	

	 
	 private class nAddRecipeButtonListener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				Recipe r = new Recipe();
				r.setName(nRecipeNameText.getText());			
				rs.addItem(r);
				
			}		 
		 }
	 private class nGoToListButtonListener implements ActionListener{


			@Override
			public void actionPerformed(ActionEvent e) {
				for(Recipe recipe: rs.getItems()){
					if(recipe.getName().equals(nRecipeNameText)){
					RecipesForm rsf = new RecipesForm();
					}
				}
			}		 
		 }
	 private class ExitListener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}		 
		 }
	 private class editInstructButtonListener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				Recipe r = new Recipe();
				for(Recipe recipe: rs.getItems()){
					if(recipe.getName().equals(nRecipeNameText)){
						r.setInstructions(wInstructionTextArea.getText());
					}	
				}
			}		 
		 }
	 private class addNewInstuctButtonListener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				Recipe r = new Recipe();
				for(Recipe recipe: rs.getItems()){
					if(recipe.getName().equals(nRecipeNameText)){
						r.setInstructions(wInstructionTextArea.getText());
					}	
				}
			}		 
		 }
	 private class DeleteInstructListener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				Recipe r = new Recipe();
				for(Recipe recipe: rs.getItems()){
					if(recipe.getName().equals(nRecipeNameText)){
						r.setInstructions(null);
					}	
				}
			}		 
		 }
	 private class editIngredButtonListener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				
					
				for(Recipe recipe: rs.getItems()){
					if(recipe.getName().equals(nRecipeNameText)){
						
						Recipe r = recipe;
						for(Ingredient i: r.getIngred()){
							if(i.getName().equals(eIngredNameTextArea)){
						
								i.setName(eIngredNameTextArea.getText());
								i.setCalories(Integer.parseInt(eIngredCalTextArea.getText()));
								i.setUnitSize(eIngredUnitTextArea.getText());
								i.setCarbs(Double.parseDouble(eIngredCarbTextArea.getText()));
								i.setFat(Double.parseDouble(eIngredFatTextArea.getText()));
								i.setProtein(Double.parseDouble(eIngredProtTextArea.getText()));
							}
						}
					}	
				}
			}		 
		 }
			
	 private class addNewIngredButtonListener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				
				for(Recipe recipe: rs.getItems()){
					if(recipe.getName().equals(nRecipeNameText)){
						Ingredient i = new Ingredient();
						i.setName(eIngredNameTextArea.getText());
						i.setCalories(Integer.parseInt(eIngredCalTextArea.getText()));
						i.setUnitSize(eIngredUnitTextArea.getText());
						i.setCarbs(Double.parseDouble(eIngredCarbTextArea.getText()));
						i.setFat(Double.parseDouble(eIngredFatTextArea.getText()));
						i.setProtein(Double.parseDouble(eIngredProtTextArea.getText()));
					}	
				}
			}		 
		 }
	 private class DeleteIngredtListener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				for(Recipe recipe: rs.getItems()){
					if(recipe.getName().equals(nRecipeNameText)){
						Ingredient i = new Ingredient();
						i.setName(null);
						i.setCalories(0);
						i.setUnitSize(null);
						i.setCarbs(0);
						i.setFat(0);
						i.setProtein(0);
					}	
				}
			}		 
		 }
	 
	 
	 
}

