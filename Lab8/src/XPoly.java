public class XPoly {
    public static double sum(double[] arr) {
        double total = 0.0;
        for (double num : arr) {
            total += num;
        }
        return total;
    }

    public static double min(double[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        double minimum = arr[0];
        for (double num : arr) {
            if (num < minimum) {
                minimum = num;
            }
        }
        return minimum;
    }

    public static double max(double[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        double maximum = arr[0];
        for (double num : arr) {
            if (num > maximum) {
                maximum = num;
            }
        }
        return maximum;
    }

    public static String toUpperFirstChar(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)));
                if (word.length() > 1) {
                    result.append(word.substring(1).toLowerCase());
                }
                result.append(" ");
            }
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        double[] numbers = {3.5, 2.1, 5.6, 1.2, 4.8};
        System.out.println("Sum: " + sum(numbers));
        System.out.println("Min: " + min(numbers));
        System.out.println("Max: " + max(numbers));

        String input = "nguyen van teo";
        System.out.println("Converted: " + toUpperFirstChar(input));
    }
}
