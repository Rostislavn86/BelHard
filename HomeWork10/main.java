//package BelHard.HomeWork10;
//import BelHard.HomeWork10_Example.Shape;
//import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
//
//import java.util.*;
//import java.util.Arrays;
//import java.util.Comparator;
//
////
////сделать иерархию классов для техники.
////Должно быть 3 уровня - прибор, категория  (например видеотехника, аудиотехника), и конкретное устройство (несколько)
////у каждого конкретного устройства есть фирма-производитель, у всех производителей есть общий интерфейс
//// Все приборы можно включать-выключать.
////Также у устройства можно узнать производителя методом getProducer().
//// У производителя можно узнать цену на каждое устройство, т.е. есть метод getPrice(devicecCatehgory)
////в абстрактных классах должны быть как абстрактные, так и обычные методы
////классы задания должны лежать в отдельном пакете, ты можешь сам выбирать что использовать
//// - абстр. класс или интерфейс по необходимости.
////https://www.youtube.com/watch?v=GEPfepxEhOY
//
///**
// * Created by user on 07.11.2016.
// */
////////////////////////////////////////////////////
//public class main
//{
//    // Реализация Интерфейса
//    public  interface OnOff
//    {
//        void on();
//
//        void off();
//    }
//
//    public interface Methods {
//        public void getProducer();
//        public void getPrice();
//
//    }
//
//    public static void main(String[] args)
//    {
//        // Создёаём еденицы товара
//        NameOfModel[] arr = new NameOfModel[6];
//        arr[0] = new Edenitsa1("32LF652","AV","LG",69);
//        arr[1] = new Edenitsa1("32H4000","AV","Samsung",74);
//        arr[2] = new Edenitsa1("40lR458","AV","Funai",50);
//        arr[3] = new Edenitsa1("52K3L","PC","Asus",30);
//        arr[4] = new Edenitsa1("42J5","PC","Samsung",40);
//        arr[5] = new Edenitsa1("34B5000","PC","Lenovo",50);
//
//        for (NameOfModel r : arr)
//        {
//            Random random = new Random();
//            int num = random.nextInt(2)+1;
//            if (num==1) r.on(); else r.off();
//            r.Write1();
//            r.Write2();
//            r.Write3();
//            System.out.println();
//            r.getProducer();
//            r.getPrice();
//
//            System.out.println("");
//        }
//
//
//
//    }
//
//
//}
