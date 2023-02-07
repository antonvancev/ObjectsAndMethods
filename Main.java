public class Main {
    public  static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic(5, 6);
        arithmetic.getSum();
        arithmetic.getSub();
        arithmetic.getMult();
        arithmetic.displayInfo();

        Basket basket = new Basket();
        basket.add("Молоко", 70, 3, 1.0);
        basket.add("Хлеб", 44, 1, 0.5);
        basket.add("Лом", 1000, 1, 25.1);
        basket.add("Лопата", 500, 1, 5.0);
        basket.print("Корзина");
        System.out.println("Итоговая цена: " + basket.getTotalPrice() + " руб. ");
        System.out.println("Итоговый вес: " + basket.getTotalWeight() + " кг. ");
        basket.clear();

    }
}












