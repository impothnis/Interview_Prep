package Algo_Expert;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.*;

public class PredicateTest {

  public static void main(String[] args) {

    ArrayList<Integer> Al = new ArrayList<>();

    Al.add(0);
    Al.add(5);
    Al.add(25);
    Al.add(35);
    Al.add(4);
    Al.add(2);
    Al.add(60);

    System.out.println(Al);

    List<Integer> l1 = Al.stream().sorted().collect(Collectors.toList());// System.out.println(l1);

    // System.out.println(l3);

  }

}
