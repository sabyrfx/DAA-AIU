# Merge Two Sorted Lists (LeetCode #21)

[Problem](https://leetcode.com/problems/merge-two-sorted-lists/description/) | [Java solution](./Solution.java)

## Problem

Merge two sorted linked lists into one sorted list and return its first node.

## Approach

Use a dummy node to keep track of the beginning of the result, and a tail pointer to connect nodes. Compare the current values in both lists, attach the smaller node, and move that list's pointer forward. Then move tail forward. Once one list is empty, connect the rest of the other list.

Return dummy.next because the dummy node is not part of the answer.

## Example

Input: 1 -> 2 -> 4 and 1 -> 3 -> 4

Output: 1 -> 1 -> 2 -> 3 -> 4 -> 4

## Time Complexity

O(n + m), where n and m are the lengths of the two lists. Each node is handled once.


## Review

Went through the algorithm and its references step by step: dummy, tail, list1, list2, attaching nodes, and returning dummy.next.

The code was initially AI-generated for the deadline. We reviewed and explained it together afterward. Independent reimplementation and LeetCode acceptance have not been verified.
