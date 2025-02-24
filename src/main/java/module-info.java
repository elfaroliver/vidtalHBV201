module hi.verkefni.vidtal {
    requires javafx.controls;
    requires javafx.fxml;


    opens hi.verkefni.vidtal to javafx.fxml;
    exports hi.verkefni.vidtal;
}