package appletPack;

import javax.swing.*;
import java.awt.*;

public class appletClass extends JApplet {

    public void paint(Graphics g) {

        g.setColor(Color.RED);

        Font currentFont = g.getFont();
        Font newFont = currentFont.deriveFont(currentFont.getSize() * 6F);
        g.setFont(newFont);

        g.drawString("Таблица Менделеева", 400, 70);
        g.setColor(Color.BLACK);

        newFont = currentFont.deriveFont(currentFont.getSize() * 4F);
        g.setFont(newFont);

        int yLine = 120, xLine = 70;
        int y = 50, x = 50, height = 90, width = 90;
        String [][] firstLine = {{"H","Li","N","K","Rb","Cs", "Fr"}, {"Be","Mg","Ca","Sr","Ba","Ra"}, {"***","***"},
                {"Sc","Y","Lu","Lr"}, {"Ti","Zr", "Hf", "Rf"},
                {"V","Nb","Ta","Db"}, {"Cr","Mo","W","Sg"}, {"Mn","Tc","Re","Bh"}, {"Fe","Ru","Os","Hs"},
                {"Co","Rh","Ir","Mt"}, {"Ni","Pd","Pt","Ds"}, {"Cu", "Ag", "Au", "Rg"}, {"Zn", "Cd", "Hg", "Cn"},
                {"B", "Al", "Ga", "In", "Tl", "Ut"}, {"C", "Si", "Ge", "Sn", "Pb", "Fl"},
                {"N", "P","As","Sb", "Bi","Up"},{"O", "S","Se","Te", "Po","Lv"},{"F", "Cl","Br","I", "At","Us"},
                {"Ne", "Ar","Kr","Xe", "Rn","Uo"},{"He"},
        };

        for (int i = 0; i < 6; i++) {

            if (i == 0) {
                for (int j = 0; j < 7; j++) {
                    g.drawRect(x, y, width, height);
                    y += width;
                    g.drawString(firstLine[i][j], xLine, yLine);
                    yLine+=90;

                }
                xLine+=90;
                x += width;
                y=50+width;
                yLine=120+width;
            }

            if (i == 1) {
                for (int j = 0; j < 6; j++) {
                    g.drawRect(x, y, width, height);
                    g.drawString(firstLine[i][j], xLine, yLine);
                    yLine+=90;
                    y += width;
                }
                xLine+=90;
                x += width;
                y=50+width*5;
                yLine=120+width*5;
            }

            if(i==2){
                for (int j = 0; j < 2; j++) {
                    g.drawRect(x, y, width, height);
                    g.drawString(firstLine[i][j], xLine, yLine);
                    yLine+=90;
                    y += width;
                }
                xLine+=90;
                x += width;
                yLine=120+width*3;
                y=50+width*3;
            }

            if(i==3){
                for (int j = 0; j < 10; j++) {
                    for(int k=0; k < 4; k++)
                    {
                        g.drawRect(x, y, width, height);
                        g.drawString(firstLine[i+j][k], xLine, yLine);
                        yLine+=90;
                        y += width;
                    }
                    xLine+=90;
                    yLine=120+width*3;
                    y=50+width*3;
                    x+=width;
                }
                yLine=120+width;
                y=50+width;
            }


            if(i==4){
                for (int j = 0; j < 6; j++) {
                    for(int k=0; k < 6; k++)
                    {
                        g.drawRect(x, y, width, height);
                        g.drawString(firstLine[i+j+9][k], xLine, yLine);
                        yLine+=90;
                        y += width;
                    }
                    xLine+=90;
                    yLine=120+width;
                    y=50+width;
                    x+=width;
                }
                yLine=120;
                xLine-=90;
                x-=width;
                y=50;
            }

            if(i==5){
                g.drawRect(x, y, width, height);
                g.drawString(firstLine[19][0], xLine, yLine);
            }

        }

    }
}


