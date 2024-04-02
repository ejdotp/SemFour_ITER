/* Implement a simplified version of generational garbage collection in Java.
Generational garbage collection divides objects into different generations based on their
age and aims to optimize memory management by applying different collection
strategies to each generation. */
import java.util.ArrayList;
import java.util.List;

public class Q10 {
    static class Object {
        private int id;

        public Object(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }
    }

    static class GenerationalGarbageCollector {
        private List<Object> youngGeneration = new ArrayList<>(), oldGeneration = new ArrayList<>();

        public void allocate(Object obj) {
            youngGeneration.add(obj);
        }

        public void collectGarbage() {
            List<Object> newYoungGeneration = new ArrayList<>(), newOldGeneration = new ArrayList<>();
            for (Object obj : youngGeneration) {
                if (obj.getId() % 2 == 0)
                    newYoungGeneration.add(obj);
                else
                    newOldGeneration.add(obj);
            }
            for (Object obj : oldGeneration) {
                if (obj.getId() % 2 == 0)
                    newOldGeneration.add(obj);
            }
            youngGeneration = newYoungGeneration;
            oldGeneration = newOldGeneration;
        }
    }

    public static void main(String[] args) {
        GenerationalGarbageCollector gc = new GenerationalGarbageCollector();
        for (int i = 0; i < 10; i++) {
            gc.allocate(new Object(i));
            if (i % 2 == 0)
                System.out.println("Using object with id " + i);
        }
        gc.collectGarbage();
        System.out.println("Live objects in young generation:");
        for (Object obj : gc.youngGeneration) {
            System.out.println(obj.getId());
        }
        System.out.println("Live objects in old generation:");
        for (Object obj : gc.oldGeneration) {
            System.out.println(obj.getId());
        }
    }
}
// By :- Subhajyoti Prusty
// 2241016491
// CSE-44