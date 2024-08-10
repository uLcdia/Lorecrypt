public class DivisibleByThree {

    public static void main(String[] args) {
        divisibleByThreeInRange(9, 12);
    }
    
    public static void divisibleByThreeInRange(int beginning, int end) {
        int start = beginning + (3 - beginning % 3) % 3;
        for (int i = start; i <= end; i += 3) {
            System.out.println(i);
        }
    }

}
