import java.util.Scanner;
import java.util.LinkedList;
import java.util.Stack;

class Main {
  static Scanner s = new Scanner(System.in);
  public static void main(String[] args) {
    
    LinkedList<String> expresion = new LinkedList<>();
    LinkedList<String> expresionSalida = new LinkedList<>();
    Stack<String> operadores = new Stack<>();
    leer(expresion);
    while(!expresion.isEmpty()){
      String E = expresion.poll();
      //...
    }
    imprimir(expresion);
  }

  public static void leer(LinkedList<String> e){
    String linea = s.nextLine();
    Scanner s2 = new Scanner(linea);
    while(s2.hasNext()){
      e.offer(s2.next());
    }
    s2.close();
  }

  public static void imprimir(LinkedList<String> e){
    for(String item: e){
      System.out.print(item+"\t");
    }
    System.out.println();
  }
}