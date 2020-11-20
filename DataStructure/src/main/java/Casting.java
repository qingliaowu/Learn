public class Casting {


        public static void main(String[]args) {
            // double to int
            double doubleNum = 19.97;
            System.out.println("The double value: " + doubleNum);
            // Need explicit casting because the double, doubleNum, cannot automatically fit into the int, intNum
            int intNum = (int) doubleNum;
            System.out.println("The int value: " + intNum);

            double doubleNum2 = intNum;
            System.out.println("The double value: " + doubleNum2);


        }
}

