# Binary Search

- **LeetCode:** https://leetcode.com/problems/binary-search/

## 1. Problem

Given an array and a target number. Our goal is to find the target in the array and display its index; otherwise, return `-1`.

## 2. Approach

Create a `for` loop and define `i = 0`. Search while `i` is less than the array length, and increment `i` after every check using `i++`.

If `nums[i]` is equal to our target number, return `i`. If the target is never found, return `-1`.

## 3. Time Complexity

- `i = 0` runs 1 time.
- `i < nums.length` is checked `n + 1` times.
- `i++` runs `n` times.

So the loop work grows linearly with `n`.

`T(n) = 2n + 2` for these loop-control operations, so:

**Time Complexity: `O(n)`**

## 4. Space Complexity

We use only one extra variable, `i`, and its size does not depend on the input size.

**Space Complexity: `O(1)`**

## 5. Reflection / Improvement

No improvements were applied for this solution.

For this assignment, the current solution is acceptable because the main goal is to understand and analyze my own solution.

A more efficient approach exists because the input array is sorted. That can be explored later.
