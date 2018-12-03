package appletPack;

import anotherPack.*;
import java.awt.*;
import java.applet.*;
import java.applet.Applet;
import java.awt.event.ActionListener;

public class appletClass extends Applet implements Runnable {

    private Thread T;

    private fullBody b_Body = null;
    private bothMustache m_Mustache = null;
    private downWings m_downWings = null;
    private mainWings m_mainWings = null;
    private headClass m_Head = null;

    public void run() {
        setBackground(Color.white);


            while (true){
                repaint();
                try{
                    T.sleep(10);
                }
                catch (InterruptedException e){	}
            }
    }

    public void init() {

        T = new Thread(this);
        T.start();

        b_Body = new fullBody();
        m_Mustache = new bothMustache();
        m_downWings = new downWings();
        m_mainWings = new mainWings();
        m_Head= new headClass();
    }


    public void paint(Graphics g) {

        g.setColor(Color.BLACK);
        g.fillOval(m_Head.getHeadX(),m_Head.getHeadY(), m_Head.getHeadWidth(),m_Head.getHeadHeight());

        g.fillPolygon(b_Body.getxPoints(), b_Body.getyPoints(), b_Body.getnPoints());
        g.drawLine(m_Mustache.getFirstMustacheX1(), m_Mustache.getMustacheY1(), m_Mustache.getFirstMustacheX2(),  m_Mustache.getMustacheY2());
        g.drawLine(m_Mustache.getSecondMustacheX1(), m_Mustache.getMustacheY1(), m_Mustache.getSecondMustacheX2(),  m_Mustache.getMustacheY2());


        g.setColor(Color.RED);
        g.fillPolygon(m_mainWings.getxPoints(), m_mainWings.getyPoints(), m_mainWings.getnPoints());
        g.fillPolygon(m_mainWings.getx2Points(), m_mainWings.getyPoints(), m_mainWings.getnPoints());

        g.setColor(Color.YELLOW);
        g.fillPolygon(m_downWings.getxPoints(), m_downWings.getyPoints(), m_downWings.getnPoints());
        g.fillPolygon(m_downWings.getx2Points(), m_downWings.getyPoints(), m_downWings.getnPoints());

    }

}