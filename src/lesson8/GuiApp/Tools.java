package GuiApp;

import java.util.Random;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 09.10.2021
 */

public class Tools {

    public static Random random = new Random();

    public static int randomValue(int min, int max) {
        return min + random.nextInt(max - min + 1);
    }


}
