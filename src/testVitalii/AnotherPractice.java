package testVitalii;

public class AnotherPractice {
    public static void main(String[] args) {
        String word = "fdslkjseijlsdfjsfdfsfrghtrjtk";

        // remove duplicates task
        String[] result = word.split("");
        String afterRemove = "";
        for (String s : result) {
            if(!afterRemove.contains(s)){
                afterRemove+= s;
            }

        }
        System.out.println(afterRemove);
    }
}
