public class Main {
    public static void main(String[] args) {
        double numbers[] ={8.8, 7.5, -7.9, -2.5, -4.7, 6.6, -3.8, 15.1, -1.4, -13.3, -2.8, 8.4, -15.7, -9.0, 12.8};

        double sum = 0;
        int count = 0;
        boolean firstNegative = false;

        for (double number: numbers) {
            if (number < 0) {
                firstNegative = true;
                continue;
            }

            if (firstNegative && number > 0) {
                sum += number;
                count++;
            }
        }

            double average =  sum / count;
            System.out.println(average);
        }
    }
