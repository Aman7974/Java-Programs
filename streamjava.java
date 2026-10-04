
// import java.lang.reflect.Array;
import java.util.ArrayList;
// import java.util.Arrays;
import java.util.List;
import java.util.Random;
// import java.util.Collection;
// import java.util.stream.Stream;

public class streamjava {
  public static void main(String a[]) {

    // Stream Introduction
    // List<Integer> nums = Arrays.asList(4,5,6,7,8);

    // Stream<Integer> sortedValues = nums.stream()
    // .filter(n -> n%2==0)
    // .sorted();

    // sortedValues.forEach(n -> System.out.println(n));

    // Stream Example
    // Parallel stream
    int size = 1000;
    List<Integer> nums = new ArrayList<>(size);

    Random ran = new Random();
    for (int i = 0; i <= size; i++) {
      nums.add(ran.nextInt(100));
    }

    // int sum1 = nums.stream()
    // .map(i->i*2)
    // .reduce(0,(c,e) -> c+e);

    long SeqStart = System.currentTimeMillis();

    int sum2 = nums.stream()
        .map(i -> i * 2)
        .mapToInt(i -> i)
        .sum();

    long SeqEnd = System.currentTimeMillis();

    long ParaStart = System.currentTimeMillis();

    int sum3 = nums.parallelStream()
        .map(i -> i * 2)
        .mapToInt(i -> i)
        .sum();

    long ParaEnd = System.currentTimeMillis();

    // System.out.println(sum1);
    System.out.println(sum2);
    System.out.println(sum3);

    System.out.println("Seq Time :" + (SeqEnd - SeqStart));
    System.out.println("Para Time :" + (ParaEnd - ParaStart));

  }
}