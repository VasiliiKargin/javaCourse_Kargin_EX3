public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 22, 1, 13, 4, 6, 16, 5};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                System.out.print(arr[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 9)
                System.out.print(arr[i] + " ");
        }
        System.out.println("");
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        System.out.println(max);
        int sum = 0;
        for (int i = 0; i< arr.length;i++){
            sum += arr[i];
        }
        System.out.println(sum);
// int[] arr = {3, 22, 1, 13, 4, 6, 16, 5};
        for (int i = arr.length-1; i >= 0;i--){
            System.out.print(arr[i] + " ");
        }
    }
}