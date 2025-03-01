package business;
import entity.*;
import org.joml.Vector3f;

public class CoordinateManager {
    Coordinate coordinateObject;
    public CoordinateManager(Coordinate coordinate){
        coordinateObject = coordinate;
    }
    public float getXAngle(){
        Vector3f normie = coordinateObject.getCoordinateVector();
        return normie.angle(new Vector3f(1,0,0));
    }
    public static void rotation(Coordinate a){

    }
}
