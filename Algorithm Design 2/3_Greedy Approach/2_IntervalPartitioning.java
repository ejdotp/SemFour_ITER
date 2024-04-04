import java.util.*;

class Interval {
    int start;
    int end;
    
    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

class IntervalPartitioning {
    public static int minMeetingRooms(Interval[] intervals) {
        if (intervals == null || intervals.length == 0)
            return 0;
        
        // Sort the intervals based on start time
        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval.start));
        
        // Priority queue to track the end times of intervals in rooms
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        // Add the end time of first interval to heap
        minHeap.offer(intervals[0].end);
        
        // Iterate through remaining intervals
        for (int i = 1; i < intervals.length; i++) {
            // If the current interval can be accommodated in a room, update the end time
            if (intervals[i].start >= minHeap.peek()) {
                minHeap.poll();
            }
            // Add the current interval's end time to heap
            minHeap.offer(intervals[i].end);
        }
        
        // The size of heap represents the minimum number of rooms required
        return minHeap.size();
    }
    
    public static void main(String[] args) {
        Interval[] intervals = {new Interval(0, 30), new Interval(5, 10), new Interval(15, 20)};
        System.out.println("Minimum meeting rooms required: " + minMeetingRooms(intervals));
    }
}

//Minimum meeting rooms required: 2