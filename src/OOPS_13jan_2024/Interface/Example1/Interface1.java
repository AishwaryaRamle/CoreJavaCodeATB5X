package src.OOPS_13jan_2024.Interface.Example1;

   interface Interface1 { //Collection of abstract methods which implemented by class "Hello" (who have implemented interface)
      void say();

      default void hello() {
          System.out.println("I am from Hello Method of Interface1");
      }

  }

  class Main
  {
      public static void main(String[] args) {
          Hello h = new Hello();
          h.say();
          h.hello();
      }
      }

