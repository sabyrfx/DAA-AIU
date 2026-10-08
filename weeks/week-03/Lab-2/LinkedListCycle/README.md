# Linked List Cycle (LeetCode #141)

[Problem](https://leetcode.com/problems/linked-list-cycle/description/) | [Java solution](./Solution.java)

> **Review pending:** This is a reference implementation added before the student has worked through this problem independently. Re-implement and explain it step by step later.

## Problem

Determine whether a singly linked list contains a cycle: following `next` pointers eventually revisits a node instead of reaching `null`.

## Approach

Use two references. `slow` moves one node per iteration and `fast` moves two. If the list contains a cycle, they eventually meet at the same node (`slow == fast`). If `fast` reaches the end, there is no cycle. Compare **node references**, not just node values; two distinct nodes can store equal values.

## Example

For `3 -> 2 -> 0 -> -4` with the last node pointing back to the node containing `2`, the two references eventually meet, so the method returns `true`.

## Time complexity

**O(n)** for `n` nodes. Without a cycle, `fast` reaches the end in linear steps. With a cycle, the pointers meet after at most a linear number of steps.

## Auxiliary space complexity

**O(1)**. Only two additional node references are used.

## Reflection / Review

Floyd's two-pointer method avoids the extra O(n) memory of a visited-node set. During review, trace both pointers and explain why the loop checks `fast != null && fast.next != null`.
