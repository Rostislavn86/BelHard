package BelHard.HomeWork10_Versin2;

import java.util.Random;

/**
 * Created by user on 12.11.2016.
 */
//
//сделать иерархию классов для техники.
//Должно быть 3 уровня - прибор, категория  (например видеотехника, аудиотехника), и конкретное устройство (несколько)
//у каждого конкретного устройства есть фирма-производитель, у всех производителей есть общий интерфейс
// Все приборы можно включать-выключать.
//Также у устройства можно узнать производителя методом getProducer().
// У производителя можно узнать цену на каждое устройство, т.е. есть метод getPrice(devicecCatehgory)
//в абстрактных классах должны быть как абстрактные, так и обычные методы
//классы задания должны лежать в отдельном пакете, ты можешь сам выбирать что использовать
// - абстр. класс или интерфейс по необходимости.
//https://www.youtube.com/watch?v=GEPfepxEhOY

public class Main
{
    public  interface OnOff
    {
        String on();

        String off();
    }



    public static void main(String[] args)
    {

        Device[] arr = new Device[10];


        arr[0] = new DeviceRealizeAV();
        arr[1] = new DeviceRealizeAV();
        arr[2] = new DeviceRealizeAV();
        arr[3] = new DeviceRealizeAV();
        arr[4] = new DeviceRealizeAV();
        arr[5] = new DeviceRealizeAV();
        arr[6] = new DeviceRealizeAV();
        arr[7] = new DeviceRealizeAV();
        arr[8] = new DeviceRealizeAV();
        arr[9] = new DeviceRealizeAV();

        Random random = new Random();


        for (Device r : arr)
        {
            int onOff = random.nextInt(2)+1;
            if (onOff==1)
            System.out.println(r.on()+r.vivod());
            else System.out.println(r.off()+r.vivod());

        }


    }
}
