package level9.task0805;

import java.util.Random;

public class MagicBall {
    private static final String CERTAIN = "Бесспорно";
    private static final String DEFINITELY = "Определённо да";
    private static final String MOST_LIKELY = "Вероятнее всего";
    private static final String OUTLOOK_GOOD = "Хорошие перспективы";
    private static final String ASK_AGAIN_LATER = "Спроси позже";
    private static final String TRY_AGAIN = "Попробуй снова";
    private static final String NO = "Мой ответ — нет";
    private static final String VERY_DOUBTFUL = "Весьма сомнительно";

    public static String getPrediction() {
        //напишите тут ваш код
        Random r = new Random();
        int random = new Random().nextInt(8);
        if (random == 0) {
            return CERTAIN;
        } else if (random == 1) {
            return DEFINITELY;
        } else if (random == 2) {
            return MOST_LIKELY;
        } else if (random == 3) {
            return OUTLOOK_GOOD;
        } else if (random == 4) {
            return ASK_AGAIN_LATER;
        } else if (random == 5) {
            return TRY_AGAIN;
        } else if (random == 6) {
            return NO;
        } else if (random == 7) {
            return VERY_DOUBTFUL;
        } else {
            return null;
        }
    }
}

/* более сложный вариант
Random r = new Random();
int prediction = r.nextInt(8) ;
       switch (prediction){
            case 0 : return CERTAIN;
            case 1 : return DEFINITELY;
            case 2 : return MOST_LIKELY;
            case 3 : return OUTLOOK_GOOD;
            case 4 : return ASK_AGAIN_LATER;
            case 5 : return TRY_AGAIN;
            case 6 : return NO;
            case 7 : return VERY_DOUBTFUL;
            default: return null;
}
 */