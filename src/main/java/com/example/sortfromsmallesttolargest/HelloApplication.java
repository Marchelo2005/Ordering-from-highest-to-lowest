package com.example.sortfromsmallesttolargest;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication  {


    public static void main(String[] args) {
        int arrayOrder []= {100,10,2,0,-1,4,3,1000};
        int temp=0;
        System.out.println(" Sort from smallest to largest \n Original:");
for (int iterator=0;iterator<arrayOrder.length;iterator++){
    System.out.print(arrayOrder[iterator]+" :: ");
}
        for (int iterator=0;iterator<arrayOrder.length - 1;iterator++){
            for (int iterator1=0;iterator1<arrayOrder.length - 1 - iterator;iterator1++){
            if(arrayOrder[iterator1] < arrayOrder[iterator1 + 1]){
                temp=arrayOrder[iterator1];
                arrayOrder[iterator1]=arrayOrder[iterator1 + 1 ];
                arrayOrder[iterator1 + 1]=temp;

            }
            }
        }
        System.out.println("\n Ordering:");
        for (int iterator=0;iterator<arrayOrder.length;iterator++){
            System.out.print(arrayOrder[iterator]+" :: ");
        }

    }
}