import javax.swing.*;
import java.awt.*;

public class AppWindow extends JFrame {

    private int winWidth = 1024;
    private int winHeight = 600;
    private int winPositionX = 300;
    private int winPositionY = 150;

    private GameMap map;
    private GuiPanel mainPanel;


    AppWindow() {
       setupWindow();

       map = new GameMap();
       mainPanel = new GuiPanel();

       add(mainPanel, BorderLayout.EAST);
       add(map);
       setVisible(true);
    }

    private void setupWindow() {
        setLocation(winPositionX, winPositionY);
        setSize(winWidth, winHeight);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("GUIApplication");
        setResizable(false);
    }


}
