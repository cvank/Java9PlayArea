module com.tbc.java9.api {

    requires com.tbc.java9pa.service;
    requires java.logging;
    requires javafx.graphics;
    requires javafx.controls;

    exports com.tbc.java9.api to javafx.graphics;



}