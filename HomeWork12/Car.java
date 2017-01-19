package BelHard.HomeWork12;

/**
 * Created by user on 20.11.2016.
 */
// сделать интерфейс машины, у которой есть публичные методы - разблокировать двери, завестись\выключиться, увеличить скорость,
// уменьшить скорость, переключить передачу, заправить машиную
// сделать класс машины, который имплементит интерфейс. Машина должна заводиться только после того, как ее сняли с сигнализации.
// Машина поедет только если есть топливо
// машина поедет только если включена передача. При нажатии на газ - увеличивается скорость машины, на тормоз - уменьшается.
// Расход топлива. Если закончилось - останавливается, выключается.
// реализовать через внутренние классы двигателя, бензобака, коробки передач и т.д. для этих классов в интерфейсе машины должны быть свои интерфейсы
// Чтобы включить программу чтения с экрана, нажмите быстрые клавиши Ctrl+Alt+Z.. Для просмотра списка быстрых клавиш нажмите быстрые клавиши Ctrl+косая черта..
// программа должна продемонстрировать как машина едет - т.е. на консоль если машина работает после любого действия должна выводиться ее

public class Car extends Bak implements CarInterface,BakInterface,GasPedalInterface,KorobkaInterface,MotorInteface
{
    boolean signalization;

    @Override
    public boolean lockDoors()
    {
        signalization = true;//сигнализация поставлена
        System.out.println("Двери закрыты ");
        return true;
    }

    @Override
    public boolean unlockDoors()
    {
        signalization = false;//сигнализация снята
        System.out.println("Двери открыты ");
        return true;
    }

    @Override
    public boolean startCar()
    {
        if (unlockDoors()==true)
       return true;
        else
        {
            System.out.println("Машина не поедет так как двери не открыты и там никто не сидит !!!");
            return false;
        }

    }

    @Override
    public String stopCar()
    {
        if (isEmptyBak()==true) return "!!!!";
        else
            return "!";
    }

    @Override
    public int incraseSpeed()
    {
        return 0;
    }

    @Override
    public int deincraseSpeed()
    {
        return 0;
    }

    @Override
    public byte setKorobra(byte k)
    {
        return 0;
    }

}
