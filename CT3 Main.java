import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Main extends Application {

    private TextArea textBox;
    private static final String[] ORANGE_HUES = {
            "#FFA500", "#FF8C00", "#FF7F50", "#FF6347", "#FF4500"
    };

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Option #2: Creating User Interface II");

        BorderPane root = new BorderPane();

        textBox = new TextArea();
        textBox.setStyle("-fx-background-color: blue;");
        textBox.setPrefSize(300, 200); 
        textBox.setPadding(new Insets(180)); 

        MenuBar menuBar = new MenuBar();

        Menu menu = new Menu("Options");

        MenuItem menuItem1 = new MenuItem("Print Date and Time");
        MenuItem menuItem2 = new MenuItem("Save to File");
        MenuItem menuItem3 = new MenuItem("Change Background Color");
        MenuItem menuItem4 = new MenuItem("Exit");

        menu.getItems().addAll(menuItem1, menuItem2, menuItem3, menuItem4);
        menuBar.getMenus().add(menu);

        root.setTop(menuBar);

        root.setCenter(textBox);
        menuItem1.setOnAction(event -> printDateTime());
        menuItem2.setOnAction(event -> saveToFile());
        menuItem3.setOnAction(event -> changeBackgroundColor(root, textBox));
        menuItem4.setOnAction(event -> exitProgram());

        Scene scene = new Scene(root, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void printDateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        textBox.appendText("Current Date and Time: " + now.format(formatter) + "\n");
    }

    private void saveToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt", true))) {
            writer.write(textBox.getText());
            writer.newLine();
            textBox.appendText("Text saved to log.txt\n");
        } catch (IOException e) {
            textBox.appendText("Error saving to file: " + e.getMessage() + "\n");
        }
    }

    private void changeBackgroundColor(BorderPane root, TextArea textBox) {
        String newOrangeHue = generateRandomOrangeHue();
        textBox.setStyle("-fx-background-color: " + newOrangeHue + ";");
        textBox.appendText("Background color changed to: " + newOrangeHue + "\n");
    }

    private void exitProgram() {
        System.exit(0);
    }

    private String generateRandomOrangeHue() {
        Random random = new Random();
        return ORANGE_HUES[random.nextInt(ORANGE_HUES.length)];
    }

    public static void main(String[] args) {
        launch(args);
    }
}
