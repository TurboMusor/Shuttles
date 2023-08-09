
 public class LuckyShuttles {
        public static void main(String[] args) {
            int count = 0;
            int number = 1;

            System.out.println("Номери космічних шатлів без нещасливих чисел:");
            while (count < 100) {
                if (!isUnluckyNumber(number)) {
                    System.out.print(number + " ");
                    count++;
                }
                number++;
            }
            System.out.println("\nЗагальна кількість шатлів: " + count);
        }

        public static boolean isUnluckyNumber(int num) {
            if (num % 10 == 4 || num % 10 == 9) {
                return true;
            }

            int tensDigit = (num / 10) % 10;
            return tensDigit == 4 || tensDigit == 9;
        }
    }




