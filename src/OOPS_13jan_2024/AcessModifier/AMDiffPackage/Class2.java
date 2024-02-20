package src.OOPS_13jan_2024.AcessModifier.AMDiffPackage;

import src.OOPS_13jan_2024.AcessModifier.AMDefault.Class1; //imported package of different class

public class Class2 extends Class1 {
    public void doNow() {
        tryMePublic(); // OK
        tryMeProtected(); // OK
        System.out.println(a);
    }
}

//Protected function can get accessible in different package subclass but not able to access in different package non subclass(main)
