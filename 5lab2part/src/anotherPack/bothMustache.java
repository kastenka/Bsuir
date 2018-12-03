package anotherPack;

public class bothMustache implements Runnable{

    private Thread T;

    private int firstMustacheX1, firstMustacheX2, MustacheY1, MustacheY2, secondMustacheX1, secondMustacheX2, mills;


    public bothMustache() {

        T = new Thread(this);

        this.mills = 100;
        this.firstMustacheX1 = 370;
        this.firstMustacheX2 = 350;
        this.MustacheY1 = 310;
        this.MustacheY2 = 200;
        this.secondMustacheX1 = 430;
        this.secondMustacheX2 = 450;

        T.start();
    }

    public int getMills() {
        return mills;
    }

    public int getFirstMustacheX1() {
        return firstMustacheX1;
    }

    public int getFirstMustacheX2() {
        return firstMustacheX2;
    }

    public int getMustacheY1() {
        return MustacheY1;
    }

    public int getMustacheY2() {
        return MustacheY2;
    }

    public int getSecondMustacheX1() {
        return secondMustacheX1;
    }

    public int getSecondMustacheX2() {
        return secondMustacheX2;
    }

    public void run() {
        for (; ; ) {
            int i;

            MustacheY1 -= 8;
            MustacheY2 -= 8;

            try {
                T.sleep(mills);
            } catch (InterruptedException e) {
            }
        }
    }
}
