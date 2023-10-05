module com.mycompany.github {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.github to javafx.fxml;
    exports com.mycompany.github;
}
