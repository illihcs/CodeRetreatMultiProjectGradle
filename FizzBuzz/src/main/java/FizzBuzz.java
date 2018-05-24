public class FizzBuzz {

    public String[] fizzbuzz() {
        System.out.println("hallo");
        String[] zahlen = new String[100];

        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                zahlen[i] = "Fizz";
            } else {
                if (i % 5 == 0) {
                    zahlen[i] += "Buzz";
                } else {
                    zahlen[i] = i + " ";
                }
            }
        }
        return zahlen;
    }

}
