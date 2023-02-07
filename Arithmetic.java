public class Arithmetic {
    int x;
    int y;

    public Arithmetic(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getSum() {
        return x + y;
    }

    public int getSub() {
        return x - y;
    }

    public int getMult() {
        return x * y;
    }

    public int minFunction() {
        return Math.min(x, y);
    }

    public int maxFunction() {
        return Math.max(x, y);

    }

    public void displayInfo() {
        System.out.println("Сумма чисел: " + getSum());
        System.out.println("Разность чисел:" + getSub());
        System.out.println("Произведение:" + getMult());
        System.out.println("Минимальное число из двух:" + minFunction());
        System.out.println("Максимальное число из двух:" + maxFunction());
    }
}
