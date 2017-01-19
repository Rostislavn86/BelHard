package BelHard.Singeltone;

/**
 * Created by user on 23.10.2016.
 */

//https://github.com/topr/singleton-examples

public class EnumS
{
    public enum EnumSingleton {

        INSTANCE;
        // сделать свой метод Гет Инстанс

        public void performOperation(String argument) {
            // ...
            System.out.println("Enum singltone");

        }
    }
}
