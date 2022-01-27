import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Wish_Ball wish_ball = new Wish_Ball();
        wish_ball.start();
        String question;
        boolean chek = true;
        System.out.println("Приветствую Вас! Я Магический шар! ");
        System.out.println("Для завершения работы введите слово exit");
        while (chek) {
            System.out.println("Введите свой вопрос:");
            question = scanner.nextLine();
            if (question.equals("exit")) chek = false;
            else {
                System.out.println("Думаю, связываюсь с космическим хранилищем Вселенских тайн...");
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    chek = false;
                    e.printStackTrace();
                }
                System.out.println("Мой ответ: " + wish_ball.getAnswer());
            }
        }
        System.out.println("До новых встречь!");
    }
}