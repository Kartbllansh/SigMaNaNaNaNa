package base;

import com.google.gson.annotations.Expose;

public class Coordinates {
    /**
     * Класс координат
     */
    @Expose(serialize = true)
    private double x;
    @Expose(serialize = true)
    private Integer y; //Максимальное значение поля: 533, Поле не может быть null
    public Coordinates(double x, Integer y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }
    public Integer getY() {
        return y;
    }

    @Override
    public String toString(){
        return "Coordinates: " +
                "x="+x +
                ", y="+y;
    }
}
