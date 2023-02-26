package student;
import java.lang.reflect.Array;
import java.util.*;

public class Add extends Student{

    public Add(int marks[]){
        long sum = add(marks);
        System.out.println("Sum of all marks of the student "+sum);
    }

    public Add(){
        super();
        long sum = add(marks);
        System.out.println("Sum of all marks of the student "+sum);
    }

    public long add(int marks[]){
        long sum=0;
        for(int i=0; i< marks.length; i++){
            sum+=marks[i];
        }
        return sum;
    }

    public long add(List<Integer> marks){
        long sum=0;
        for(int i=0; i< marks.size(); i++){
            int y = marks.get(i);
            sum = sum + y;
        }
        return sum;
    }

}
