
public class Array {
    public static void main(String[] args) {
        String[] names = { "Launching", "Coffee", "Podpo" };
        
        System.out.println("Names: " + names[0]);
        System.out.println("Names: " + names[1]);
        System.out.println("Names: " + names[2]);

        names[0] = "xxxx";

        System.out.println("Names: " + names[0]);
        System.out.println("Names: " + names[1]);
        System.out.println("Names: " + names[2]);

        for (int i = 0; i < names.length; i++) {
            System.out.println("Names: " + names[i]);
        }

        for (String ccc : names) {
            System.out.println("Names: " + ccc);
        }

        
        int[] numbers = { 1, 2, 3, 4, 5 };
        for (Integer xxx : numbers) {
            System.out.println("Numbers: " + xxx);

            // print even and odd numbers
            if (xxx % 2 == 0) {
                System.out.println("Even: " + xxx);
            } else {
                System.out.println("Odd: " + xxx);
            }
        }

        

    }
}