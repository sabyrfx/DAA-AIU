# Remove Linked List Elements

[LeetCode #203](https://leetcode.com/problems/remove-linked-list-elements/) | [Solution.java](./Solution.java)

## Problem

Remove all nodes with the given value from a linked list.

## Approach

First, I move `head` forward while the first node contains `val`. This also handles an empty list or a list where every node must be removed.

Then I use `current` to check the following node. If `current.next.val == val`, I skip that node using `current.next = current.next.next`. Otherwise, I move `current` forward.

I only advance `current` when I don't remove a node, so consecutive matching nodes are not skipped.

## Example

Input: `1 -> 6 -> 6 -> 3`, `val = 6`

Result: `1 -> 3`

## Challenges

- At first, I only handled matching nodes at the beginning of the list.
- I initially checked `current.val` instead of `current.next.val`.
- I moved `current` after every iteration, which could miss consecutive matching nodes. I fixed that with an `else` branch.

## Time Complexity

**O(n)**. The first loop skips matching nodes at the beginning, and the second loop processes the remaining nodes. Each node is visited or skipped once.

## Status

Solution completed after guided practice. The earlier version passed LeetCode's three sample test cases; the final corrected version has not been confirmed as accepted on LeetCode yet.
