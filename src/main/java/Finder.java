public class Finder {
    public static int findMax(int[] intArray) {
        int max = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] > max) {
                max = intArray[i];
            }
        }
        return max;
    }
    public static int findMin(int[] intArray) {
        int min = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] < min) {
                min = intArray[i];
            }
        }
        return min;
    }
}
