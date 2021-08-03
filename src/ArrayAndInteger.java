import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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

    public static int[] twoSums(int[] numbers, int target){
      final  int LENGTH = numbers.length;
        for (int firstIndex = 0; firstIndex < (LENGTH - 1); firstIndex++){
            for(int secondIndex = firstIndex + 1; secondIndex < LENGTH; secondIndex++){
                if (numbers[firstIndex] + numbers[secondIndex] == target){
                    return new int[]{firstIndex, secondIndex};
                }
            }
        }
        return new int[]{};
    }

    public static int[] twoSumsWithMap(int[] numbers, int target){
        Map<Integer, Integer> hashMap = new HashMap<>();
        final int LENGTH = numbers.length;
        for(int index= 0; index < LENGTH; index++){
            int complement = target - numbers[index];
            if(hashMap.containsKey(complement)){
                return new int[]{hashMap.get(complement), index};
            }
            hashMap.put(numbers[index], index);
        }
        return new int[]{};
    }
}
