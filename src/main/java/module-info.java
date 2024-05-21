module com.example.system {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.system to javafx.fxml;
    exports com.example.system;
}