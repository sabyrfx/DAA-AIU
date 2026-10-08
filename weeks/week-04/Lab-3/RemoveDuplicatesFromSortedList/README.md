# Remove Duplicates from Sorted List

[LeetCode problem](https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/?envType=problem-list-v2&envId=linked-list)

**Solution:** [Solution.java](./Solution.java) — iterative, in-place linked-list traversal.

## 1. Problem

Given the head of a **sorted** singly linked list, remove duplicate values so that each value appears exactly once. Return the head of the modified list.

## 2. Approach

1. Set a reference `current` to `head`.
2. While both `current` and `current.next` exist, compare their values.
3. If the values are equal, skip the next node by setting `current.next = current.next.next`. Keep `current` at the same node in case there are more duplicates.
4. Otherwise, advance with `current = current.next`.
5. Return `head`, which still references the start of the list.

This works because the list is sorted: duplicate values are adjacent. The existing nodes are relinked rather than copied.

### Trace / Example

Input: `1 -> 1 -> 1 -> 2 -> 3 -> 3 -> null`

- At the first `1`, the next value is `1`: bypass the second node. Remaining chain: `1 -> 1 -> 2 -> 3 -> 3`.
- Compare the first `1` again: bypass the next `1`. Remaining chain: `1 -> 2 -> 3 -> 3`.
- `1` and `2` differ: move `current` to `2`.
- `2` and `3` differ: move `current` to `3`.
- `3` and `3` match: bypass the duplicate. Result: `1 -> 2 -> 3 -> null`.

For an empty list, the loop does not run and `head` (which is `null`) is returned.

### Challenges / Failed Approaches

- Initially tried to access `current.next` without checking whether `current` was `null`; fixed the loop guard to check both references.
- Initially advanced `current` after removing a duplicate, which can leave consecutive duplicates behind; fixed this by advancing only when adjacent values differ.
- Without an `else` branch, differing values would leave `current` unchanged and cause an infinite loop.
- Moved `return head` outside the loop so all relevant nodes are processed, rather than returning after one iteration.

## 3. Time Complexity

**Time complexity: O(n)** for `n` original nodes.

Each loop iteration performs constant-time comparisons and reference assignments. An iteration either removes one node from the chain or advances to the next node; therefore, there are at most `n - 1` iterations for a nonempty list. The work grows linearly with the number of input nodes.

## 4. Reflection / Improvement

This solution runs in linear time. It already uses a single traversal and relinks existing nodes in place. In the worst case, examining the list requires work proportional to the number of nodes, so no asymptotic time improvement is needed for this approach.

**Status:** Implemented and reasoned through; no LeetCode acceptance or automated test run is claimed here.
