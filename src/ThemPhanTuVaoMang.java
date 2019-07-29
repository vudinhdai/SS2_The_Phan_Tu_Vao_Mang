import java.util.Scanner;

public class ThemPhanTuVaoMang {


    public static void main(String[] args) {
        int[] array = {12, 3, 4, 5, 6};
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap gia tri can them :");
        int x = scanner.nextInt();
        System.out.println(" nhap vi tri muon them :");
        int index = scanner.nextInt();
        array = addElement(index, x, array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static int[] addElement(int index, int element, int[] array) {
        int newArray[] = new int[array.length + 1];
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        newArray[index] = element;
        for (int i = index + 1; i < array.length; i++) {
            newArray[i] = array[i - 1];
        }
        return newArray;
    }
}



