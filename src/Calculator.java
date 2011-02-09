
public class Calculator {


    public static int add(String numbersToAdd) {

        if ("".equals(numbersToAdd)) return 0;

        String[] numbers = createArrayOfIndividualNumbers(numbersToAdd);

        int sum = addNumbers(numbers);

        return sum;
    }

    private static String[] createArrayOfIndividualNumbers(String numbersToAdd) {
        String delimiterRegex = ",|\n";
        if (numbersToAdd.startsWith("//")) {
            delimiterRegex = delimiterRegex + "|" + numbersToAdd.substring(2,3);
            numbersToAdd = numbersToAdd.substring(3);
        }

        return numbersToAdd.split(delimiterRegex);
    }

    private static int addNumbers(String[] numbers) {
        int sum = 0;
        for (String number : numbers) {
            sum += Integer.parseInt(number);
        }
        return sum;
    }
}
