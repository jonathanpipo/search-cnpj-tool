module org.example.testefx {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires com.google.gson;
    requires java.net.http;

    opens org.example.testefx to javafx.fxml;
    opens org.example.testefx.entities to com.google.gson, javafx.base;
    opens org.example.testefx.service to javafx.base;
    opens org.example.testefx.utilities to javafx.base;
    opens org.example.testefx.model to javafx.base;

    exports org.example.testefx;
}