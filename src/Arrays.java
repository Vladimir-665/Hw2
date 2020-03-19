
public class Arrays {
    public static void main(String[] args) {
        walkCycle();
    }

    public static void reverseArray() {
        int[] arr = {1, 1, 0, 1, 0, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] / 1 == 0) {
                arr[i] = 1;                                       //arr[i] = arr[i] != 1 ? 1 : 0;
            } else {
                arr[i] = 0;
            }
            System.out.print((arr[i])); //arr[i] = 1;
        }
    }

    public static void inPutArray() {
        int[] arr1 = new int[8];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i * 3;
            System.out.print((arr1[i] + " "));
        }
    }

    public static void walkCycle() {
        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < 6) arr2[i] *= 2;
            System.out.print((arr2[i] + " "));
        }
    }
}





