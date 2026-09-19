import java.util.Scanner;

class main{
    public static void main(String[] args) {
      char[] arr = {'a','b','c','d','s'};
      for(int i = 1; i<arr.length;i+=2){
          arr[i] = Character.toUpperCase(arr[i]);
          System.out.println(arr);
      }
    }
}