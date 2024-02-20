package src.OOPS_13jan_2024.Assignment.Inheritance.Hybrid;
//Hierarchical and Single Inheritance
public class SolarSystem {
}
class Earth extends SolarSystem {
}
class Mars extends SolarSystem {
}
class Moon extends Earth {

    public static void main(String args[])
    {
        SolarSystem s = new SolarSystem();
        Earth e = new Earth();
        Mars m = new Mars();

        System.out.println(s instanceof SolarSystem);
        System.out.println(e instanceof Earth);
        System.out.println(m instanceof SolarSystem);
    }
}
//if create public class e.g. class Earth extends SolarSystem then it show error to create
//Class 'Earth' is public, should be declared in a file named 'Earth.java'
