package src.OOPS_13jan_2024.AcessModifier.AMDefault;

class Default {
    //Class with default variable
    int a = 10;

    void Method() {
        System.out.println("Hi I am from Default class default method");
    }

    public static void main(String[] args) {
        Default obj = new Default();
        obj.Method();//Can call default method within class

    }
}
