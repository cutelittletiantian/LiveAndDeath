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

    public void show(Map m) throws InterruptedException {
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        // frame.setLayout(new GridLayout());
        GridLayout gridLayout = new GridLayout();
        jButton = new JButton[m.getLen()][m.getLen()];

        panel.setLayout(gridLayout);
        frame.add(panel);
        for (int i = 0; i < m.getLen(); i++) {
            for (int j = 0; j < m.getLen(); j++) {
                jButton[i][j] = new JButton();
                jButton[i][j].setSize(20,20);
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