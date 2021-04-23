package es.pue.geoapp.model.businesslayer.entities;

public class Color {

    //<editor-fold defaultstate="collapsed" desc="Estado: Atributos / campos">
    private int red;
    private int green;
    private int blue;
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 255;
    private static int counter = 0;

//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Comportamiento: Métodos/Operaciones">
    //<editor-fold defaultstate="collapsed" desc="Getter/Setter">
    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        if (red < Color.MIN_VALUE || red > Color.MAX_VALUE) {
            throw new IllegalArgumentException(String.format("Valor %d no valido, debe estar entre %d y %d", red, MIN_VALUE, MAX_VALUE));
        }
        this.red = red;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        if (green < Color.MIN_VALUE || green > Color.MAX_VALUE) {
            throw new IllegalArgumentException(String.format("Valor %d no valido, debe estar entre %d y %d", green, MIN_VALUE, MAX_VALUE));
        }
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        if (blue < Color.MIN_VALUE || blue > Color.MAX_VALUE) {
            throw new IllegalArgumentException(String.format("Valor %d no valido, debe estar entre %d y %d", blue, MIN_VALUE, MAX_VALUE));
        }
        this.blue = blue;
    }

    public static int getCounter() {
        return Color.counter;
    }

//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Contructores">
    public Color() {
        this(0, 0, 0);
    }

    public Color(int red, int green, int blue) {
        this.setRed(red);
        this.setGreen(green);
        this.setBlue(blue);

        Color.counter++;
    }

    public Color(int red) {
        this(red, 0, 0);
    }
//</editor-fold>

//</editor-fold>
}
