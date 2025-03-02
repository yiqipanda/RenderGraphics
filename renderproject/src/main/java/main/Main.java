package main;
import business.concretes.CoordinateManager;
import entities.concretes.Coordinate;


public class Main {
    public static void main(String[] args) {
        CoordinateManager coordinateManager = new CoordinateManager(new Coordinate(3,4));

    }
}