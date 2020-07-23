package junit5.tdd;

public class FizzBuzz {
    public String play(int i) {
        if(i % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(i);
    }
}
