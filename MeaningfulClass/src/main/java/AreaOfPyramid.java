public class AreaOfPyramid {
    double lengthOfCircle;
    double radius;
    double heightOfPyramid;

    AreaOfPyramid(double r, double h) {
        lengthOfCircle = 3.14;
        radius = r;
        heightOfPyramid = h;
    }

    double volume() {
        return lengthOfCircle * radius * radius * heightOfPyramid;
    }

    public static void main(String[] args) {
        AreaOfPyramid pyramid1 = new AreaOfPyramid(3, 5);
        AreaOfPyramid pyramid2 = new AreaOfPyramid(4, 2);
        AreaOfPyramid pyramid3 = new AreaOfPyramid(1, 6);
        AreaOfPyramid pyramid4 = new AreaOfPyramid(7, 5);
        AreaOfPyramid pyramid5 = new AreaOfPyramid(6, 9);
        double vol;
        vol = pyramid1.volume();
        System.out.println("Area of pyramid1  = " + vol);
        vol = pyramid2.volume();
        System.out.println("Area of pyramid2  = " + vol);
        vol = pyramid3.volume();
        System.out.println("Area of pyramid3  = " + vol);
        vol = pyramid4.volume();
        System.out.println("Area of pyramid4  = " + vol);
        vol = pyramid5.volume();
        System.out.println("Area of pyramid5  = " + vol);
    }
}
