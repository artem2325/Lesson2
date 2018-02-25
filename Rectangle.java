public class Rectangle {
    public static void main(String[] Args) {
        int length = 20;
        int width = 20;
        int radius = 10;
        System.out.println("Длина отверстия: " + length);
        System.out.println("Ширина отверстия: " + width);
        System.out.println("Радиус круга: " + radius);
        int diameter = radius * 2;
        if (diameter < Math.sqrt(length * length + width * width)) {
            System.out.println("Отверстие будет закрыто");
        } else
            System.out.println("Отверстие не будет закрыто");
    }
}