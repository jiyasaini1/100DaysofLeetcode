import java.util.*;

public class hashmapcode {
    static class hashmap<K,V> {
        public class node{
            K key;
            V value;

            public node(K key, V value){
                this.key = key;
                this.value = value;

            }

            private int size;
            private LinkedList<node> buckets[];

            @SuppressWarnings("unchecked") 
            public hashmap(){
                this.size = 0;
                this.buckets = new LinkedList [4];
                for(int i=0; i<4; i++){
                    this.buckets[i] = new LinkedList<>();
                }
            }

                public void put(K key, V value) {

                }
                public boolean containsKey( K key){
                    return false;
                }
                public remove(K key) {

                }
            }

        }
    
    public static void main(String args[]){

    }
}
