package anotherPack;

public class mainWings implements Runnable {

    private Thread T;
    private int xPoints[], yPoints[], x2Points[], mills, nPoints;

    public mainWings() {
        T = new Thread(this);

        this.mills = 100;
        this.x2Points= new int[]{450, 550, 700, 800, 650, 450};
        this.xPoints = new int[]{350, 250, 100, 50, 100, 350};
        this.yPoints = new int[]{500, 300, 300, 500, 600, 600};
        this.nPoints = 6;

        T.start();
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

    public int getMills() {
        return mills;
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
