package assignment6;
public class Assignment6 
{
    public static void main(String[] args) 
    {
        String arr[] = {"this", "that", "d", "b", "a", "alex", "toast"};
        display(arr);
        insertionSort(arr);
        display(arr);
    }
    
    public static void selectionSort(String arr[])
    {
        
    }
    
    public static void insertionSort(String arr[])
    {
        String temp;
        for (int i = 1; i < arr.length; i++)
        {
            while(i > 0 && arr[i].compareTo(arr[i-1]) < 0)
            {
                temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
                i--;
            }
            
        }
    }
    
    public static void display(String[] arr)
    {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + ", ");
        System.out.println("\n");
    }
}
