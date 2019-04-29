import java.util.*;

public class bubble_sort {

    public static void main(String[] args)
    {
        ArrayList<Integer> a = new ArrayList<>();

        a.add(3);
        a.add(7);
        a.add(1);
        a.add(4);
        a.add(10);
        a.add(9);
        a.add(2);
        a.add(20);

        System.out.println(a);

        a = bubble(a);

        System.out.println(a);

    }

    public static ArrayList<Integer> bubble(ArrayList<Integer> input_arr)
    {
        int temp;
        for(int i=input_arr.size()-1; i>0; i--)
        {
            for(int j=0; j<i; j++)
            {
                if((int)input_arr.get(j) > (int)input_arr.get(j+1))
                {
                    temp = input_arr.get(j);
                    input_arr.set(j, input_arr.get(j+1));
                    input_arr.set(j+1, temp);
                }
            }
        }
        return input_arr;
    }

}