package lk.ijse.gdse.tableview.controller;

/**
 * --------------------------------------------
 * Author: R.I.B. Shamodha Sahan Rathnamalala
 * GitHub: https://github.com/shamodhas
 * Website: https://shamodha.live
 * --------------------------------------------
 * Created: 10/1/2024 9:04 AM
 * Project: table-view
 * --------------------------------------------
 **/

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import lk.ijse.gdse.tableview.dto.tm.CustomerTM;

import java.net.URL;
import java.util.ResourceBundle;

public class MainPageController implements Initializable {
    @FXML
    private TableColumn<CustomerTM, Integer> colAge;
//    boolean -> Boolean
//    int -> Integer

    @FXML
    private TableColumn<CustomerTM, String> colId;

    @FXML
    private TableColumn<CustomerTM, String> colName;

    @FXML
    private TableColumn<CustomerTM, String> colNic;

    @FXML
    private TableView<CustomerTM> tblSample;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
       colId.setCellValueFactory(new PropertyValueFactory<>("id"));
       colName.setCellValueFactory(new PropertyValueFactory<>("name"));
       colNic.setCellValueFactory(new PropertyValueFactory<>("nic"));
       colAge.setCellValueFactory(new PropertyValueFactory<>("age"));
        CustomerTM customerTM1 = new CustomerTM("C001","amal","111111111111",25);
        CustomerTM customerTM2 = new CustomerTM("C002","kamal","111111111111",30);
        ObservableList<CustomerTM> customerTMS = FXCollections.observableArrayList();
        customerTMS.add(customerTM1);
        customerTMS.add(customerTM2);
        tblSample.setItems(customerTMS);
    }

    @FXML
    public void loadTableData(ActionEvent actionEvent) {
        CustomerTM customerTM1 = new CustomerTM("C001","amal","111111111111",25);
        CustomerTM customerTM2 = new CustomerTM("C002","kamal","111111111111",30);

        ObservableList<CustomerTM> customerTMS = FXCollections.observableArrayList();

        customerTMS.add(customerTM1);
        customerTMS.add(customerTM2);

        tblSample.setItems(customerTMS);
    }

    // Another way
//    public void initialize(){
//        System.out.println("Hello main controller");
//    }



}

