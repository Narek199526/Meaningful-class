public class CylinderVolume {
    double lengthOfCircle;
    double radius;
    double heightOfCylinder;

    CylinderVolume(double r, double h) {
        lengthOfCircle = 3.14;
        radius = r;
        heightOfCylinder = h;
    }

    double volume() {
        return lengthOfCircle * radius * heightOfCylinder;
    }


    public static void main(String[] args) {
        CylinderVolume cylinder1 = new CylinderVolume(5, 7);
        CylinderVolume cylinder2 = new CylinderVolume(3, 11);
        CylinderVolume cylinder3 = new CylinderVolume(7, 9);
        CylinderVolume cylinder4 = new CylinderVolume(2, 6);
        CylinderVolume cylinder5 = new CylinderVolume(8, 24);
        double vol;
        vol = cylinder1.volume();
        System.out.println("Volume of cylinder1 = " + vol);
        vol = cylinder2.volume();
        System.out.println("Volume of cylinder2 = " + vol);
        vol = cylinder3.volume();
        System.out.println("Volume of cylinder3 = " + vol);
        vol = cylinder4.volume();
        System.out.println("Volume of cylinder4 = " + vol);
        vol = cylinder5.volume();
        System.out.println("Volume of cylinder5 = " + vol);

    }
}
