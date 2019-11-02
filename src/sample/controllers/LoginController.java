package sample.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
  @FXML
  private AnchorPane pane1;

  @FXML
  private AnchorPane pane2;

  @FXML
  private AnchorPane pane3;

  @FXML
  private AnchorPane pane4;

  @Override
  public void initialize(URL location, ResourceBundle resources) {
    pane1.setStyle("-fx-background-image: url(\"/sample/src/12.jpg\")");

  }
}
