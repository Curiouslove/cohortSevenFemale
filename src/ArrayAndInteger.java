import javax.swing.*;
import java.util.ArrayList;

public class ArrayAndInteger {
    public static void main(String[] args) {
        int number = 3;
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);

       ArrayList<Integer> result = ArrayAndInteger.arrayAndIntegerMethod(3,integers);

       String newResult = String.valueOf(result);
        JOptionPane.showMessageDialog(null, newResult);
        //ArrayList<Integer> newResult = result;

    }
    public static ArrayList<Integer> arrayAndIntegerMethod(int number, ArrayList<Integer> numbers) {
        ArrayList<Integer> result = new ArrayList<>();
        int index = 0;
        int value = numbers.get(index) + numbers.get(index+1);
        if (number == value) {
            result.add(index);
            result.add(index + 1);
        }
        return result;
    }
}
