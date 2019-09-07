package videoExercise;

public class ReverseWord {
    public static void main(String[] args) {
        String name = "kek";
        StringBuilder name2 = new StringBuilder(name);
        StringBuilder name3 = name2.reverse();

        if(name.toString().equals(name3.toString())){
            System.out.println("Answer = "+name3);
        }

    }
}
