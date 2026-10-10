# Linked List Cycle (LeetCode #141)

[Problem](https://leetcode.com/problems/linked-list-cycle/description/) | [Java solution](./Solution.java)

## Problem

Check whether a linked list contains a cycle.

## Approach

Use two pointers. Slow moves one node each iteration, while fast moves two. If they meet at the same node, there is a cycle. If fast reaches null, there is no cycle.

We compare node references (slow == fast), not their values.

## Example

3 -> 2 -> 0 -> -4, with -4 pointing back to the node containing 2: slow and fast eventually meet, so the answer is true.

## Time Complexity

O(n). The pointers either reach the end or meet after a linear number of steps.


## Review

Went through the slow and fast pointer movements, the null checks, and why matching references detect a cycle.

The code was initially AI-generated for the deadline. We reviewed and explained it together afterward. Independent reimplementation and LeetCode acceptance have not been verified.
