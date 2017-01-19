package BelHard.HomeWork10_Versin2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;


/**
 * Created by user on 12.11.2016.
 */


public class DeviceRealizeAV extends Device
{

    protected  String giveType()
    {
        String result = "AV" ;

        return result;
    }

    public  String giveName()
    {
        Random random = new Random();
        int num = random.nextInt(3)+1;
        int numMod = random.nextInt(9);
        String result = "" ;
        switch (num)
        {
            case 1:
                result="Lg";
                ArrayList<String> modelNameLg = new ArrayList<>();
                ArrayList<String> priceLg = new ArrayList<>();
                for (int x = 0; x < 10; x++)
                {
                    modelNameLg.add("32LH570U");
                    modelNameLg.add("55UH605V");
                    modelNameLg.add("24MT48S-PZ");
                    modelNameLg.add("43UH610V");
                    modelNameLg.add("32LH530V");
                    modelNameLg.add("43LH570V");
                    modelNameLg.add("32LH609V");
                    modelNameLg.add("42LF652V-ZA");
                    modelNameLg.add("43UH651V");
                    modelNameLg.add("32LH590U");
                    priceLg.add("1");
                    priceLg.add("2");
                    priceLg.add("3");
                    priceLg.add("4");
                    priceLg.add("5");
                    priceLg.add("6");
                    priceLg.add("7");
                    priceLg.add("8");
                    priceLg.add("9");
                    priceLg.add("10");
                    return result + " " + modelNameLg.get(numMod)+" "+priceLg.get(numMod) ;

                }
                break;
            //break;

            case 2:

                result="Samsung";
                ArrayList<String> modelNameSamsung = new ArrayList<>();
                ArrayList<String> priceSamsung = new ArrayList<>();
                for (int x = 0; x < 10; x++)
                {
                    modelNameSamsung.add("UE40KU6000U");
                    modelNameSamsung.add("UE32K5500AU");
                    modelNameSamsung.add("UE22H5600AK");
                    modelNameSamsung.add("UE49KU6470U");
                    modelNameSamsung.add("UE32J5205AK");
                    modelNameSamsung.add("UE32J4500AK");
                    modelNameSamsung.add("UE49KU6300U");
                    modelNameSamsung.add("UE22H5610AK");
                    modelNameSamsung.add("UE40J5200AU");
                    modelNameSamsung.add("UE49KS7000U");
                    priceSamsung.add("1");
                    priceSamsung.add("2");
                    priceSamsung.add("3");
                    priceSamsung.add("4");
                    priceSamsung.add("5");
                    priceSamsung.add("6");
                    priceSamsung.add("7");
                    priceSamsung.add("8");
                    priceSamsung.add("9");
                    priceSamsung.add("10");
                    return result + " " + modelNameSamsung.get(numMod)+ " " +priceSamsung.get(numMod) ;

                }
                break;

            case 3:

                result="Sony";
                ArrayList<String> modelNameSony = new ArrayList<>();
                ArrayList<String> priceSonny = new ArrayList<>();
                for (int x = 0; x < 10; x++)
                {
                    modelNameSony.add("KDL-43W756C");
                    modelNameSony.add("KDL-43W755C");
                    modelNameSony.add("24MT48S-PZ");
                    modelNameSony.add("KDL-32W705C");
                    modelNameSony.add("KDL-50W808C");
                    modelNameSony.add("KD-49XD8305");
                    modelNameSony.add("KD-55X8509C");
                    modelNameSony.add("KDL-43W807C");
                    modelNameSony.add("KD-55X8005C");
                    modelNameSony.add("KDL-32WD756");
                    priceSonny.add("1");
                    priceSonny.add("2");
                    priceSonny.add("3");
                    priceSonny.add("4");
                    priceSonny.add("5");
                    priceSonny.add("6");
                    priceSonny.add("7");
                    priceSonny.add("8");
                    priceSonny.add("9");
                    priceSonny.add("10");
                    return result + " " + modelNameSony.get(numMod)+ " " + priceSonny.get(numMod);

                }
                break;

        }
        return result;
    }


    public String on()
    {
        return "This device is switch On !!!";

    }

    public String off()
    {
        return "Thhis device is switch Off!!!";

    }

    public  String vivod()
    {

        return giveType() + " " + giveName() +   " " ;
    }



}