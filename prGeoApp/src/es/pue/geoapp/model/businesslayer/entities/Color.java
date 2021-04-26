package es.pue.geoapp.model.businesslayer.entities;

import java.util.Random;

public class Color {

    //<editor-fold defaultstate="collapsed" desc="Estado: Atributos / campos">
    private int red;
    private int green;
    private int blue;
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 255;
    private static int counter = 0;
    public boolean siNo;

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

//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Contructores">
    public Color() {
        this(MAX_VALUE, MAX_VALUE, MAX_VALUE);
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

    //<editor-fold defaultstate="collapsed" desc="Métodos estáticos o de clase">
    public static int getCounter() {
        return Color.counter;
    }

    public static Color getRandomColor() {
        Random rdn = new Random();
        return new Color(rdn.nextInt(MAX_VALUE + 1), rdn.nextInt(MAX_VALUE + 1), rdn.nextInt(MAX_VALUE + 1));
    }

    public static Color fromHexString(String color) {
        if (color == null) {
            throw new NullPointerException("Es obligatorio indicar una cadena de texto");
        }
        if (!color.matches("^#[0-9A-Fa-f]{6}$")) {
            throw new IllegalArgumentException(String.format("El texto %s no tiene formato de color hexadecimal", color));
        }

        return new Color(Integer.parseInt(color.substring(1, 3), 16), Integer.parseInt(color.substring(3, 5), 16), Integer.parseInt(color.substring(5, 7), 16));
    }
//</editor-fold>
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Métodos de instancia u objeto">
    public String toRGBString() {
        return String.format("rgb: %d, %d, %d", this.getRed(), this.getGreen(), this.getBlue());
    }

    public String toHexString(boolean upper) {
        return String.format(upper ? "#%02X%02X%02X" : "#%02x%02x%02x", this.getRed(), this.getGreen(), this.getBlue());
    }

    public String toHexString() {
        return toHexString(true);
    }

//</editor-fold>
    @Override
    public String toString() {
        return "Color{" + "red=" + red + ", green=" + green + ", blue=" + blue + '}';
    }
}
