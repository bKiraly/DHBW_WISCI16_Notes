import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.*;
public class Ex9_JavaFX extends Application{
	//Main method
	public static void main(String[] args) {
		launch(args);
	}
	
	//Constants
	final boolean POSITION_LEFT = true;
	final boolean POSITION_BOTTOM = false;
	
	//Globals
	VBox right;
	VBox left;
	HBox bottom;
	
	//Button event handler
	public void addButton(Pane a, boolean position) {
		//Create a new button
		Button b;
		
		//Set the text according to position
		if(position == POSITION_LEFT)
			b = new Button("Left: "+this.left.getChildren().size());
		else if(position == POSITION_BOTTOM)
			b = new Button("Bottom: "+this.bottom.getChildren().size());
		else
			throw new ArithmeticException();	//This is literally impossible
		
		//Set the event handler to be this method
		b.setOnAction(e->this.addButton(a, position));
		
		//Add button to corresponding container
		a.getChildren().add(b);
	}
	
	//Main program handler
	public void start (Stage myStage) throws Exception {
		//Initialize globals and declare new variables
		BorderPane applicationContainer = new BorderPane();
		left = new VBox();
		bottom = new HBox();
		right = new VBox();
		Button top;
		StackPane center;

		//Set up inital buttons in left and bottom containers
		for (int i = 0; i<5; i++){
			addButton(left, POSITION_LEFT);
			addButton(bottom, POSITION_BOTTOM);
		}

		//Set up the top button to add buttons in the area on the right
		top = new Button("Add labels");
		top.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		top.setOnAction(e->this.right.getChildren().add(new Label("Label "+(this.right.getChildren().size()))));
		
		//Set up the center to have a fancy text
		center = new StackPane();
		Rectangle rect = new Rectangle(250,100);
		rect.setFill(new LinearGradient(0.5,0,0.5,1,true,CycleMethod.NO_CYCLE, new Stop(0.0, Color.BLACK), new Stop(0.5, Color.WHITE), new Stop(1.0, Color.BLACK)));
		center.getChildren().add(rect);
		Label l = new Label("Fancy Text");
		l.setFont(new Font("Helvetica", 30));
		center.getChildren().add(l);
		
		//Add all elements to the main application container
		applicationContainer.setTop(top);
		applicationContainer.setRight(right);
		applicationContainer.setBottom(bottom);
		applicationContainer.setLeft(left);
		applicationContainer.setCenter(center);
		
		//Add the application container to the window
		myStage.setScene(new Scene (applicationContainer,500.0,500.0));
		myStage.show();
	}
}
