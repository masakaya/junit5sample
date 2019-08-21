package utils;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class CalcTest {

  private Calc testee = new Calc();

  @Test
  void add() {
    int actual = testee.add(5, 6);
    assertThat(actual).isEqualTo(11);
  }
}