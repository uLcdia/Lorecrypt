
public class Greatest {

    public static int greatest(int... numbers) {
        int greatest = numbers[0];
        for (int number : numbers) {
            if (number > greatest) {
                greatest = number;
            }
        }
        return greatest;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
