# Merge Sort

Merge sort is a type of sorting algorithm that follows the concept of divide and conquer.
Merge sort starts by breaking the input array in half until it only has a single element, then 
starts sorting and merging the sub arrays back together.

---

## Learning Objectives
- What is merge sort?
- How to write an merge sort method?
- How to apply merge sort?
---

### What is merge sort?
Merge sort is an effective sort that breaks apart the input array and then 
puts the sub arrays back together while sorting them. This sort works 
very well with recursion but iterative solutions also exist.


### When does merge work the best?
Merge sort works in O(n log n) time with a space complexity of O(n). This points 
to merge sort working well with small to medium data sets, or sets that are large but 
in environment that space is less sensitive.
 
---
### Algorithm


### Pseudo Code 
```
MERGESORT - PSEUDO CODE
Let A = an array of integers
Let m = A.length/2
Let L = A.subarray(0, m)
Let R = A.subarray(m+1, A.length)

MERGESORT(L)
MERGESORT(R)

MERGE(A,L,R)

```

```
MERGE - PSEUDO CODE
Let A, L and R be an array of integers
Let i, j, k = 0

WHILE i < L.length AND j < R.length
    IF L[i] < R[j]
        A[k] = L[i]
        i++
    ELSE IF R[j] < L[i]
        A[k] = R[j]
        j++
    k++
WHILE i < L.length
    A[k] = L[i]
    i++
    k++
WHILE j < R.length
    A[k] = R[j]
    j++
    k++
```
---

## Resources
Check out these resources for more information regarding merge sort.

##### Whiteboard Outline
[Link to Whiteboard](https://github.com/kdcouture/Sorts/blob/master/Blogs/Assets/mergeSortWhiteBoard.jpg)

##### Video
[Link to video](https://www.youtube.com/watch?v=KF2j-9iSf4Q) - Algorithms: Merge Sort by HackerRank  

##### Readings
[Merge sort - wikipedia](https://en.wikipedia.org/wiki/Merge_sort) - A slightly complex, convoluted and over the top spattering of merge sort details.  
[Merge sort - GeeksforGeeks](https://www.geeksforgeeks.org/merge-sort/) - A more on topic article about merge sort.  
