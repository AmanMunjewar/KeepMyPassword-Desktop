module me.goral.keepmypassworddesktop {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires java.sql;
    requires de.mkammerer.argon2;
    requires de.mkammerer.argon2.nolibs;

    opens me.goral.keepmypassworddesktop to javafx.fxml;
    exports me.goral.keepmypassworddesktop;
}