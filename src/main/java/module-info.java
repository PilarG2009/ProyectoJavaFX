module es.solvam.proyectojavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.solvam.proyectojavafx to javafx.fxml;
    exports es.solvam.proyectojavafx;
    exports es.solvam.proyectojavafx.controlador_vista;
    opens es.solvam.proyectojavafx.controlador_vista to javafx.fxml;
}