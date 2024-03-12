import java.util.PriorityQueue;

class PiChan {
 public static void main(String[] args) {
    PriorityQueue<Integer>pq=new PriorityQueue<>();
    pq.add(100);
    pq.add(10);
    pq.add(1000);
    pq.add(10000);
    pq.add(100000);
    pq.add(1000000);
    for(int i=0;i<3;i++){
        pq.add(i);
        pq.add(1);
    }
    System.out.println(pq);
    System.out.println(pq.peek());//only retrieves
    System.out.println(pq.poll());//retrieves & remove
    PriorityQueue<String>pq1=new PriorityQueue<>();
    pq1.add("C");
    pq1.add("A");
    pq1.add("B");
    pq1.add("A");
    pq1.add("F");
    System.out.println(pq1);
    System.out.println(pq1.peek());//only retrieves
    System.out.println(pq1.poll());//retrieves & remove
 }  
}
/*
[0, 1, 1, 1, 1, 10, 1000, 10000, 100, 100000, 2, 1000000]
0
0
[A, A, B, C, F]
A
A
 */