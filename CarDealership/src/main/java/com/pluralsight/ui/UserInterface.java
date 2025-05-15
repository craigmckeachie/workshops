package com.pluralsight.ui;

import com.pluralsight.data.DealershipFileManager;
import com.pluralsight.model.Dealership;

public class UserInterface {
    Dealership dealership;

    public void display(){
        DealershipFileManager fileManager = new DealershipFileManager();
        dealership = fileManager.getDealership();
        System.out.println(dealership);
    }
}
