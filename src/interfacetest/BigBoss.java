package interfacetest;

public class BigBoss {

    public void makePeopleDoSomethingForMe(LittleBrother brother) {
        brother.doSomething(new Errand() {
            @Override
            public void excute(int money) {
                System.out.println(money);
            }
        });
    }

    public static void main(String arg[]) {
        BigBoss boss = new BigBoss();
        LittleBrother brother = new LittleBrother();
        boss.makePeopleDoSomethingForMe(brother);
    }

}
