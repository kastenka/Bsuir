package anotherPack;

public class fullBody implements Runnable {

    private Thread T;

    private int xPoints[] , yPoints[], nPoints, mills;

    public fullBody() {
        T = new Thread(this);

        this.mills = 100;
        this.xPoints = new int[] {400, 350, 350, 400, 450, 450};
        this.yPoints = new int[]{400, 500, 700, 850, 700, 500};
        this.nPoints = 6;

        T.start();
    }

    public int getMills() {
        return mills;
    }

    public int getnPoints() {
        return nPoints;
    }

    public int[] getxPoints() {
        return xPoints;
    }

    public int[] getyPoints() {
        return yPoints;
    }

    public void run() {
        for (; ; ) {
            int i;
            for(i=0;i<nPoints;i++)
            {
                yPoints[i] -= 8;
            }

            try
            {
                T.sleep(mills);
            } catch (InterruptedException e) {
            }
        }
    }
}
