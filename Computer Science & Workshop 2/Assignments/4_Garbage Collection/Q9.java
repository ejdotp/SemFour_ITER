/* How do you define generational garbage collection? Also discuss how generational
garbage collection works along with proper heap map. */
public class Q9 {
    /*
      Generational garbage collection (GC) is a memory management technique that
      separates objects into generations based on when they were allocated, and
      then has different GC policies for each generation.
     */

    /* Generational GC works on the principle that most objects die young. It
    divides the heap into two or more regions, called generations, and
    allocates new objects in the youngest generation. When the young
    generation fills up, a minor collection is triggered. Minor collections
    are usually fast because most objects in the young generation are garbage
    and can be reclaimed quickly. */

    /* The heap is divided into two regions: the young generation and the old
    generation. The young generation is further divided into the Eden space
    and two survivor spaces. When the young generation fills up, a minor
    collection is triggered. Objects that survive the minor collection are
    promoted to the old generation. When the old generation fills up, a major
    collection is triggered. Major collections are usually slower because
    they involve all live objects in the heap. */

    /* Heap Map:
    ------------------------------------
    |           Old Generation          |
    ------------------------------------
    |           Survivor Space          |
    ------------------------------------
    |           Survivor Space          |
    ------------------------------------
    |           Eden Space              |
    ------------------------------------
    */
}
// By :- Subhajyoti Prusty
// 2241016491
// CSE-44