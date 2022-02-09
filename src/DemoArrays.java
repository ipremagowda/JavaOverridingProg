public class DemoArrays {
//    Array Program
public static void main(String[] args)
{
    int x[] = {2,8,10,4,6,12,24 };
    int max = x[0];
    int secondmax = x[0];
    int min = x[0];
    int secondmin = x[0];

    System.out.println("The given array is:" );
    for (int i = 0; i < x.length; i++)
    {
        System.out.print(x[i]+" ");
    }
    for (int i = 0; i < x.length; i++)
    {
        if (x[i] > max)
        {
            secondmax = max;
            max = x[i];
        }
        else if (x[i] > secondmax)
        {
            secondmax = x[i];
        }
    }
    for (int i = 0; i < x.length; i++)
    {
        if (x[i] < min)
        {
            secondmin = min;
            min = x[i];
        }
        else if (x[i] < secondmin)
        {
            secondmin = x[i];
        }
    }
    System.out.println("\nSecond maximum number is: " + secondmax);
    System.out.println("\nSecond minimum number is: " + secondmin);
}
}
    

