# Merge Sort

Description TODO!!!
---

## Learning Objectives
- What is merge sort?
- How to write an merge sort method?
- How to apply merge sort?
---

### What is merge sort?



### When does merge work the best?

 
---
### Algorithm


### Pseudo Code 
```
MERGESORT PSEUDO CODE
Let A = an array of integers

```

```
MERGE PSEUDO CODE
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
[Link to Whiteboard]()

##### Video
[Link to video]()  

##### Readings
[Merge sort - wikipedia](https://en.wikipedia.org/wiki/Insertion_sort) - A slightly complex, convoluted and over the top spattering of insertion sort details.  
[Merge sort - GeeksforGeeks](https://www.geeksforgeeks.org/insertion-sort/) - A more on topic article about insertion sort.  
