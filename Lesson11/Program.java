package BelHard.Lesson11;

/**
 * Created by user on 15.11.2016.
 */
public class Program
{
    static SomeThing mThing;	//mThing - объект класса, реализующего интерфейс Runnable

    public static void main(String[] args)
    {
        mThing = new SomeThing();

        Thread myThready = new Thread(mThing);	//Создание потока "myThready"
        myThready.start();				//Запуск потока

        System.out.println("Главный поток завершён...");
    }
}
