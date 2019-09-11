# Quick Sort
Quick sort has a worst case runtime of O(n^2) which doesn't sound quick but its average runtime is often close to O(n log n) simmilar to merge sort. Benifites to this type of sort is that is can be done in place, not requiring more than a few ints be created in memory keeping space complexity O(log n). Quick sort's algorithm makes it seem complex with the whole piviot point but in application it really is just a point choosen arbitarily to sort around.

---

## Learning Objectives
- What is quick sort?
- How to write an quick sort method?
- How to apply quick sort?
---

### What is quick sort?
Quick sort is another sorting algorithm that works on nearly any dataset. Quick sort is, as its name implies, is faster than sorts such as insertion and bubble sorts. With this increase in preformance, the algorithm carries a little more baggage than the insertion and bubble sorts. There are a number of diffrenent ways to implement quick sort and there are even versions that have space complexity of O(1).


### When does quick work the best?
Quick sort works wonderfully on most any dataset size. 

---
### Algorithm


### Pseudo Code 
```
QUICKSORT - PSEUDO CODE
Let A = an array of integers
Let left = the left side index of our array.
Let right = the right side index of our array.
Let position = QUICKSORTPARTITION(A, left, right)

QUICKSORT(A, left, position - 1)
QUICKSORT(A, position + 1, right)
```

```
QUICKSORTPARTITION - PSEUDO CODE
Let A = an array of integers
Let left be the left bound index of the array
Let right be the right bound of index of the array

Let pivot = A[right]
Let low = left -1

FOR i = left to i = right
    if A[i] <= pivot
    low++
    SWAP(A, i, low)
    
SWAP(A, right, low + 1)

RETURN low + 1
```

```
SWAP - PSEUDO CODE
Let IDX1, IDX2 be input integers
Let A = an array of integers (input)

Let temp = A[IDX1]
A[IDX1] = A[IDX2]
A[IDX2] = temp
```
---

## Resources
Check out these resources for more information regarding quick sort.

##### Whiteboard Outline
[Link to Whiteboard]()

##### Video
[Link to video](https://www.youtube.com/watch?v=SLauY6PpjW4) - Algorithms: Quicksort by HackerRank

##### Readings
[Quick sort - wikipedia](https://en.wikipedia.org/wiki/Quicksort) - A slightly complex, convoluted and over the top spattering of quick sort details.  
[Quick sort - GeeksforGeeks](https://www.geeksforgeeks.org/quick-sort/) - A more on topic article about quick sort.  
