package com.example.demo.model;

import com.example.demo.controller.validators.DroneRegisterConstraint;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "drone")
public class Drone {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
	private Integer id;

    @Min(value = 0, message = "x should not be less than 0")
    @Max(value = 10, message = "x should not be greater than 10")
    private int x;

    @Min(value = 0, message = "y should not be less than 0")
    @Max(value = 10, message = "y should not be greater than 10")
    private int y;

    // @Pattern(regexp = "(N|S|E|W|NE|SE|SW|NW)", message = "Not valid prev direction")
    // private String prevDir;

    @DroneRegisterConstraint
    private String prevDir;

	protected Drone() {}

	public Drone(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getId() {
		return id;
	}

    public void setId(int id) {
        this.id = id;
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

    public void setPrevDir(String prevDir) {
        this.prevDir = prevDir;
    }

	@Override
    public String toString() {
        return "Drone{" +
                "id=" + id +
                ", x='" + x + '\'' +
                ", y='" + y + '\'' +
                ", prevDir=" + prevDir +
                '}';
    }
}