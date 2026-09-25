# Binary Search

## Task Description

- **LeetCode:** https://leetcode.com/problems/binary-search/
- **Difficulty:** Easy
- **Problem:**  
  Given a sorted array of integers and a target value, return the index of the target if it exists. Otherwise, return `-1`.

## Goal

- Understand how binary search reduces the search space by half.
- Practice working with `left`, `right`, and `mid` pointers.
- Analyze time and space complexity.

## Approaches

### Approach 1 — Binary Search

**Idea:**  
Repeatedly compare the target with the middle element and discard the half where the target cannot exist.

**Steps:**
1. Set `left = 0` and `right = nums.length - 1`.
2. Calculate the middle index.
3. If `nums[mid] == target`, return `mid`.
4. If `nums[mid] < target`, search the right half.
5. Otherwise, search the left half.
6. If the search range becomes empty, return `-1`.

**Time Complexity:** `O(log n)`  
**Space Complexity:** `O(1)`

## Final Solution

_To be added after solving the task._

## What I Learned

_To be completed after solving the task._
