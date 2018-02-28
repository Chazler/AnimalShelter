package Mainform;

import Animals.Animal;
import Animals.Gender;
import Animals.Reservation;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    public Button addButton;
    public ChoiceBox speciesDropdown;
    public TextField badHabitsText;
    public TextField nameText;
    public TextField reserveNameText;
    public Button reserveSelected;
    public RadioButton femaleRadio;
    public RadioButton maleRadio;
    public ListView lvAnimals;
    public ChoiceBox genderDropdown;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    speciesDropdown.getItems().addAll("Cat", "Dog");
    genderDropdown.getItems().addAll("Male", "Female");
        //maleRadio.setSelected(true);
        Reservation reservation = new Reservation();

        addButton.setOnAction ((event) -> {

            Gender gender = null;
            if(genderDropdown.getSelectionModel().getSelectedItem().equals("Male")){
                gender = Gender.Male;
            }
            else{
                gender = gender.Female;
            }

            if (speciesDropdown.getSelectionModel().getSelectedItem().toString().equals("Dog") && !nameText.getText().trim().isEmpty()){
                reservation.NewDog(nameText.getText().toString(), gender);
            }
            else if(speciesDropdown.getSelectionModel().getSelectedItem().toString().equals("Cat") && !badHabitsText.getText().trim().isEmpty() && !nameText.getText().trim().isEmpty()){
                reservation.NewCat(nameText.getText().toString(), gender, badHabitsText.getText().toString());
            }
            
            lvAnimals.getItems().clear();
            lvAnimals.getItems().setAll(reservation.getAnimals());
        });

        reserveSelected.setOnAction(event ->{
            Animal a;
            a = (Animal) lvAnimals.getSelectionModel().getSelectedItem();
            a.Reserve(reserveNameText.getText());

            lvAnimals.getItems().clear();
            lvAnimals.getItems().setAll(reservation.getAnimals());
        } );
    }
}
