public class Main {
    public static void main(String[] args) {
        System.out.println("Static Methods Tests:");
        System.out.println("isPrime(7): " + MathUtil.isPrime(7)); // true
        System.out.println("gcd(24, 36): " + MathUtil.gcd(24, 36)); // 12
        System.out.println("lcm(4, 5): " + MathUtil.lcm(4, 5)); // 20
        System.out.println("fibonacci(5): " + MathUtil.fibonacci(5)); // 5
        System.out.println("factorial(5): " + MathUtil.factorial(5)); // 120

        MathUtil util = new MathUtil();
        System.out.println("\nNon-Static Methods Tests:");
        System.out.println("isPerfectNumber(28): " + util.isPerfectNumber(28)); // true
        System.out.println("sumOfDigits(123): " + util.sumOfDigits(123)); // 6
        System.out.println("reverseNumber(123): " + util.reverseNumber(123)); // 321
        System.out.println("isArmstrongNumber(153): " + util.isArmstrongNumber(153)); // true
        System.out.println("nextPrime(10): " + util.nextPrime(10)); // 11
    }
}