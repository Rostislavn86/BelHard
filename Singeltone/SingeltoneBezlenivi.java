package BelHard.Singeltone;

/**
 * Created by user on 24.10.2016.
 */

//Пример на языке Java: без ленивой инициализации, с использование статического инициализатора

public class SingeltoneBezlenivi
{
    private static SingeltoneBezlenivi instance;

    static {
        instance = new SingeltoneBezlenivi();
        System.out.println("Bezlenivi Singltone");
        // В этом блоке возможна обработка исключений
}

    private SingeltoneBezlenivi () {}

    public static SingeltoneBezlenivi getInstance() {
        return instance;
    }
}
