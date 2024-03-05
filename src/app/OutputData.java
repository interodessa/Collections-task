package app;
import java.util.List;
public class OutputData {
    public void Outputter (List <User> list){
        int index = 1;
        for(User user:list){
            System.out.println(index + ") " + user);
            index++;
        }
    }
    public void Outputter (int index, List <User> list){
        System.out.println("User number " + index + " is: " + list.get(index - 1));
    }
}
