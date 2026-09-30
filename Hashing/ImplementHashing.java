import java.lang.*;
import java.util.*;
class ImplementHashing<K,V>
{
	static class Node<K,V>
	{
		K key;
		V value;
		
		Node<K,V> next;
		
		Node(K key , V value)
		{
			this.key=key;
			this.value=value;
		}
	}
	
	private LinkedList<Node<K,V>> buckets[];
	private int N;    //bucket size
	private int n;
	
	@SuppressWarnings("unchecked")
	public ImplementHashing(){
		N = 4;
		n=0;
		
		buckets = new LinkedList[N];
		
		for(int i=0;i<N;i++)
		{
			buckets[i] = new LinkedList<>();
		}
	}
	
	public int size() 
    {
         return n;
    }
	
	private int hashFunction(K key)
	{
		int hc = key.hashCode();
		
		return Math.abs(hc) % N;
	}
	
	private int searchInLL(K key , int bi)
	{
		LinkedList<Node<K,V>>  ll = buckets[bi];
		
		for(int i=0;i<ll.size();i++)
		{
			if(ll.get(i).key.equals(key))
			{
				return i;
			}
		}
		return -1;
	}
	
	@SuppressWarnings("unchecked")
     private void rehash() {
      LinkedList<Node<K,V>> oldBuckets[] = buckets;

       // Double bucket size
       N = N * 2;

       // Create new bucket array
       buckets = new LinkedList[N];

       for(int i=0;i<N;i++) {
          buckets[i] = new LinkedList<>();
       }

       // We'll reinsert all nodes, so reset count
        n = 0;

         // Traverse old buckets
       for(int i=0;i<oldBuckets.length;i++) 
	   {
          LinkedList<Node<K,V>> ll = oldBuckets[i];
          for(Node<K,V> node : ll) 
		  {
            put(node.key,node.value);
          }
        }
    }
	
	public void put(K key, V value)
	{
		int bi= hashFunction(key);
		int di = searchInLL(key,bi);
		
		if(di==-1)
		{
			buckets[bi].add(new Node<>(key,value));
			n++;
		}
		else{
			Node<K,V> node = buckets[bi].get(di);
			node.value = value;
		}
		
		double lambda = (double)n / N;

         if(lambda > 0.75) {
           rehash();
         }
	}
	
	public V get(K key)
	{
		int bi = hashFunction(key);
		int di = searchInLL(key,bi);
		
		if(di==-1){
			return null;
		}
		else{
			Node<K,V> node = buckets[bi].get(di);
			return node.value;
		}	
	}
	
	public boolean containsKey(K key) 
	{
       int bi = hashFunction(key);
       int di = searchInLL(key,bi);

       if(di!=-1){
		   return true;
	   }
	   else{
		   return false;
	   }
    }
	
	public V remove(K key)
	{
       int bi = hashFunction(key);
       int di = searchInLL(key,bi);

       if(di==-1){
          return null;
	   }
	   else{
          Node<K,V> node = buckets[bi].remove(di);
		  n--;
          return node.value;
	   }
	}
	
	public boolean isEmpty() 
	{
       for (int i = 0; i < N; i++) {
          if (!buckets[i].isEmpty()) {
             return false;
           }
        }
        return true;
    }
	
	public ArrayList<K> keySet() 
	{
       ArrayList<K> keys = new ArrayList<>();

       for(int i=0;i<N;i++)
	   {
           LinkedList<Node<K,V>> ll = buckets[i];
           for(Node<K,V> node : ll) 
		   {
            keys.add(node.key);
           }
        }
        return keys;
    }

	public static void main(String args[]) 
	{
       ImplementHashing<Integer, String> map = new ImplementHashing<>();

       map.put(10,"Siddhant");
       map.put(20,"Rahul");
       map.put(30,"Priya");

       System.out.println(map.get(10));
       System.out.println(map.get(20));
       System.out.println(map.containsKey(30));
       System.out.println(map.size());
       System.out.println(map.keySet());
       System.out.println(map.remove(20));
       System.out.println(map.keySet());
       System.out.println(map.size());
       System.out.println(map.isEmpty());
    }
}
		
	