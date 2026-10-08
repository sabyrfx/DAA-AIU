# Merge Two Sorted Lists (LeetCode #21)

[Problem](https://leetcode.com/problems/merge-two-sorted-lists/description/) | [Java solution](./Solution.java)

> **Review pending:** This is a reference implementation added before the student has worked through this problem independently. Re-implement and explain it step by step later.

## Problem

Given the heads of two sorted linked lists, merge them into one sorted linked list and return its first node.

## Approach

Create a temporary `dummy` node and a `tail` pointer. Compare the first available values in both lists, connect the smaller node to `tail.next`, and advance that list's pointer. Move `tail` forward. Once one list ends, attach the remainder of the other list. Return `dummy.next` (the first real node). The algorithm reuses the existing nodes.

## Example

`1 -> 2 -> 4` and `1 -> 3 -> 4`: select `1, 1, 2, 3, 4, 4` in order. Result: `1 -> 1 -> 2 -> 3 -> 4 -> 4`.

## Time complexity

**O(n + m)**, where `n` and `m` are the lengths of the input lists. Each node is attached at most once.

## Auxiliary space complexity

**O(1)**. The implementation allocates one dummy node and a fixed number of references; it relinks existing nodes.

## Reflection / Review

The linear-time, in-place iterative solution is already asymptotically efficient. During review, explain why `dummy.next` is returned, why `tail` moves, and what happens when one input is empty.
