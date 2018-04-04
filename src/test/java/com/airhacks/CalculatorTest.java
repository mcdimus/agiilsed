package com.airhacks;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void run_ReturnsInput_IfNumericString() {
        // given
        String input = "12345";

        // when
        int result = new Calculator().run(input);

        // then
        assertThat(result).isEqualTo(12345);
    }

    @Test
    public void run_ReturnParsedInteger_IfNegativeNumericString() {
        // given
        String input = "-12345";

        // when
        int result = new Calculator().run(input);

        // then
        assertThat(result).isEqualTo(-12345);
    }

    @Test
    public void run_ReturnsSum_IfSingleSumOperation() {
        // given
        String input = "98+2";

        // when
        int result = new Calculator().run(input);

        // then
        assertThat(result).isEqualTo(100);
    }

    @Test
    public void run_ReturnsSum_IfMultipleSumOperations() {
        // given
        String input = "98+2+88+12";

        // when
        int result = new Calculator().run(input);

        // then
        assertThat(result).isEqualTo(200);
    }

    @Test
    public void run_ReturnsSum_IfSingleSubtraction() {
        // given
        String input = "102-2";

        // when
        int result = new Calculator().run(input);

        // then
        assertThat(result).isEqualTo(100);
    }

    @Test
    public void run_ReturnsSum_IfSingleSubtraction2() {
        // given
        String input = "-102-2-100+50";

        // when
        int result = new Calculator().run(input);

        // then
        assertThat(result).isEqualTo(-154);
    }

}