
public class AdvancedAstrology {

    public static void printStars(int number) {
        for (int i = 0; i < number; ++i) {
            System.out.print("*");
        }
        System.out.print("\n");
    }

    public static void printSpaces(int number) {
        for (int i = 0; i < number; ++i) {
            System.out.print(" ");
        } 
    }

    private static void printFormat(int height, int count) {
        int spaceCount = height - count;
        int starCount = 2 * count - 1;
        
        printSpaces(spaceCount);
        printStars(starCount);
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; ++i) {
            printSpaces(size - i);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        for (int i = 1; i <= height; ++i) {
            printFormat(height, i);
        }
        printFormat(height, 2);
        printFormat(height, 2);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
