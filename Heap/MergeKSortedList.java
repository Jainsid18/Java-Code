import java.util.*;

class MergeKSortedList
{
    public static class Pair implements Comparable<Pair>
    {
        int listIndex;
        int dataIndex;
        int val;

        public Pair(int listIndex, int dataIndex, int val)
        {
            this.listIndex = listIndex;
            this.dataIndex = dataIndex;
            this.val = val;
        }

        @Override
        public int compareTo(Pair p1)
        {
            return this.val - p1.val;
        }
    }

    public static void main(String args[])
    {
        int lists[][] =
        {
            {1, 11, 14, 20, 28, 39},
            {3, 12, 16, 26, 36},
            {4, 13, 23, 33, 43}
        };

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        // Add first element of every list
        for(int i = 0; i < lists.length; i++)
        {
            if(lists[i].length > 0)
            {
                pq.add(new Pair(i, 0, lists[i][0]));
            }
        }

        ArrayList<Integer> result = new ArrayList<>();

        // Process PriorityQueue
        while(!pq.isEmpty())
        {
            Pair p = pq.remove();

            result.add(p.val);

            int nextIndex = p.dataIndex + 1;

            // Add next element from same list
            if(nextIndex < lists[p.listIndex].length)
            {
                pq.add(
                    new Pair(
                        p.listIndex,
                        nextIndex,
                        lists[p.listIndex][nextIndex]
                    )
                );
            }
        }

        System.out.println(result);
    }
}