package ss6_Inheritance.Bai_tap;

public class Point3D extends Point2D{
    private float z = 0.0f;

    Point3D(){
    }

    Point3D(float x,float y,float z){
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y,float z){
        setXY(x, y);
        this.z = z;
    }
    public float[] getXYZ(){
        float[] arr1 = new float[3];
        arr1[0] = this.getX();
        arr1[1] = this.getY();
        arr1[2] = this.z;
        return arr1;
    }

    @Override
    public String toString() {
        return "Point3D is (x= " + getX() + ",y= " + getY() + ",z= " + this.z + ")";
    }
}
