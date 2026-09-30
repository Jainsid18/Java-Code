import java.util.*;

class SmallestSubarray
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a size of Array:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements in an Array:");

        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter value of K:");
        int k = sc.nextInt();

        int totalSum = 0;

        for(int i = 0; i < n; i++)
        {
            totalSum += arr[i];
        }

        int remainder = totalSum % k;

        if(remainder == 0)
        {
            System.out.println("Minimum Subarray Length: 0");
            return;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        // prefix remainder 0 at index -1
        map.put(0, -1);

        int prefixSum = 0;
        int minLength = n;

        for(int i = 0; i < n; i++)
        {
            prefixSum = (prefixSum + arr[i]) % k;

            int required = (prefixSum - remainder + k) % k;

            if(map.containsKey(required))
            {
                int length = i - map.get(required);

                minLength = Math.min(minLength, length);
            }

            map.put(prefixSum, i);
        }

        if(minLength == n)
        {
            System.out.println("No valid subarray found");
        }
        else
        {
            System.out.println("Minimum Subarray Length: " + minLength);
        }
    }
}
