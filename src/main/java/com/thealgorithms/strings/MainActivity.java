package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Car{
    private String make;
    private String model;
    private String color;

    public Car(String make, String model, String color){
        super();
        this.make=make;
        this.model=model;
        this.color=color;
    }
    public String getMake(){
        return make;
    }
    public void setMake(String make){
        this.make = make;
    }
    public String getModel(){
        return model;
    }
    public void getModel(String model){
        this.model = model;
    }
    public String setColor(){
        return color;
    }
    public void getColor(String color){
        this.color = color;
    }
}
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    Car car1 = new Car("Ford", "Mondeo", "Silver");
    Car car2= new Car("Vauxhall", "Corsa", "Red");

    System.out.println("Car 1's make is "+car1.getMake);
    System.out.println("Car 1's make is "+car1.getModel);
    System.out.println("Car 1's make is "+car1.getColor);

}
