module com.example.sortfromsmallesttolargest {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sortfromsmallesttolargest to javafx.fxml;
    exports com.example.sortfromsmallesttolargest;
}