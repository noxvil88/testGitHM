package GuiApp.components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 06.10.2021
 */

public class GuiPanel extends JPanel { //Ctrl + click

    private AppWindow appWindow;

    private JPanel appControlArea;
    private JButton btnStart;
    private JButton btnExit;

    private JPanel gameInfoArea;
    private JLabel levelInfo;
    private JLabel sizeMapInfo;
    private JLabel enemyCountInfo;
    private JLabel enemyHpInfo;
    private JLabel enemyStrInfo;

    private JPanel playerInfoArea;
    private JLabel playerHpInfo;
    private JLabel playerStrInfo;
    private JLabel playerPositionInfo;

    private JPanel playerControlArea;
    private JButton playerMoveUp;
    private JButton playerMoveDown;
    private JButton playerMoveLeft;
    private JButton playerMoveRight;

    private JTextArea gameLog;
    private JScrollPane scrollLogPanel;


    GuiPanel(AppWindow appWindow) {
        this.appWindow = appWindow;

        setLayout(new GridLayout(5, 1));

        setupAppControlArea();
        setupGameInfoArea();
        setupPlayerInfoArea();
        setupPlayerControlArea();
        setupGameLog();

        constructMainPanel();


//        add(btnStart);
//        add(btnExit);

    }

    private void constructMainPanel() {
        add(appControlArea);
        add(gameInfoArea);
        add(playerInfoArea);
        add(playerControlArea);
        add(scrollLogPanel);

    }

    private void setupAppControlArea() {
        appControlArea = new JPanel();
        appControlArea.setLayout(new GridLayout(3, 1));
        btnStart = new JButton("<html><b>Start Game</b></html>");
        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                appWindow.startSession();
            }
        });


        btnExit = new JButton("Exit Game");
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        appControlArea.add(new JLabel("=Game Control="));
        appControlArea.add(btnStart);
        appControlArea.add(btnExit);
    }

    private void setupGameInfoArea() {
        gameInfoArea = new JPanel();
        gameInfoArea.setLayout(new GridLayout(6, 1));
        levelInfo = new JLabel("Level: -");
        sizeMapInfo = new JLabel("Size Map: -:-");
        enemyCountInfo = new JLabel("Enemies: -");
        enemyHpInfo = new JLabel("Enemies HP: -");
        enemyStrInfo = new JLabel("Enemies STR: -");

        gameInfoArea.add(new JLabel("=Game Info="));
        gameInfoArea.add(levelInfo);
        gameInfoArea.add(sizeMapInfo);
        gameInfoArea.add(enemyCountInfo);
        gameInfoArea.add(enemyHpInfo);
        gameInfoArea.add(enemyStrInfo);
    }

    private void setupPlayerInfoArea() {
        playerInfoArea = new JPanel();
        playerInfoArea.setLayout(new GridLayout(4, 1));
        playerHpInfo = new JLabel("Health: -");
        playerStrInfo = new JLabel("Power: -");
        playerPositionInfo = new JLabel("Position: -:-");

        playerInfoArea.add(new JLabel("=Player Info="));
        playerInfoArea.add(playerHpInfo);
        playerInfoArea.add(playerStrInfo);
        playerInfoArea.add(playerPositionInfo);
    }

    private void setupPlayerControlArea() {
        playerControlArea = new JPanel();
        playerControlArea.setLayout(new GridLayout(1, 4));
        playerMoveUp = new JButton("\uD83E\uDC45");
        playerMoveUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                appWindow.changePositionPlayer(GameMap.DIRECTION_UP);
            }
        });

        playerMoveDown = new JButton("\uD83E\uDC47");
        playerMoveDown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                appWindow.changePositionPlayer(GameMap.DIRECTION_DOWN);
            }
        });

        playerMoveLeft = new JButton("\uD83E\uDC44");
        playerMoveLeft.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                appWindow.changePositionPlayer(GameMap.DIRECTION_LEFT);
            }
        });

        playerMoveRight = new JButton("\uD83E\uDC46");
        playerMoveRight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                appWindow.changePositionPlayer(GameMap.DIRECTION_RIGHT);
            }
        });

        playerControlArea.add(playerMoveLeft);
        playerControlArea.add(playerMoveUp);
        playerControlArea.add(playerMoveDown);
        playerControlArea.add(playerMoveRight);
    }

    private void setupGameLog() {
        gameLog = new JTextArea();
        scrollLogPanel = new JScrollPane(gameLog);
        gameLog.setLineWrap(true);
        gameLog.setEditable(false);
    }

    void recordLog(String msg) {
        gameLog.append(msg + "\n");
    }

    void refresh(GameMap map) {
        levelInfo.setText(map.getInfoLevel());
        sizeMapInfo.setText(map.getInfoMap());
        enemyCountInfo.setText("Enemies: " + map.getInfoEnemy().getCountEnemies());
        enemyHpInfo.setText("Enemies HP: " + map.getInfoEnemy().getHealth());
        enemyStrInfo.setText("Enemies STR: " + map.getInfoEnemy().getPower());
        playerHpInfo.setText("Health: " + map.getInfoPlayer().getHealth());
        playerStrInfo.setText("Power: " + map.getInfoPlayer().getPower());
        playerPositionInfo.setText(map.getInfoPlayer().getPosition());

    }


}
