package edu.cnm.deepdive;

import java.util.Arrays;

public class CommandLineArgs {

  public static void main(String[] args) {
    for (int i = 0; i < args.length; i++) {
      System.out.println(args[i].toUpperCase());
    }
    System.out.println(Arrays.toString(args));
  }

}
