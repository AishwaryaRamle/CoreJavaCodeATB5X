package src.OOPSCONCEPTS;

public class Multipleobject {
    int x=5;

    public static void main(String[] args) {
        Multipleobject mo=new Multipleobject();
        System.out.println("object1--->"+mo.x);

        Multipleobject mo1=new Multipleobject();
        System.out.println("object2--->"+mo1.x);
    }
}
