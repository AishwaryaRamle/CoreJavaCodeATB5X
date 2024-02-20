package src.OOPS_13jan_2024.Assignment.Inheritance.MultiLevel.Example2;
 class A
    {
        int i;
        int j;

        A(int i)    //CONSTRUCTOR 1
        {
            this.i = i;
            j = i;
        }

        A(int i, int j)    //CONSTRUCTOR 2
        {
            this.i = i;
            this.j = j;
        }
    }

    class B extends A
    {
        int j;
        B(int j)
        {
           super(j);
            //show compilation error that there is no default constructor if super(j) not added.
            this.j = j;
        }
    }

    class C extends A
    {
        C(int i)
        {
            super(i); // CONSTRUCTOR 1 called
        }
    }


//If a super class contains two or more constructors and there is no default constructor,
// it is required that the subclass constructor specifically call
// the required super class constructor using super keyword.
