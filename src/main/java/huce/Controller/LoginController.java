/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package huce.Controller;

import huce.Model.ApplyPanel;
import huce.Model.WareHouse;
import huce.View.Login;
import huce.View.Main;
import huce.View.WarehousePanel;
import java.sql.Connection;

/**
 *
 * @author Admin
 */
public class LoginController extends Controller {

    public LoginController(WareHouse wareHouse) {
        super(wareHouse);
    }
    @Override
    public void controll(Main mainApp, WarehousePanel warehousePanel, Connection database, Login login) {
        login.addLoginListener((e) -> {
            if (login.getUsername().equals("maingocdoan")
                    && login.getPassword().equals("28025458")) {
                ApplyPanel.apply(mainApp.jMainPanel, warehousePanel);
            } else {
                login.showError();
            }
        });
        ApplyPanel.apply(mainApp.jMainPanel, login);

    }

}
