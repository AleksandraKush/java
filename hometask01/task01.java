package hometask01;

public class task01 {
   public static void main(String[] args) {
    int[] arr = {10, 8, 20, 4, 15, 2, 5};
    int max = arr[0];
    int min = arr[0];
    for (int i = 0; i < arr.length; i++) {
         if(arr[i] > max){
            max = arr[i];
         }
         if(arr[i] < min){
            min = arr[i];
         }
    }
    System.out.println("Максимальный элемент: " + max );
    System.out.println("Минимальный элемент: " + min );
   } 
}
