//Write java code to implement Interval Scheduling using Greedy approach.

import java.util.*;

class Job implements Comparable<Job>
{
    public int start;
    public int finish;
    public String name;

    public Job(int s, int f, String n)
    {
        this.start = s;
        this.finish = f;
        this.name = n;
    }

    public int compareTo(Job job)
    {
        return this.finish - job.finish;   //compare jobs by finish time
    }

    public String toString()
    {
        return "[" + name + ": (" + start + ", " + finish + ")]";
    }
}

class IntervalScheduling
{
    public static void findOptimalJobSchedule(Job[] jobs)
    {
        System.out.println("Input Jobs: " + Arrays.toString(jobs));
        Arrays.sort(jobs);  //Sort jobs by finis time

        LinkedList<Job> jobsSelected = new LinkedList<Job>();
        jobsSelected.add(jobs[0]);    //add 1st job
        Job lastJobAdded = jobs[0];

        for(int i = 1; i<jobs.length; i++)
        {
            if(jobs[i].start >= lastJobAdded.finish)
            {
                jobsSelected.add(jobs[i]);
                lastJobAdded = jobs[i];
            }
        }

        System.out.println("\nSelected " + jobsSelected.size() + " Jobs: ");
        for(Job j : jobsSelected)
            System.out.println(j);
    }

    public static void main(String[] args)
    {
        Job[] jobs = {
            new Job(0, 6, "a"),
            new Job(1, 4, "b"),
            new Job(3, 5, "c"),
            new Job(3, 8, "d"),
            new Job(4, 7, "e"),
            new Job(5, 9, "f"),
            new Job(6, 10, "g"),
            new Job(8, 11, "h"),
        };
        IntervalScheduling.findOptimalJobSchedule(jobs);
    }
}

/*output:

Input Jobs: [[a: (0, 6)], [b: (1, 4)], [c: (3, 5)], [d: (3, 8)], [e: (4, 7)], [f: (5, 9)], [g: (6, 10)], [h: (8, 11)]]

Selected 3 Jobs: 
[b: (1, 4)]
[e: (4, 7)]
[h: (8, 11)]

 */