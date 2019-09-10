
# Insertion Sort

Insertion sort is a sorting algorithm that is similar to bubble sort but instead 
of comparing and swapping at every element, we compare and shift. Insertion sort 
has on average a faster runtime than bubble sort as often times insertion sort can 
exit its inner loop early where bubble sort always goes to the end of the array.

---

## Learning Objectives
- What is insertion sort?
- How to write an insertion sort method?
- How to apply insertion sort?
---

### What is insertion sort?
Insertion sort is a sorting algorithm that starts at the beginning of the array. 
Often described as the same sorting method used when you have a hand of playing cards, 
the algorithm still has a worst case runtime of O(n^2). However as mentioned, this sort is 
often ran in a faster time than bubble sort due to the way the method iterates through the array 
in a more targeted manner.


### When does insertion work the best?
Insertion sort works best on smaller data sets as the algorithm has a rather long runtime
 when compared to heap, merge and quick sorts. However, the code required for insertion sort is 
 much simpler than more advanced sort algorithms. 
 
---
### Algorithm
Start at the first index of the input array. While elements to the left of the current element 
are larger than the current element, shift those elements right 1 and place the current element 
just before the location where the array element is no longer greater than the current. This process 
is repeated for each element in the array. 

### Pseudo Code 
```
Let A = an array of integers

For Eech element in A:
    Let j = index of element - 1
    While j >= 0 AND A[j] > element:
        A[j+1] = A[j]
        j = j - 1
    A[j + 1] = element
```
---

## Resources
Check out these resources for more information regarding insertion sort.

##### Whiteboard Outline
![Link to Whiteboard](https://github.com/kdcouture/Sorts/blob/master/Blogs/Assets/insertionSort.jpg)

##### Video
[Link to video](https://www.youtube.com/watch?v=JU767SDMDvA) - Youtube: Insertion sort in 2 minutes by Michael Sambol

##### Readings
[Insertion sort - wikipedia](https://en.wikipedia.org/wiki/Insertion_sort) - A slightly complex, convoluted and over the top spattering of insertion sort details.  
[Insertion sort - GeeksforGeeks](https://www.geeksforgeeks.org/insertion-sort/) - A more on topic article about insertion sort.  
 
