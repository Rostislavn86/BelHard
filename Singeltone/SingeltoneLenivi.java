package BelHard.Singeltone;

/**
 * Created by user on 23.10.2016.
 */
public class SingeltoneLenivi // Ленивая Инициализация
{
    static SingeltoneLenivi instance = new SingeltoneLenivi();

    private SingeltoneLenivi()
    {

    }

    public static SingeltoneLenivi getInstance()
    {

        System.out.println("This is Singletone lenivi !!!");

        return instance;
    }
}


