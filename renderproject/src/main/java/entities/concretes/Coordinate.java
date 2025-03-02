package entities.concretes;
import entities.abstracts.CoordinateInterface;
import org.joml.*;

public class Coordinate implements CoordinateInterface {
    Vector3f vectorForm;
    
    public Coordinate(float x, float y){
        vectorForm = new Vector3f(x,y,0);
    }
    public Vector3f getCoordinateVector(){
        return new Vector3f(vectorForm.x,vectorForm.y,vectorForm.z);
    }

//    public Vector3f getVectorForm() {
//        return vectorForm;
//    }
}
