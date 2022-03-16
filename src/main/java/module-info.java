module com.example.projdate {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.projdate to javafx.fxml;
    exports com.example.projdate;
}