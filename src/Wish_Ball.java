import java.util.Random;

public class Wish_Ball extends Thread {
    String[] prediction_list = {"Бесспорно", "Предрешено", "Никаких сомнений",
            "Определённо да", "Можешь быть уверен в этом", "Мне кажется — «да»",
            "Вероятнее всего", "Хорошие перспективы", "Знаки говорят — «да»", "Да",
            "Пока не ясно, попробуй снова", "Спроси позже", "Лучше не рассказывать", "Сейчас нельзя предсказать",
            "Сконцентрируйся и спроси опять", "Даже не думай", "Мой ответ — «нет»", "По моим данным — «нет»",
            "Перспективы не очень хорошие", "Весьма сомнительно"};

    private int answer = 0;

    public String getAnswer() {
        return prediction_list[answer];
    }


    Random random = new Random();

    @Override
    public void run() {
        while (true) {
            answer = random.nextInt(19);
        }
    }
}
