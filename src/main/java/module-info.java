module hi.verkefni.vidtal {
    requires javafx.controls;
    requires javafx.fxml;


    opens hi.verkefni.vinnsla to javafx.fxml;
    exports hi.verkefni.vinnsla;
    exports vidmot;
    opens vidmot to javafx.fxml;
}