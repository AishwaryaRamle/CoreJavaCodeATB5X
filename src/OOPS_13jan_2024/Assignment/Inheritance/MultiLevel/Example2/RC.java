package src.OOPS_13jan_2024.Assignment.Inheritance.MultiLevel.Example2;

public class RC {
    public static void main(String[] args) {
        //ATB0XBatch At=new ATB0XBatch();
        ATB0XBatch At0=new ATB0XBatch("0XBatch");
        At0.Batch0xCourse();
        System.out.println("\n");


        ATB3XBatch At3=new ATB3XBatch("3XBatch");
        At3.Batch0xCourse();
        At3.Batch3xCourse();
        System.out.println("\n");

      ATB5XBatch At5 =new ATB5XBatch("5XBatch");
        At5.Batch0xCourse();
        At5.Batch3xCourse();
        At5.Batch5xCourse();

        //ATB5XBatch  atb5x = new ATB0xBatch();  Not possible
    }
}
