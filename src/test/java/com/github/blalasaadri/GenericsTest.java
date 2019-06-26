package com.github.blalasaadri;

import static org.assertj.core.api.Assertions.assertThat;
import static com.github.blalasaadri.Generics.getMax;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class GenericsTest {

  @Nested
  @DisplayName("For integers")
  class ForIntegers {
    @DisplayName("when it comes first, getMax returns the larger of the two")
    @Test
    void whenItComesFirst_getMax_returnsTheLargerOfTwoIntegers() {
      var smaller = 3;
      var larger = 9000;

      var max = getMax(larger, smaller);

      assertThat(max).isEqualTo(larger);
    }

    @DisplayName("when it comes second, getMax returns the larger of the two")
    @Test
    void whenItComesSecond_getMax_returnsTheLargerOfTwoIntegers() {
      var smaller = 3;
      var larger = 9000;

      var max = getMax(smaller, larger);

      assertThat(max).isEqualTo(larger);
    }
  }

  @Nested
  @DisplayName("For strings")
  class ForStrings {
    @DisplayName("when it comes first, getMax returns the larger of the two")
    @Test
    void whenItComesFirst_getMax_returnsTheLargerOfTwoIntegers() {
      var smaller = "Hello";
      var larger = "World";

      var max = getMax(larger, smaller);

      assertThat(max).isEqualTo(larger);
    }

    @DisplayName("when it comes second, getMax returns the larger of the two")
    @Test
    void whenItComesSecond_getMax_returnsTheLargerOfTwoIntegers() {
      var smaller = "Hello";
      var larger = "World";

      var max = getMax(smaller, larger);

      assertThat(max).isEqualTo(larger);
    }
  }

}