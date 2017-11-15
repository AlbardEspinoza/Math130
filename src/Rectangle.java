public class Rectangle {

    private double length;
    private double width;

    public Rectangle(double ilength, double iwidth) {//Remember there's no return type for the constructors.
        length = ilength;
        width = iwidth;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double nLength) {//Set methods don't return anything, so they're void. They just "mutate" or change the value of the variable.
        length = nLength;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double nWidth) {
        width = nWidth;
    }

    public double getArea() {
        return length * width;
    }
}

//TODO; finish comments about constructor methods, why it does'nt have static, and void.