package Lesson12_13.Interface;

public class Convert implements ConverterTemperature{
    int temp;
    @Override
    public void convert() {
        System.out.println(temp +" градусів Цельсія = "+(temp*1.8+32)+ " градусів по Фаренгейту" );
        System.out.println(temp +" градусів Цельсія = "+(temp+273.15)+ " градусів Кельвина" );
    }
}
