package BelHard.HomeWork10_Versin2;


import java.util.*;
/**
 * Created by user on 12.11.2016.
 */
// Тип Товара
public abstract class TypeOfUnit extends NameFirm
{
// Техника подразделяется на 3 Типа
// AV аудио видео
// MBT мелко бытовая
// КBT крупно бытовая
// AV выпускают все производители
// MBT Samsung и LG
// КBT Samsung и LG

    enum type { AV, MBT, KBT }

    protected abstract String giveType();



}
