
public class ShapeArray {
    public static void main(String[] args) {
        Shape[] shapeArrObj = new Shape[3];

        shapeArrObj[0] = new Sphere(5);      
        shapeArrObj[1] = new Cylinder(3, 7); 
        shapeArrObj[2] = new Cone(4, 6); 

        for (Shape shape : shapeArrObj) {
            System.out.println(shape);
        }
    }
}