import java.util.Arrays;

public class Arrayz {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // Arrays declaration
        int[] marks=new int[3];
        marks[0]=97;
        marks[1]=98;
        marks[2]=95;
        int[] age={1,2,3}; 
        System.out.println(marks[1]);

        // length
        System.out.println(marks.length);

        // sort
        Arrays.sort(marks);
        System.out.println(marks[1]);
    }
}
