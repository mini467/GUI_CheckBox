package application;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class CheckBoxController implements Initializable {

   // Переменные CheckBox:
   @FXML private CheckBox checkBoxPineapple;
   @FXML private CheckBox checkBoxPepperoni;
   @FXML private CheckBox checkBoxBacon;
   @FXML private Label labelCheckBox;

   /**
    * Метод для кнопки объекта с CheckBox:
    */
   public void labelCheckBoxButtonPush(){
      String order = "Ваш заказ:";
      if(checkBoxPineapple.isSelected()){
         order += "\nАнанас";
      }
      if(checkBoxPepperoni.isSelected()){
         order += "\nПепперони";
      }
      if(checkBoxBacon.isSelected()){
         order += "\nБекон";
      }
      labelCheckBox.setText(order);
   }

   @Override
   public void initialize(URL url, ResourceBundle resourceBundle) {

      // Инициализация метки в объекте CheckBox(скрытие этикетки)
      labelCheckBox.setText("");


   }
}
