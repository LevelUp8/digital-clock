package com.digitalclock.example.digitalclockexample;

import javafx.animation.AnimationTimer;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    public VBox container;
    @FXML
    private Label clockLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        container.setStyle("-fx-background-color: black");

        clockLabel.setStyle("-fx-text-fill: green");
        clockLabel.setFont(Font.font("Classic Console", 50d));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");

        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                LocalDateTime localDateTime = LocalDateTime.now();
                clockLabel.setText(formatter.format(localDateTime));
            }
        };

        timer.start();
    }
}