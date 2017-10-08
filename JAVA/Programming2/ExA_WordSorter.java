package JavaCourse;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class EXA_WordSorter extends Application{
	//Globals
	VBox[] wordContainer;
	TextField tf;
	
	public void start(Stage s) {
		//Global initialization and local declaration
		BorderPane applicationContainer = new BorderPane();
		HBox tableContainer;
		HBox textBoxContainer;
		wordContainer = new VBox[27];
		Button addButton;
		Text tmpT;
		
		//Create the columns
		for(char i = 'A'; i <= 'Z'+1; i++) {
			tmpT = new Text(""+(i==('Z'+1)?'?':i));			//If we are in the last column, we write '?'. Otherwise write the i-th letter
			tmpT.setFont(new Font("Helvetica", 20));		//Make the font large for the headings
			wordContainer[i-'A'] = new VBox(tmpT);
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
				if(text.length() == 0) throw new IllegalArgumentException();
				//We take the first character in the string
				char firstChar = text.toUpperCase().charAt(0);
				//Calculate array index from the first character
				int arrayIndex = (firstChar-'A'<='Z'&firstChar>='A')?firstChar-'A':26;
				//Add the text to the respective container
				this.wordContainer[arrayIndex].getChildren().add(new Text(text));
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
