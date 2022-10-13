public class Point3D extends Point2D{
    private float z;
    private float[] array1;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float z) {
        super.getX();
        super.getY();
        this.z = z;
    }

//    public float[] getXYZ() {
//        return new float[]{getX(), getY(), z};
//    }
    public void getXYZ() {
        float[] array1 = {getX(), getY(),z};
        for (float a: array1) {
            System.out.print(a + "\t");
        }
    }

    @Override
    public String toString() {
        return "(" + getX() +
                ", " +
                getY() +
                ", " +
                z +
                ")";
    }
}
