import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp4 {

    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);

    public static  int LevelGame = 0;

    public static char[][] room;
    public static char[][] invisibleRoom;
    public static int roomHeight;
    public static int roomWidth;
    public static int roomsizeMin = 3;
    public static int roomSizeMax = 6;
    public static char emptyCell = '_';
    public static char readyCell = '*';
    public static int countEnemies;

    public static char enemy = 'E';
    public static int enemyHP;
    public static int enemyStr;
    public static int enemyValueMin = 5;
    public static int enemyValueMax = 10;

    public static char player = '@';
    public static int playerHP = 100;
    public static int playerStr = 20;
    public static int playerPosX;
    public static int playerPosY;
    public static final int playerMoveUp = 8;
    public static final int playerMoveLeft = 4;
    public static final int playerMoveRight = 6;
    public static final int playerMoveDown = 2;








    public static void main(String[] args) {

        while (isAlivePlayer()) {
            ++LevelGame;
            System.out.println("WELCOME TO LEVEL " + LevelGame);
            roomGameCycle();
        }
        System.out.println("GAME OVER! Player clear room's is " + LevelGame);


    }

    public static void roomGameCycle() {
        createRoom();
        spawnPlayer();
        spawnEnemies();

        while (true) {
            showRoom();
            playerMove();
            showRoom();

            if(!isAlivePlayer()) {
                System.out.println("Player is dead");
                break;
            }

            if(!isExistEnemies()) {
                System.out.println("Current room is clear. Go to LEVEL " + (LevelGame + 1));
                break;
            }
        }
    }

    public static void createRoom() {
        roomWidth = randomValue(roomsizeMin, roomSizeMax);
        roomHeight = randomValue(roomsizeMin, roomSizeMax);
        room = new char[roomHeight][roomWidth];
        invisibleRoom = new char[roomHeight][roomWidth];

        for (int y = 0; y < roomHeight; y++) {
            for (int x = 0; x < roomWidth; x++) {
                room[y][x] =emptyCell;
                invisibleRoom[y][x] = emptyCell;
            }
        }

        System.out.println("Create map with size " + roomWidth + "x" + roomHeight);
    }

     public static void showRoom() {
         System.out.println("=== ROOM ===");
         for (int y = 0; y < roomHeight; y++) {
             for (int x = 0; x < roomWidth; x++) {
                 System.out.print(room[y][x] + "|");
             }
             System.out.println();
         }
         System.out.println("============");
     }

     public static void spawnPlayer() {
        playerPosX = randomValue(0, roomWidth - 1);
         playerPosY = randomValue(0, roomHeight - 1);
         room[playerPosY][playerPosX] = player;
         System.out.println("Player has been spawn in [" + (playerPosX + 1) + ":" + (playerPosY + 1) + "] (HP=" + playerHP + " STR=" + playerStr + ")");
     }

     public static void spawnEnemies() {
         enemyHP = randomValue(enemyValueMin, enemyValueMax);
         enemyStr = randomValue(enemyValueMin, enemyValueMax);

         countEnemies = (roomWidth + roomHeight) / 2;

         int enemyPosX;
         int enemyPosY;

         for (int i = 1; i <= countEnemies;i++) {

             do {
                 enemyPosX = random.nextInt(roomWidth);
                 enemyPosY = random.nextInt(roomHeight);
             } while (!isEmptyCell(room, enemyPosX, enemyPosY) && isEmptyCell(invisibleRoom, enemyPosX, enemyPosY));

             invisibleRoom[enemyPosY][enemyPosX] = enemy;
         }
         System.out.println("Create " + countEnemies + " enemies with HP=" + enemyHP + " STR=" + enemyStr);

    }

    public static void playerMove() {
        int currentPlayerX = playerPosX;
        int currentPlayerY = playerPosY;

        int playerDestination;

        do {
            System.out.println("Enter direction (UP=" + playerMoveUp + ", LEFT=" + playerMoveLeft + ", DOWN=" + playerMoveDown + ", RIGHT=" + playerMoveRight + ") >");
            playerDestination = scanner.nextInt();

            switch (playerDestination) {
                case playerMoveUp:
                    playerPosY -= 1;
                    break;
                case playerMoveLeft:
                    playerPosX -= 1;
                    break;
                case playerMoveDown:
                    playerPosY += 1;
                    break;
                case playerMoveRight:
                    playerPosX += 1;
                    break;
            }
        } while (!checkPlayerMove(currentPlayerX, currentPlayerY, playerPosX, playerPosY));


        playerNextMoveAction(currentPlayerX, currentPlayerY, playerPosX, playerPosY);



    }

    public static void playerNextMoveAction(int lastPosX,int lastPosY, int nextPosX, int nextPosY) {
        if (invisibleRoom[nextPosY][nextPosX] == enemy) {
            playerHP -= enemyStr;
            System.out.println("ALERT! Enemy give damage " + enemyStr + ". Player HP now is " + playerHP);
            countEnemies--;
            invisibleRoom[nextPosY][nextPosX] = emptyCell;
        }

        room[playerPosY][playerPosX] = player;
        room[lastPosY][lastPosX] = readyCell;
    }

    public static boolean checkPlayerMove(int currentX, int currentY, int nextX, int nextY) {
        if (nextX >= 0 && nextX < roomWidth && nextY >= 0 && nextY < roomHeight) {
            System.out.println("Player move to [" + (nextX + 1) + ":" + (nextY + 1) + "] success!");
            return true;
        } else {
            System.out.println("Player - you Invalid! Your move is Fail! Please try again!");
            playerPosX = currentX;
            playerPosY = currentY;
            return false;
        }
    }

    public static boolean isEmptyCell(char[][] checkRoom, int x, int y) {
        return  checkRoom[y][x] == emptyCell;
    }

    public static int randomValue(int min, int max) {
        return min + random.nextInt(max - min + 1);
    }

    public static boolean isExistEnemies() {
        return countEnemies > 0;
    }

    public static boolean isAlivePlayer() {
        return playerHP > 0;
    }
}
