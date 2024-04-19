//Q7. Create a generic class Pair<K,V> with private variables key and value. The class Pair should define a parameterised constructor and getter and setter methods for these attributes. After addition of objects, the main class should retrieve andprint the pairof key and value.  

import java.util.Objects;

class Pair<K, V>
{
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(key, pair.key) && Objects.equals(value,
                pair.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    public static void main(String[] args) {

        Pair<String, Integer> pair1 = new Pair<>("key1", 1);
        System.out.println("Pair 1: " + pair1);

        pair1.setKey("new key1");
        pair1.setValue(2);
        System.out.println("Pair 1 (updated): " + pair1);

        Pair<Integer, Double> pair2 = new Pair<>(10, 20.5);
        System.out.println("Pair 2: " + pair2);
    }
}
