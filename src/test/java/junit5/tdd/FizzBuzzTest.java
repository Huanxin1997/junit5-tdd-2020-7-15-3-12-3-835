package junit5.tdd;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


class FizzBuzzTest {
    @BeforeAll
    static void initTestEnv() {
    }

    @BeforeEach
    void initEveryMethod() {
    }

    @Test
    void should_return_1_when_play_fizz_buzz_given_1(int number) {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String actual = fizzBuzz.play(1);
        //then
        assertThat(actual, is("1"));
    }

}