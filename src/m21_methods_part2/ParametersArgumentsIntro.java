package m21_methods_part2;

public class ParametersArgumentsIntro {

    public static void main(String[] args) {

        //either call method like this
        eligibleToVote(25);

        //or call method like this
        int age = 16;
        eligibleToVote(age);

        System.out.println("you total num of a is: " + countAs("appleaaaaaaa"));

    }

    public static void eligibleToVote(int age) { //parameter needed to complete task
        if (age >= 28) {
            System.out.println("You are eligible to vote. ");
        } else {
            System.out.println("Your are not eligible to vote. ");
        }

    }


    public static int countAs(String word) {
        int count = 0;
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

}
