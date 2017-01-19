package BelHard.HomeWork14;
import java.util.*;
import java.util.Arrays;
import java.util.Comparator;
/**
 * Created by user on 03.11.2016.
 */
//есть некоторое количество спортсменов. сделать класс, который сможет возвращать спортсменов отсортированных по
// количеству общего колва медалей, по количеству золотых, по возрасту. с помошью treeset

// создадим простой объект, в котором будем хранить данные

 class Sportsmen
{
    private String name;//Имя Спортсмена
    private int CountMed;//Количество его медалей
    private int CountGold;//Количество золотых медалей
    private int age;//возраст

    //Конструтктор для ввода значений setSportsmen.add(new Sportsmen("Илья", 2, 3, 44));
    public Sportsmen(String n, int cm,int cg, int a)
    {
        this.name = n;
        this.CountMed = cm;
        this.CountGold = cg;
        this.age = a;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    /////////////////////////////
    public int getCountMed()
    {
        return CountMed;
    }

    public void setCountMed(int countMed)
    {
        CountMed = countMed;
    }

    ///////////////////////////
    public int getCountGold()
    {
        return CountGold;
    }

    public void setCountGold(int CountGold)
    {
        this.CountGold = CountGold;
    }

    /////////////////////////////
    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String toString(){
        return "Имя : "+this.name+" Колич.медалей : "+this.CountMed + " Количество золтых медалей : " + this.CountGold
                + " Возраст " + this.age;
    }





}

