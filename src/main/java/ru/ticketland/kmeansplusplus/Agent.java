package ru.ticketland.kmeansplusplus;

import org.apache.commons.math3.ml.clustering.Clusterable;

import java.util.Arrays;


/**
 * Каждый агент содержит набор точек
 */
public class Agent implements Clusterable {

    //вектор параметров
    private double[] points;

    public Agent(double[] points) {
        this.points = points;
    }

    @Override
    public double[] getPoint() {
        return points;
    }

    @Override
    public String toString() {
        return "Agent{" +
                "points=" + Arrays.toString(points) +
                '}';
    }
}
