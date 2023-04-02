module com.digitalclock.example.digitalclockexample {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.digitalclock.example.digitalclockexample to javafx.fxml;
    exports com.digitalclock.example.digitalclockexample;
}