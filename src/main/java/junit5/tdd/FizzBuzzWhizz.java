package junit5.tdd;

public class FizzBuzzWhizz {
    public String play(int i) {
        String result = "";
        if(i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
            if(i % 3 == 0) {
                result += "Fizz";
            }
            if(i % 5 == 0) {
                result += "Buzz";
            }
            if(i % 7 == 0) {
                result += "Whizz";
            }
        } else {
            result = String.valueOf(i);
        }
        return result;
    }
}
