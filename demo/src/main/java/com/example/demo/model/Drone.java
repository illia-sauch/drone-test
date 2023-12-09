package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "drone")
public class Drone {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
	private Integer id;

    private int x;
    private int y;
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
        return "FamilyMember{" +
                "id=" + id +
                ", x='" + x + '\'' +
                ", y='" + y + '\'' +
                ", prevDir=" + prevDir +
                '}';
    }
	// public String getFirstName() {
	// 	return firstName;
	// }

	// public String getLastName() {
	// 	return lastName;
	// }
}