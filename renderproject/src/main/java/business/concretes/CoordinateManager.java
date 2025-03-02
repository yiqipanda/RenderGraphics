package business.concretes;

import business.abstracts.CoordinateService;
import org.joml.Vector3f;

import entities.concretes.Coordinate;

public class CoordinateManager implements CoordinateService {

    Coordinate coordinateObject;

    public CoordinateManager(Coordinate coordinate) {
        coordinateObject = coordinate;
    }

//    public static void rotation(Coordinate a) {
//
//    }

    @Override
    public float getXAngle() {
        Vector3f normie = coordinateObject.getCoordinateVector();
        return normie.angle(new Vector3f(1, 0, 0));
    }

}
