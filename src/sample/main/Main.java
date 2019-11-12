package sample.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
  public static Stage loginStage,mainStage;

  @Override
  public void start(Stage primaryStage) throws Exception {
    this.loginStage = primaryStage;
    primaryStage.setResizable(false);
    openLoginWindow();
  }

  private void openLoginWindow() {
    try {
      FXMLLoader loader = new FXMLLoader(getClass().getResource("/sample/views/login.fxml"));
      AnchorPane pane = loader.load();
      Scene scene = new Scene(pane);
      scene.getStylesheets().add(this.getClass().getResource("/sample/stylesheets/styles.css").toExternalForm());
      loginStage.setScene(scene);
      loginStage.show();

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public  void openMainWindow() {
    try {
      FXMLLoader loader = new FXMLLoader(getClass().getResource("/sample/views/main.fxml"));
      AnchorPane pane = loader.load();
      Scene scene = new Scene(pane);
      mainStage = new Stage();
      scene.getStylesheets().add(this.getClass().getResource("/sample/stylesheets/styles.css").toExternalForm());
      mainStage.setScene(scene);
      mainStage.show();

    } catch (IOException e) {
      e.printStackTrace();
    }
  }


  public static void main(String[] args) {
    launch(args);
  }
}
