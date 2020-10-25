package javabasics;

class Noodle {

    double lengthInCentimeters;
    double widthInCentimeters;
    String shape;
    String ingredients;
    String texture = "brittle";

    Noodle(double lenInCent, double wthInCent, String shp, String ingr) {

        this.lengthInCentimeters = lenInCent;
        this.widthInCentimeters = wthInCent;
        this.shape = shp;
        this.ingredients = ingr;

    }

    public void cook() {

        this.texture = "cooked";

    }

    public static void main(String[] args) {

        Spaghetti spaghettiPomodoro = new Spaghetti();

        System.out.println(spaghettiPomodoro.shape);

    }

}