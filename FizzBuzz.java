public class FizzBuzz{
  public static void main(String args[]) {
    int[] numbers = {1, 2, 4, 3, 10, 11, 20, 5, 100, 200};
    fizzBuzz(numbers);
  }

  public static void fizzBuzz(int[] numbers) {
      //Write the function body here 
      for(int i = 0; i < numbers.length; i++){
          if(numbers[i] % 5 == 0 && numbers[i] % 11 == 0){
            System.out.print("FizzBuzz" + " ");
          }else if(numbers[i] % 11 == 0){
            System.out.print("Buzz" + " ");
          }else if(numbers[i] % 5 == 0){
            System.out.print("Fizz" + " ");
          }else {
            System.out.print(numbers[i] + " ");
          }
      }
  }
}
