package com.example.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.event.ActionEvent;

public class StandardController {

    @FXML private TextArea bottomNumberArea;
    @FXML private TextArea topNumberArea;

    @FXML private Button buttonZero;
    @FXML private Button buttonOne;
    @FXML private Button buttonTwo;
    @FXML private Button buttonThree;
    @FXML private Button buttonFour;
    @FXML private Button buttonFive;
    @FXML private Button buttonSix;
    @FXML private Button buttonSeven;
    @FXML private Button buttonEight;
    @FXML private Button buttonNine;

    @FXML private Button buttonDot;
    @FXML private Button buttonPer;
    @FXML private Button buttonMod;
    @FXML private Button buttonMul;
    @FXML private Button buttonDiv;
    @FXML private Button buttonInc;
    @FXML private Button buttonDec;

    @FXML private Button buttonEqu;

    @FXML private Button buttonClearLine;
    @FXML private Button buttonClearAll;
    @FXML private Button buttonDelete;

    private String bottomNumberAreaValue = bottomNumberArea != null ? bottomNumberArea.getText() : "";
    private StringBuilder bottomNumberValue = new StringBuilder(bottomNumberAreaValue);
    private StringBuilder topNumberValue = new StringBuilder();


    @FXML public void OnButtonZeroClick(ActionEvent event) {
        bottomNumberValue.append(buttonZero.getText());
        bottomNumberArea.setText(bottomNumberValue.toString());
    }
    @FXML public void OnButtonOneClick(ActionEvent event) {
        bottomNumberValue.append(buttonOne.getText());
        bottomNumberArea.setText(bottomNumberValue.toString());
    }
    @FXML public void OnButtonTwoClick(ActionEvent event) {
        bottomNumberValue.append(buttonTwo.getText());
        bottomNumberArea.setText(bottomNumberValue.toString());
    }
    @FXML public void OnButtonThreeClick(ActionEvent event) {
        bottomNumberValue.append(buttonThree.getText());
        bottomNumberArea.setText(bottomNumberValue.toString());
    }
    @FXML public void OnButtonFourClick(ActionEvent event) {
        bottomNumberValue.append(buttonFour.getText());
        bottomNumberArea.setText(bottomNumberValue.toString());
    }
    @FXML public void OnButtonFiveClick(ActionEvent event) {
        bottomNumberValue.append(buttonFive.getText());
        bottomNumberArea.setText(bottomNumberValue.toString());
    }
    @FXML public void OnButtonSixClick(ActionEvent event) {
        bottomNumberValue.append(buttonSix.getText());
        bottomNumberArea.setText(bottomNumberValue.toString());
    }
    @FXML public void OnButtonSevenClick(ActionEvent event) {
        bottomNumberValue.append(buttonSeven.getText());
        bottomNumberArea.setText(bottomNumberValue.toString());
    }
    @FXML public void OnButtonEightClick(ActionEvent event) {
        bottomNumberValue.append(buttonEight.getText());
        bottomNumberArea.setText(bottomNumberValue.toString());
    }
    @FXML public void OnButtonNineClick(ActionEvent event) {
        bottomNumberValue.append(buttonNine.getText());
        bottomNumberArea.setText(bottomNumberValue.toString());
    }


    @FXML public void OnButtonDivClick(ActionEvent event) {
        topNumberValue.append(bottomNumberValue.toString());
        bottomNumberValue = new StringBuilder();
        bottomNumberArea.setText(bottomNumberValue.toString());
    }
    @FXML public void OnButtonMulClick(ActionEvent event) {
        topNumberValue.append(bottomNumberValue.toString());
        bottomNumberValue = new StringBuilder();
        bottomNumberArea.setText(bottomNumberValue.toString());
    }
    @FXML public void OnButtonDecClick(ActionEvent event) {
        topNumberValue.append(bottomNumberValue.toString());
        bottomNumberValue = new StringBuilder();
        bottomNumberArea.setText(bottomNumberValue.toString());
    }
    @FXML public void OnButtonIncClick(ActionEvent event) {
        topNumberValue.append(bottomNumberValue.toString());
        bottomNumberValue = new StringBuilder();
        bottomNumberArea.setText(bottomNumberValue.toString());
    }

}