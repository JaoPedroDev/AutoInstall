module com.autoinstall {
    requires transitive javafx.graphics;
    requires javafx.base;
    requires javafx.controls;
    requires javafx.fxml;

    opens com.autoinstall to javafx.fxml;

    exports com.autoinstall;
}
