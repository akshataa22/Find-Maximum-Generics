package Day13;

public class MaxFinder<T extends Comparable<T>> {
    private T a;
    private T b;
    private T c;

    public <Number extends Comparable> Number maxFind(Number x, Number y, Number z) {
        Number max1 = x;
        if (y.compareTo(max1) > 0) {
            max1 = y;
        } if(z.compareTo(max1) > 0) {
            max1 = z;
        }
        return max1;
    }


    public static void main(String[] args) {
        System.out.println("Welcome to maximum finding program using generics.");

        MaxFinder<Integer> maximum = new MaxFinder<>();
        System.out.println(maximum.maxFind(66, 77, 88));
    }
}