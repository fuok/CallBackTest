package abstractTest;

public class BigBoss {

    public void makePeopleDoSomethingForMe(LittleBrother brother) {
        brother.doSomething(new Errand() {
            @Override
            void excute(int money) {
                // 不会强制重写，而且加上了super.方法
                super.excute(money);
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
