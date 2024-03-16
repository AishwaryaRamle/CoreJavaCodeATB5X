package src.OOPS_14_JAN_2024.Exceptions_class;

public class Lab134 {
    public static void main(String[] args) {
        try {
            String ip = args[0];
            int a = Integer.parseInt(args[0]);
            int b = 10 / a;
            System.out.println(a);
            System.out.println(b);
        }
        catch (ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e) { //we know which Exception will occur.
            //e.printStackTrace(); will show whole error message in red color
           // System.out.println("ArrayIndexOutOfBoundsException Error ");
            System.out.println(e.getMessage());
        }
        catch (Exception e) //if we have no idea which exception will occur then we use this Exception(Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally {
// 100% executed
            System.out.println("I will be executed any How This cock who can survive the nuclear attack");
        }

        }

    }

