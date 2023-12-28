package com.example.demo.controller.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.example.demo.model.Drone;

public class DroneRegisterValidator implements ConstraintValidator<DroneRegisterConstraint, String> {

    @Override
    public void initialize(DroneRegisterConstraint contactNumber) {
        System.out.println("Validator init");
    }

    @Override
    public boolean isValid(String contactField, ConstraintValidatorContext cxt) {
        // return contactField != null && contactField.matches("[0-9]+") && (contactField.length() > 8) && (contactField.length() < 14);
        System.out.println("is valid " + contactField);
        // return false;

        return false;
    }

}