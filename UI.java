import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class UI {
    Map map = new Map();
    String title = "生命游戏";
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JButton jButton[][];

    public void init(Map m){
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        // frame.setLayout(new GridLayout());
        GridLayout gridLayout = new GridLayout(m.getLen(),m.getLen());
        jButton = new JButton[m.getLen()][m.getLen()];

        panel.setLayout(gridLayout);
        frame.add(panel);
        for (int i = 0; i < m.getLen(); i++) {
            for (int j = 0; j < m.getLen(); j++) {
                jButton[i][j] = new JButton();
                jButton[i][j].setSize(20,20);
                jButton[i][j].setVisible(true);
            }
        }

        for (int i = 0; i < m.getLen(); i++) {
            for (int j = 0; j < m.getLen(); j++) {
                panel.add(jButton[i][j]);
                jButton[i][j].show();
            }
        }

        frame.setResizable(false);
        frame.setTitle(title);
        panel.show();
        frame.show();
    }

    public void show(Map m) throws InterruptedException {
        map=m;
        for (int i = 0; i < m.getLen(); i++) {
            for (int j = 0; j < m.getLen(); j++) {
                if(map.get(i, j)==0){
                    jButton[i][j].setBackground(Color.white);
                }else{
                    jButton[i][j].setBackground(Color.black);
                }
            }
        }
        Thread.sleep(500);

        // map=m;
        // clear();
        // int len = map.getLen();
        // for (int i = 0; i < len + 4; i++) {
        // System.out.print("-");
        // }
        // System.out.println();

        // for (int i = 0; i < len; i++) {
        // System.out.print("||");
        // for (int j = 0; j < len; j++) {
        // System.out.print(map.get(i, j));
        // }
        // System.out.println("||");
        // }
        // for (int i = 0; i < len + 4; i++) {
        // System.out.print("-");
        // }
        // System.out.println();
        // Thread.sleep(500);
    }

    private void clear() {
        Map map = new Map();
        for (int i = 0; i < map.getLen(); i++) {
            System.out.println();
        }
    }
}