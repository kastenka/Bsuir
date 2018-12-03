package anotherPack;

public class downWings implements Runnable {

    private Thread T;
    private int xPoints[], yPoints[], x2Points[], nPoints, mills;

    public downWings() {
        T = new Thread(this);

        this.mills = 100;
        this.xPoints = new int[] {350, 100, 50, 50, 250, 350};
        this.yPoints = new int[]{600, 700, 800, 850, 850, 700};
        this.x2Points = new int[]{450, 700, 750, 750, 500, 450};
        this.nPoints = 6;

        T.start();
    }

    public int getMills() {
        return mills;
    }

    public int[] getyPoints() {
        return yPoints;
    }

    public int[] getxPoints() {
        return xPoints;
    }

    public int getnPoints() {
        return nPoints;
    }

    public int[] getx2Points() {
        return x2Points;
    }

    public void run() {
        for (; ; ) {
            int i;
            for(i=0;i<nPoints;i++)
            {
                yPoints[i] -= 8;
            }
            try {
                T.sleep(mills);
            } catch (InterruptedException e) {
            }
        }
    }

}
