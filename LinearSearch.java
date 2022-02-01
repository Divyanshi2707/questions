import java.util.Scanner;

public class LinearSearch {
    public static void main(String args[]) {
        int count, elements, integer[], search_value;
        Scanner lObj = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        elements = lObj.nextInt();

        integer = new int[elements];
        System.out.print("Enter " +elements+ " Integer");
        for (count = 0; count < elements; count++) {
            integer[count] = lObj.nextInt();
        }

        System.out.print("Enter the search value: ");
        search_value = lObj.nextInt();

        for (count = 0; count < elements; count++) {
            if (integer[count] == search_value) {
                System.out.print(search_value + " is present at location " +(count+1));
                break;
            }
        }
        if (count == elements)
            System.out.println(search_value+ " doesn't exist in array.");
    }
}
