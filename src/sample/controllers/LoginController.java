package sample.controllers;

import com.firebase.client.Firebase;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXSnackbar;
import com.jfoenix.controls.JFXSnackbarLayout;
import com.jfoenix.controls.JFXTextField;
import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.SnapshotParameters;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.text.Text;
import javafx.util.Duration;
import sample.models.TeacherModel;

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
  private AnchorPane pane4, signUpPane;

  @FXML
  private JFXTextField phoneNumberTxt;

  @FXML
  private JFXPasswordField passwordTxt;

  @FXML
  private JFXTextField nameTxt;

  @FXML
  private JFXTextField usernameTxt;

  @FXML
  private JFXTextField addressTxt;

  @FXML
  private JFXTextField specTxt;

  @FXML
  private JFXPasswordField confirmPasswordTxt;


  @Override
  public void initialize(URL location, ResourceBundle resources) {
    pane1.setStyle("-fx-background-image: url(/sample/src/1.jpg);");
    pane2.setStyle("-fx-background-image: url(/sample/src/2.jpg);");
    pane3.setStyle("-fx-background-image: url(/sample/src/3.jpg);");
    pane4.setStyle("-fx-background-image: url(/sample/src/4.jpg);");
    addAnimation();
    signUpPane.setVisible(true);
    TranslateTransition translateTransition = new TranslateTransition(Duration.seconds(.1), signUpPane);
    translateTransition.setByX(600);
    translateTransition.play();
  }

  private void addAnimation() {
    FadeTransition fade0 = new FadeTransition(Duration.seconds(3), pane4);
    fade0.setFromValue(1);
    fade0.setToValue(0);
    fade0.play();
    fade0.setOnFinished(event1 -> {
      FadeTransition fade1 = new FadeTransition(Duration.seconds(3), pane3);
      fade1.setFromValue(1);
      fade1.setToValue(0);
      fade1.play();

      fade1.setOnFinished(event2 -> {
        FadeTransition fade2 = new FadeTransition(Duration.seconds(3), pane2);
        fade2.setFromValue(1);
        fade2.setToValue(0);
        fade2.play();

        fade2.setOnFinished(event3 -> {
          FadeTransition fade3 = new FadeTransition(Duration.seconds(3), pane1);
          fade3.setFromValue(1);
          fade3.setToValue(0);
          fade3.play();
          fade3.setOnFinished(event4 -> {
            FadeTransition fade4 = new FadeTransition(Duration.seconds(3), pane1);
            fade4.setFromValue(0);
            fade4.setToValue(1);
            fade4.play();

            fade4.setOnFinished(event5 -> {
              FadeTransition fade5 = new FadeTransition(Duration.seconds(3), pane2);
              fade5.setFromValue(0);
              fade5.setToValue(1);
              fade5.play();
              fade5.setOnFinished(event6 -> {
                FadeTransition fade6 = new FadeTransition(Duration.seconds(3), pane3);
                fade6.setFromValue(0);
                fade6.setToValue(1);
                fade6.play();

                fade6.setOnFinished(event7 -> {
                  FadeTransition fade7 = new FadeTransition(Duration.seconds(3), pane4);
                  fade7.setFromValue(0);
                  fade7.setToValue(1);
                  fade7.play();

                  fade7.setOnFinished(event -> {
                    addAnimation();
                  });
                });
              });
            });
          });
        });
      });
    });


  }

  public JFXSnackbar showSnackBar(AnchorPane pane, String message) {

    Text text = new Text();
    text.setText(message);
    JFXSnackbar jfxSnackbar = new JFXSnackbar(pane);
    JFXSnackbar.SnackbarEvent snackbarEvent = new JFXSnackbar.SnackbarEvent(text);
    jfxSnackbar.enqueue(snackbarEvent);
    return jfxSnackbar;
  }

  @FXML
  void registerAction(ActionEvent event) {

    if (nameTxt.getText().isEmpty() == true) {
      showSnackBar(signUpPane, "Please Enter your name");
    }
    Firebase firebase = new Firebase("https://ourproject-8772d.firebaseio.com/");
    TeacherModel teacherModel = new TeacherModel();
    teacherModel.setName(nameTxt.getText());
    teacherModel.setPassword(passwordTxt.getText());
    teacherModel.setUserName(usernameTxt.getText());
    teacherModel.setPhoto("/sample/src/4.jpg");
    teacherModel.setSummary("Hello , I am using awesome app");
    teacherModel.setAddress(addressTxt.getText());
    teacherModel.setSpeciality(specTxt.getText());
    teacherModel.setPhoneNumber(phoneNumberTxt.getText());
    firebase.child("teachers").push().setValue(teacherModel);
  }

  @FXML
  void showSignupPane(ActionEvent event) {

    TranslateTransition translateTransition = new TranslateTransition(Duration.seconds(.5), signUpPane);
    translateTransition.setByX(-600);
    translateTransition.play();
  }

  @FXML
  void hideSignupPane(ActionEvent event) {
    TranslateTransition translateTransition = new TranslateTransition(Duration.seconds(.1), signUpPane);
    translateTransition.setByX(600);
    translateTransition.play();
  }
}
