public class App {
  public static void main(String[] args) {
    
    for (int i = 0; i < 50; i++) {
      System.out.println(fibonacci(i));
    }
  }
  public static int fibonacci(int i) {
    
    if (i == 0 || i == 1) {
      return i;

    }else { 
      return fibonacci(i - 1) + fibonacci(i - 2);
      
    }
    
  }
}
