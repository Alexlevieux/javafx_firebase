package sample.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
  Stage loginStage;

  @Override
  public void start(Stage primaryStage) throws Exception {
    this.loginStage = primaryStage;
    primaryStage.setResizable(false);
    openLoginWindow();
  }

  private void openLoginWindow() {
    try {
      FXMLLoader loader = new FXMLLoader(getClass().getResource("/sample/views/sample.fxml"));
      AnchorPane pane = loader.load();
      Scene scene = new Scene(pane);
      loginStage.setScene(scene);
      loginStage.show();

    } catch (IOException e) {
      e.printStackTrace();
    }
  }


  public static void main(String[] args) {
    launch(args);
  }
}
