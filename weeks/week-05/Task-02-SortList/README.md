# Task 02 — Sort List (LeetCode 148)

Problem: https://leetcode.com/problems/sort-list/

## 1. Problem

We get the head of a linked list. We need the node values to be in increasing order and return the head of the sorted list.

## 2. Approach

For this beginner-friendly solution, I avoid splitting and reconnecting linked-list nodes during sorting. Instead:

1. Walk through the list to count its nodes.
2. Create an array with that size.
3. Walk through the list again and copy each node value into the array.
4. Sort the array with the same Merge Sort idea used in Task 01.
5. Walk through the list a third time and replace each node value with the sorted value.
6. Return the original head.

The nodes remain connected in the same order, but their values become sorted. This satisfies the problem, although it uses additional memory.

### Written trace

Input list: 4 -> 2 -> 1 -> 3

- Read into array: [4, 2, 1, 3]
- Split arrays: [4, 2] and [1, 3]
- Split into one-element arrays and merge: [2, 4] and [1, 3]
- Final merge: [1, 2, 3, 4]
- Write back values to the four nodes, in order
- Output list: 1 -> 2 -> 3 -> 4

### Challenges and testing

A linked list cannot be accessed with array indexing. That is why the solution first copies values into a regular array. After sorting, the current pointer must move to the next node after every write, or only one node would be updated.

The code was checked locally during preparation with an empty list, one node, repeated values, negatives, ascending and descending inputs, random lists, and a 50,000-node list. These are preparation checks, not claims of personal LeetCode submissions. Record your own attempts, mistakes, and corrections after working through the algorithm.

## 3. Time and space complexity

**Time: O(n log n).** Counting, copying, and writing back each take O(n). Merge Sort takes O(n log n), which dominates the total.

**Space: O(n).** The values array, temporary left/right arrays, and merged arrays use extra memory proportional to n; the recursive call stack takes O(log n).

## 4. Reflection / improvement

A more memory-efficient approach would split the linked list itself using slow and fast pointers, then merge by reconnecting nodes. This would avoid the main values array and use O(log n) stack space with the recursive approach, while keeping O(n log n) time. For now, copying values to an array is easier to understand and explain.

LeetCode acceptance has not been verified. Before submitting, trace what happens for an empty list and a list containing duplicate values.
