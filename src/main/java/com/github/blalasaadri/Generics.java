package com.github.blalasaadri;

class Generics {

  static <T extends Comparable<T>> T getMax(T a, T b) {
    return a.compareTo(b) > 0 ? a : b;
  }

}
