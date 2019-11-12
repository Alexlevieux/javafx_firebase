package sample.controllers;

import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {


  @FXML
  private AnchorPane rootPane, drawerPane, blackPane;

  @Override
  public void initialize(URL location, ResourceBundle resources) {
    FadeTransition fadeTransition = new FadeTransition(Duration.seconds(.1), blackPane);
    fadeTransition.setFromValue(1);
    fadeTransition.setToValue(0);
    fadeTransition.play();

    blackPane.setVisible(false);
    TranslateTransition translateTransition = new TranslateTransition(Duration.seconds(.1), drawerPane);
    translateTransition.setByX(-700);
    translateTransition.play();

//    blackPane.setOnMouseClicked(event -> {
//      FadeTransition fadeTransition2 = new FadeTransition(Duration.seconds(.7), blackPane);
//      fadeTransition2.setFromValue(0.2);
//      fadeTransition2.setToValue(0);
//      fadeTransition2.play();
//
//      fadeTransition2.setOnFinished(event1 -> {
//        blackPane.setVisible(false);
//      });
//      TranslateTransition translateTransition2 = new TranslateTransition(Duration.seconds(.7), drawerPane);
//      translateTransition2.setByX(-700);
//      translateTransition2.play();
//    });
  }


  @FXML
  public void showProfile(javafx.event.ActionEvent actionEvent) {
    FadeTransition fadeTransition = new FadeTransition(Duration.seconds(.7), blackPane);
    fadeTransition.setFromValue(0);
    fadeTransition.setToValue(0.2);
    fadeTransition.play();

    blackPane.setVisible(true);
    TranslateTransition translateTransition = new TranslateTransition(Duration.seconds(1), drawerPane);
    translateTransition.setByX(700);
    translateTransition.play();
  }
}
