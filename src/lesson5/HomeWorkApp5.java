public class HomeWorkApp5 {

    public static void main(String[] args) {
        Personal[] perArr = new Personal[5];
        perArr[0] = new Personal("Иван Петров ", "Начальник ", "pet@mail.ru ", "1234567 ", 100, 54);
        perArr[1] = new Personal("Ольга Иванова ", "Редактор ", "iva@mail.ru ", "2345678 ", 80, 36);
        perArr[2] = new Personal("Сергей Михайлов ", "Журналист ", "mih@mail.ru ", "8765432 ", 50, 43);
        perArr[3] = new Personal("Андрей Макаров ", "Ассистент ", "mak@mail.ru ", "1628467 ", 30 , 28);
        perArr[4] = new Personal("Петр Яковлев ", "Помошник ", "yak@mail.ru ", "2871392 ", 10, 19);


        allWorkers(perArr);
        bigWorkers(perArr,40);


    }

    private static void allWorkers(Personal[] perArr) {
        System.out.println("All workers");
        for (int i = 0; i < perArr.length; i++)
            System.out.println((i + 1) + " " + perArr[i].allInformation());
    }

    private static void bigWorkers(Personal[] perArr, int age) {
        for (int i = 0; i < perArr.length; i++) {
            if (perArr[i].getAge() > age) {
                System.out.println(perArr[i].allInformation());
            }
        }
    }
}




