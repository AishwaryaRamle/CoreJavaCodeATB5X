package src.OOPS_13jan_2024.Super.Single;

public class Java_S extends Programming_S{
    // author, version
        // Sub class / Child

        String newFeature;

        Java_S(){
        System.out.println("I am default Child");
    }

        //Java(18, Sun,Lambda{
        Java_S(int version, String author,String newFeature){
        // Super is used for the calling the Param or Default of Base Class
        super(version,author);
        //super();

        // This is used for the current class
        this.newFeature = newFeature;

    }

        void printDetails(){
        super.printInfo();
        System.out.println("New Feature is " + this.newFeature);
    }

    }

