module com.example.ashaat_lab2_fx_new {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ashaat_lab2_fx_new to javafx.fxml;
    exports com.example.ashaat_lab2_fx_new;
}