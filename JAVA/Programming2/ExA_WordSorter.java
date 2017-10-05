import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class ExA_WordSorter extends Application{
	//Helper method to find the column the word belongs to
	public static int findColumnOfWord(String word) throws IllegalArgumentException{
		//Local variable to hold the first charcter
		char firstChar;
		
		//Exception handling
		if(word.length() == 0) throw new IllegalArgumentException();
		
		//firstChar is the first character of the word
		firstChar = word.charAt(0);
		
		//If it is a capital letter, the column will be its distance from 'A'
		if(firstChar >= 'A' && firstChar <= 'Z') return firstChar-'A';
		//If it is a lowecase letter, the column will be its distance from 'a'
		else if(firstChar >= 'a' && firstChar <= 'z') return firstChar-'a';
		//Otherwise we'll put it in the last column
		else return 26;
	}
	
	//Globals
	VBox[] wordContainer;
	TextField tf;
	
	public void start(Stage s) {
		//Global intialization and local declaration
		BorderPane applicationContainer = new BorderPane();
		HBox tableContainer;
		HBox textBoxContainer;
		wordContainer = new VBox[27];
		Button addButton;
		Text tmpT;
		
		//Create the columns
		for(int i = 0; i < wordContainer.length; i++) {
			tmpT = new Text(""+(char)(i==26?'?':'A'+i));	//If we are in the last column, we write '?'. Otherwise write the i-th letter
			tmpT.setFont(new Font("Helvetica", 20));		//Make the font large for the headings
			wordContainer[i] = new VBox(tmpT);
		}
		tableContainer = new HBox(wordContainer);
		applicationContainer.setCenter(tableContainer);
		
		//Creating the text field
		tf = new TextField();
		addButton = new Button("Add");
		//Add button handler
		addButton.setOnAction(a->{
			String text = this.tf.getText();
			try {
				//The helper function tells us which column to put the word in.
				this.wordContainer[WordSorter.findColumnOfWord(text)].getChildren().add(new Text(text));
			} catch (IllegalArgumentException e){
				//No bother, the input is empty, we don't need to do anything
			}
			this.tf.setText("");	//Clear the text field
		});
		textBoxContainer = new HBox(tf);
		textBoxContainer.getChildren().add(addButton);
		applicationContainer.setBottom(textBoxContainer);
		
		//Creating the scene
		s.setScene(new Scene(applicationContainer, 500.0,500.0));
		s.setTitle("WordSorter");
		s.show();
	}
	
	//Main method
	public static void main(String args[]) {
		launch(args);
	}
}
