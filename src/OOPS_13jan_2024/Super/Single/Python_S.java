package src.OOPS_13jan_2024.Super.Single;

public class Python_S extends Programming_S{
    String newFeature;

    Python_S(int version, String author,String nf) {
        super(version, author);
        this.newFeature = nf;
    }

    void printPython(){
        this.printInfo();
        System.out.println(this.newFeature);
    }
}
