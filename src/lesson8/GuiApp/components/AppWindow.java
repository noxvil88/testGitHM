package GuiApp.components;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 06.10.2021
 */

public class AppWindow extends JFrame {

    private int winWidth = 1024;
    private int winHeight = 650;
    private int winPositionX = 300;
    private int winPositionY = 150;

    private GameMap map;
    private GuiPanel mainPanel;

    public AppWindow() {
        setupWindow();

        mainPanel = new GuiPanel(this);
        map = new GameMap(this);

        add(mainPanel, BorderLayout.EAST);
        add(map);
        setVisible(true);
    }

    private void setupWindow() {
        setLocation(winPositionX, winPositionY);
        setSize(winWidth, winHeight);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("GUIApplication");
        setResizable(false);
    }

    void log(String msg) {
        mainPanel.recordLog(msg);
    }

    void refreshGuiInfo(GameMap map) {
        mainPanel.refresh(map);
    }

    void startSession() {
        map.startNewGame();
    }

    void changePositionPlayer(int key) {
        map.update(key);
    }

}
