//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
void sort(int[] arr){
    int n = arr.length;
    int temp;
    for(int i = 0; i < n-1; i++){
        for(int j = 0; j < n-1; j++){
            if(arr[j] > arr[j+1]){
            temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
            }
        }
    }
}
void main() {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while(n < 0){
        n = sc.nextInt();
    }
    int[] numbers = new int[n];
    for(int i = 0; i < n; i++){
        numbers[i] = sc.nextInt();
        while(numbers[i] < 0){
            n = sc.nextInt();
        }
    }
    sort(numbers);
    for(int i = 0; i < n; i++){
        IO.println(numbers[i]);
    }
}
