package src.OOPS_13jan_2024.abstraction.RealTime_Browser;

public class TC_FIREFOX extends BaseClass{
    @Override
    String openBrowser() {
        System.out.println("Starting FireFox Browser");
        return null;
    }

    @Override
    String closeBrowser() {
        System.out.println("Closing FireFox Browser");
        return null;
    }

    public static void main(String[] args) {
        TC1_CHROME tc=new TC1_CHROME();
        tc.openBrowser();
        tc.closeBrowser();
        tc.Log();

        System.out.println("\n");

        TC_FIREFOX tf=new TC_FIREFOX();
        tf.openBrowser();
        tf.closeBrowser();
        tc.Log();

    }
}
