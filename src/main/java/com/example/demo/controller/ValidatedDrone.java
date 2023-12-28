package com.example.demo.controller;

import com.example.demo.controller.validators.DroneRegisterConstraint;
import com.example.demo.model.Drone;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;


public class ValidatedDrone {
    // @DroneRegisterConstraint
    private String prevDir;

    @Min(value = 0, message = "x should not be less than 0")
    @Max(value = 10, message = "x should not be greater than 10")
    private int x;

    @Min(value = 0, message = "y should not be less than 0")
    @Max(value = 10, message = "y should not be greater than 10")
    private int y;

    public ValidatedDrone(int x, int y, String prevDir) {
		this.x = x;
		this.y = y;
        this.prevDir  = prevDir;
	}

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getPrevDir() {
        return prevDir;
    }

    @Override
    public String toString() {
        return "::::sama glavna:::: " + this.prevDir;
    }

}
