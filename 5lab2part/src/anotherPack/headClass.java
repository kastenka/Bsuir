package anotherPack;

public class headClass implements Runnable{

    private Thread T;
    private int headY,headX, headHeight, headWidth, mills;

    public headClass(){

        T = new Thread(this);
        this.mills = 100;
        this.headHeight = 100;
        this.headWidth = 100;
        this.headX = 350;
        this.headY = 300;
        T.start();
    }

    public int getHeadHeight() {
        return headHeight;
    }

    public int getHeadWidth() {
        return headWidth;
    }

    public int getHeadX() {
        return headX;
    }

    public int getHeadY() {
        return headY;
    }

    public int getMills() {
        return mills;
    }

    public void run()
    {
        for(;;){
            headY-=8;
            try
            {
                T.sleep(mills);
            }
            catch (InterruptedException e){	}
        }
    }

}