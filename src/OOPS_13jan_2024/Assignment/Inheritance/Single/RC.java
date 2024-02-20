package src.OOPS_13jan_2024.Assignment.Inheritance.Single;

public class RC {
    public static void main(String[] args) {
      Child c=new Child("Aishwarya",30);//Possible to call all methods both parent common methods and child  specific methods
        //2//Parent obj = new Child();
        //3//Parent obj = new Parent();
        //Child obj = new Parent();
      c.talk();
      c.speak();
      c.Details();

     // c.properties(); //For 2, it's not possible, as we have given parent reference, so we can't access child specific methods
        //Parent reference can be used to hold child class objects, but we can't call child specific methods using parent reference
        //Similarly for 3, we created object for parent with parent reference, so we can access only parent methods
        //For 4, we can't give child reference to create parent as parent is present before child and not after

    }
}
