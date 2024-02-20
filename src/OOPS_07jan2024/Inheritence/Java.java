package src.OOPS_07jan2024.Inheritence;

public class Java extends Programming {
    String newFeature;
    Java()
    {
       // newFeature="newMod";
        System.out.println("Java DC");
    }
    Java(String feature)
    {
        this.newFeature=feature;
    }
    void printInfo() {
       // author="ABC";//parent class variable OR this.author="hello";
        System.out.println("Feature is -> " + this.newFeature);
        System.out.println("Author is -> " + this.author);


    }

//    int version;
//    String author;

//    Programming(){
//        System.out.println("DC");
//    }
//
//    Programming(String author, int version){
//        this.author = author;
//        this.version = version;
//    }
//
//    void printInfo(){
//        System.out.println(" Program Info ->  "+ this.version + " Author " + this.author);
//
//    }
}
