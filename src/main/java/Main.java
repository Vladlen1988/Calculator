public class Main {
    public static void main(String[] args) {
        Ints intsCalc = new IntsCalculator();
        //демонстрация
        System.out.println(intsCalc.sum(2, 2));
        System.out.println(intsCalc.mult(3, 3));
        System.out.println(intsCalc.pow(2, 10));
    }
}
