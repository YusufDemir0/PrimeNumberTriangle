/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primenumber;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author yusuf
 */
public class Triangle extends Application {

    public ArrayList<Button> numberBoxs = new ArrayList<>();
    GridPane newpane = new GridPane();
    public int k = 10;
    public int maxnumber = 150;

    public void go(String[] args) {
        launch(args);
    }

    public void TriangleDraw(int number) {
        int xd = (int)Math.sqrt(number)*6/4;
        int yd = (int)Math.sqrt(number)*3/4;
        int mission = 1;
        int current = 0;

        for (int i = 1; i < number; i++) {
            Button numberBox = new Button(i + "");
            if (PrimeNumberCalculator.PrimeNumberCalculator(i) == 1) {
                numberBox.setStyle("-fx-background-color: red; -fx-text-fill: white; -fx-font-size: 5;");
            } else {
                numberBox.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white; -fx-font-size: 5;");
            }
            numberBox.setScaleX(2);
            numberBox.setScaleY(2);
            numberBoxs.add(numberBox);
            newpane.add(numberBoxs.get(i - 1), xd, yd);
            if (mission == current) {
                mission++;
                current = 0;
            }

            switch (mission % 3) {
                case 0 -> {
                    xd--;
                    xd--;
                }
                case 1 -> {
                    xd++;
                    yd++;
                }
                default -> {
                    xd++;
                    yd--;
                }
            }
            current++;

        }
    }

    @Override
    public void start(Stage primaryStage) {

        TriangleDraw(this.maxnumber);
        ScrollPane scrollpane = new ScrollPane(newpane);


        // Pencere baþlýðýný belirle
        primaryStage.setTitle("JavaFX 900x900 Sahne Örneði");

        // 900x900 boyutunda bir sahne oluþtur
        Scene scene = new Scene(scrollpane, PrimeNumber.xh, PrimeNumber.yh);
        newpane.setHgap(k);
        newpane.setVgap(k);
        newpane.setLayoutX(k);
        newpane.setLayoutY(k);
        // Sahneyi pencereye ekle
        primaryStage.setScene(scene);

        // Pencereyi göster
        primaryStage.show();

    }
}
