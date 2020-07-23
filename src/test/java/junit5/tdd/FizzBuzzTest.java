package junit5.tdd;

import javafx.scene.media.AudioClip;
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
    void should_return_1_when_play_fizz_buzz_given_1() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 1;

        //when
        String actual = fizzBuzz.play(number);

        //then
        assertThat(actual, is("1"));
    }

    @Test
    void should_return_fizz_when_play_fizz_buzz_given_3() {
        //given
        int number = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String actual = fizzBuzz.play(number);

        //then
        assertThat(actual, is("Fizz"));
    }

    @Test
    void should_return_buzz_when_play_fizz_buzz_given_5() {
        //given
        int number = 5;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String actual = fizzBuzz.play(number);

        //then
        assertThat(actual, is("Buzz"));
    }

    @Test
    void should_return_whizz_when_play_fizz_buzz_given_7() {
        //given
        int number = 7;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String actual = fizzBuzz.play(number);

        //then
        assertThat(actual, is("Whizz"));
    }

    @Test
    void should_return_fizz_buzz_when_play_fizz_buzz_given_15() {
        //given
        int number = 15;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String actual = fizzBuzz.play(number);

        //then
        assertThat(actual, is("FizzBuzz"));
    }

    @Test
    void should_return_fizz_whizz_when_play_fizz_buzz_given_21() {
        //given
        int number = 21;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String actual = fizzBuzz.play(number);

        //then
        assertThat(actual, is("FizzWhizz"));
    }
}
