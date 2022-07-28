module com.java.workshopjavafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.java.workshopjavafxjdbc to javafx.fxml;
    opens model.entities to javafx.fxml;
    exports com.java.workshopjavafxjdbc;
    exports model.entities;
}