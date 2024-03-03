package com.example.userinterface;



import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;

public class UserController {


    @FXML
    private MenuBar menuBar;


    @FXML
    private TableView<Person> tableView;

    @FXML
    private TableColumn<Person, Integer> idColumn;

    @FXML
    private TableColumn<Person, String> firstNameColumn;

    @FXML
    private TableColumn<Person, String> lastNameColumn;

    @FXML
    private TableColumn<Person, String> departmentColumn;

    @FXML
    private TableColumn<Person, String> majorColumn;

    @FXML
    private TableColumn<Person, String> emailColumn;


    @FXML
    private ImageView userImageView;

    @FXML
    private TextField idField;

    @FXML
    private TextField firstNameField;

    @FXML
    private TextField lastNameField;

    @FXML
    private TextField departmentField;

    @FXML
    private TextField majorField;

    @FXML
    private TextField emailField;

    @FXML
    private TextField imageField;


    @FXML
    private Button clearButton;

    @FXML
    private Button addButton;

    @FXML
    private Button deleteButton;

    @FXML
    private Button editButton;




    @FXML
    private void initialize() {




    }
    @FXML
    private void handleAdd() {

        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String department = departmentField.getText();
        String major = majorField.getText();
        String email = emailField.getText();


        Person newPerson = new Person(firstName, lastName, department, major, email);


        tableView.getItems().add(newPerson);


        clearFields();
    }
    @FXML
    private void handleEdit() {

        Person selectedPerson = tableView.getSelectionModel().getSelectedItem();

        if (selectedPerson != null) {

        }
    }


    @FXML
    private void handleDelete() {

        int selectedIndex = tableView.getSelectionModel().getSelectedIndex();

        if (selectedIndex >= 0) {
            tableView.getItems().remove(selectedIndex);
        }
    }


    @FXML
    private void handleClear() {

        clearFields();
    }
    private void clearFields() {
        firstNameField.clear();
        lastNameField.clear();
        departmentField.clear();
        majorField.clear();
        emailField.clear();
    }



}
