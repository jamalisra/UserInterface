module com.example.userinterface {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.userinterface to javafx.fxml;
    exports com.example.userinterface;
}