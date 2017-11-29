public class Circle2 {
    private double radius;

    public Circle2(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setRadius(int radius){System.out.println("Example method, ignore it.");}
    /*You can't have 2 method with the same signature(method name and data types) in the same class.
    * You can have two methods with the same name and different data types or different name and same data types,
    * but not both at the same time. When you have 2 methods with the same name, but
    * different data types the program is going to run the one with the same data types
    * as the variable that called it.*/

    public double getRadius() {
        return radius;
    }

    public String toString() {
        return "Radius = " + radius;//This returns a String and an integer.
    }
    //The toString method is already a method in the the object class so your basically overriding the toString method in the Circle2 class.
    public boolean equals(Object o){
        Circle2 c = (Circle2) o;
        return c.radius == radius;
    }
}
