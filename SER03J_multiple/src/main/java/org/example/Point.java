package org.example;
import java.io.ObjectInputStream;
import java.io.NotSerializableException;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Point implements Serializable {
    private double x;
    private double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        // No-argument constructor
    }

}