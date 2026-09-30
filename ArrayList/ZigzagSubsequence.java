import java.util.*;

class ZigzagSubsequence
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        if(n == 0)
        {
            System.out.println("Maximum Sub-sequence Count : 0");
            return;
        }

        ArrayList<Integer> sequence = new ArrayList<>();

        sequence.add(arr[0]);

        int count = 1;

        // true = next element should be greater
        // false = next element should be smaller
        boolean greater = true;

        for(int i = 1; i < n; i++)
        {
            int last = sequence.get(sequence.size() - 1);

            // First different element
            if(sequence.size() == 1)
            {
                if(arr[i] > last)
                {
                    sequence.add(arr[i]);
                    count++;
                    greater = false;
                }
                else if(arr[i] < last)
                {
                    sequence.add(arr[i]);
                    count++;
                    greater = true;
                }
            }

            // We need a greater element
            else if(greater && arr[i] > last)
            {
                sequence.add(arr[i]);
                count++;
                greater = false;
            }

            // We need a smaller element
            else if(!greater && arr[i] < last)
            {
                sequence.add(arr[i]);
                count++;
                greater = true;
            }
        }

        System.out.println("Maximum Sub-sequence Count : " + count);

        System.out.print("Sub Sequence: ");

        for(int i = 0; i < sequence.size(); i++)
        {
            System.out.print(sequence.get(i) + " ");
        }
    }
}
