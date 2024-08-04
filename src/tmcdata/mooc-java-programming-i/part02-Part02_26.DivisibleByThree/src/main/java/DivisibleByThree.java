public class DivisibleByThree {

    public static void main(String[] args) {
        divisibleByThreeInRange(9, 12);
    }

    public static void divisibleByThreeInRange(int beginning, int end) {
        for (int i = (beginning + ((beginning % 3 == 0) ? 0 : 3 - beginning % 3)); i <= end; i += 3) {
            System.out.println(i);
        }
    }

}
