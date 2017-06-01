public class Puzzle {
  public static void main(String[] args){

  for(int i = -2; i <= 20; i++){
    boolean result = isOdd(i);
    System.out.println( i + " " + result);
    }

  }

  public static boolean isOdd(int num) {
    return num % 2 != 0;
  }
}
