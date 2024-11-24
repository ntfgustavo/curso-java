package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class PrimeiroFX extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Button botãoA = new Button("A");
		Button botãoB = new Button("B");
		Button botãoC = new Button("C");
		
		botãoA.setOnAction(e -> System.out.println("A"));
		botãoB.setOnAction(e -> System.out.println("B"));
		botãoC.setOnAction(e -> System.exit(0));
		
		HBox box = new HBox();
		box.setAlignment(Pos.CENTER);
		box.setSpacing(10);
		box.getChildren().add(botãoA);
		box.getChildren().add(botãoB);
		box.getChildren().add(botãoC);

		Scene unicaCena = new Scene(box, 150, 100);
		
		primaryStage.setScene(unicaCena);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		
		launch(args);
		
	}
	
}
