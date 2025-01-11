import java.util.Vector;
//1. constructor that takes in x, y, z components of the vector. Each parameter is of type double.

//2. Methods to get the values of individual components (e.g. getX, getY, getZ).

//3. A toString method that returns a string that describes this vector.
//This string should be of the form “(x, y, z)” replacing the letters with their values.
//Each component should be formatted to round to exactly two decimal places
// (look at the String.format method to see how to do this).

public class Vector3D {
    double x, y, z; //declaring the double values

    public Vector3D(double x, double y, double z) {// constructor to take in x,y,z components
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x; //getting x value
    }
    public double getY() {
        return y; //getting y value
    }
    public double getZ() {
        return z; //getting z value
    }

    public String toString(){

    }

    public static void main(String[] args) {

    }
}
