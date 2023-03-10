<p align="center">
    <a href="https://kotlinlang.org" target="_blank">
        <img src="https://user-images.githubusercontent.com/3258293/213479337-b6d02953-dc71-4e72-ab69-f7f926f786e4.png" width="600" alt="Kotlin Logo">
    </a>
</p>

# Sorting Algorithm in Kotlin (JVM) - Console Application

> In computer science, a sorting algorithm is an algorithm that puts elements of a list into an order. 
> The most frequently used orders are numerical order and lexicographical order, and either ascending or descending.
>
> -- [Sorting algorithm](https://en.wikipedia.org/wiki/Sorting_algorithm)

## Terminologies

### Internal/External Sorting

Internal sorting means that all the data that is to be sorted is stored in memory while sorting is in progress.

External sorting means that the data is stored outside memory (like on disk) and only loaded into memory in small 
chunks. External sorting is usually applied in cases when data can’t fit into memory entirely, effectively allowing 
to sort data that does not fit in the memory.

### Stability of Sort

A sorting algorithm is said to be stable if two objects with equal keys appear in the same order in the sorted output 
as they appear in the unsorted input.

A sorting algorithm is said to be unstable if there are two or more objects with equal keys which don’t appear in 
same order before and after sorting.

## Quick Sort Algorithm

![Sorting_quicksort_anim.gif](docs/imgs/Sorting_quicksort_anim.gif)

Quick Sort is an efficient divide-and-conquer algorithm. It divides a large list into two smaller sub-lists based 
on a pivot chosen, into smaller and larger elements. Quick Sort then recursively does this to the sub-lists finally 
producing a sorted list.

See more: [Quicksort - Wikipedia](https://en.wikipedia.org/wiki/Quicksort)

## Insertion Sort Algorithm

![Insertion_sort_animation.gif](docs/imgs/Insertion_sort_animation.gif)
![Insertion_sort.gif](docs/imgs/Insertion_sort.gif)

![Insertion-sort-example.gif](docs/imgs/Insertion-sort-example.gif)

In insertion sort, every iteration moves an element from unsorted portion to sorted portion until all the elements 
are sorted in the list. An analogy of insertion sort is the sorting of a deck of cards with our hands. 
We select one card from the unsorted deck and put it in the right order in our hands, 
effectively sorting the whole deck.

See more: [Insertion sort - Wikipedia](https://en.wikipedia.org/wiki/Insertion_sort)

## Selection Sort Algorithm

![Selection_sort_animation.gif](docs/imgs/Selection_sort_animation.gif)
![Selection-Sort-Animation.gif](docs/imgs/Selection-Sort-Animation.gif)

Selection sort is generally used for sorting files with very large records and small keys. 
It selects the smallest (or largest) element in the array and then removes it to place in a new list. 
Doing this multiple times would yield the sorted array.

See more: [Selection sort - Wikipedia](https://pt.wikipedia.org/wiki/Selection_sort)

## Bubble Sort Algorithm

![Bubble_sort_animation.gif](docs/imgs/Bubble_sort_animation.gif)

![Bubble-sort.gif](docs/imgs/Bubble-sort.gif)

Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are 
in wrong order. The pass through the list is repeated until the list is sorted.

See more: [Bubble sort - Wikipedia](https://pt.wikipedia.org/wiki/Bubble_sort)

## Merge Sort Algorithm

![Merge_sort_animation2.gif](docs/imgs/Merge_sort_animation2.gif)

![Merge-sort-example-300px.gif](docs/imgs/Merge-sort-example-300px.gif)

Merge sort is a very efficient comparison-based sorting algorithm. It is a divide-and-conquer algorithm, 
which works by repeatedly dividing the array in small parts and merging them again in the sorted order.

See more: [Merge sort - Wikipedia](https://pt.wikipedia.org/wiki/Merge_sort)
