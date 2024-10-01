module lk.ijse.gdse.tableview {
    requires javafx.controls;
    requires javafx.fxml;
    requires lombok;

    opens lk.ijse.gdse.tableview.controller to javafx.fxml;
    opens lk.ijse.gdse.tableview.dto.tm to javafx.base;
    exports lk.ijse.gdse.tableview;
}