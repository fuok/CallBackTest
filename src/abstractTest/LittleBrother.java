package abstractTest;

public class LittleBrother {
    private int money = 100;

    public void doSomething(Errand theInterface) {
        theInterface.excute(money);
    }
}
