//Write java code to implement Interval Partitioning using Greedy approach.

import java.util.*;

class Interval
{
    int start;
    int end;

    public Interval(int start, int end)
    {
        this.start = start;
        this.end = end;
    }
}

class IntervalPartitioning
{
    public static List<List<Interval>> intervalPartitioning(List<Interval> intervals)
    {
        // Sort intervals based on their end times
        intervals.sort(Comparator.comparingInt(i -> i.start));

        List<List<Interval>> resources = new ArrayList<>();
        resources.add(new ArrayList<>());

        // Iterate through sorted intervals
        for (Interval interval : intervals)
        {
            boolean scheduled = false;
            // Check existing resources for non-overlapping schedule
            for (List<Interval> resource : resources)
            {
                if (resource.isEmpty() || resource.get(resource.size() - 1).start <= interval.start)
                {
                    resource.add(interval);
                    scheduled = true;
                    break;
                }
            }
            // If no non-overlapping schedule found, allocate new resource
            if (!scheduled)
            {
                List<Interval> newResource = new ArrayList<>();
                newResource.add(interval);
                resources.add(newResource);
            }
        }

        return resources;
    }

    public static void main(String[] args)
    {
        List<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1, 3));
        intervals.add(new Interval(2, 4));
        intervals.add(new Interval(3, 6));
        intervals.add(new Interval(5, 7));
        intervals.add(new Interval(8, 10));
        intervals.add(new Interval(9, 11));

        List<List<Interval>> partitionedResources = intervalPartitioning(intervals);

        // Print partitioned resources
        for (int i = 0; i < partitionedResources.size(); i++)
        {
            System.out.print("Resource " + (i + 1) + ": ");
            for (Interval interval : partitionedResources.get(i)) {
                System.out.print("(" + interval.start + "," + interval.start + ") ");
            }
            System.out.println();
        }
    }
}

/*
Resource 1: (1,1) (2,2) (3,3) (5,5) (8,8) (9,9) 
 */
