public class Fractionitog {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(3, 2);
        Fraction fraction2 = new Fraction(8, 5);
        System.out.println("Дробь " + fraction1.toString());
        Fraction sum = fraction1.add(fraction2);

        Fraction minus = fraction1.subtract(fraction2);
        System.out.println(minus.toString());
    }
}