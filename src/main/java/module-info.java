
module com.example.customermanager {
        requires javafx.controls;
        requires javafx.fxml;

        opens com.example.customermanager.customermanagerapp to javafx.fxml, javafx.base;
        exports com.example.customermanager.customermanagerapp;
        }