import java.util.Arrays;
import java.util.Scanner;

// 12.	Программа получает N параметров вызова (аргументы командной строки).
//  Эти параметры – элементы вектора. Строится массив типа double, а на базе этого массива – объект класса DoubleVector. 
//  Далее программа выводит в консоль значения элементов вектора в виде: Вектор: 2.3 5.0 7.3.


public class lab2 {

  static class doubleVector {
    float[] values;

    public doubleVector(float[] values){
      this.values = values;
    }

    public void representVector() {
      System.out.println("Вектор: " + Arrays.toString(this.values));
    }
  }
  public static void main() throws Exception {
    Scanner input = new Scanner(System.in);
    System.out.println("Введите размерность вектора: ");
    int size = input.nextInt();
    float values[] = new float[size];
    System.out.println("Введите элементы: ");
    for (int i = 0; i < size; i++) {
        values[i] = input.nextFloat();
    }
    doubleVector newVecor = new doubleVector(values);
    newVecor.representVector();
  }
}