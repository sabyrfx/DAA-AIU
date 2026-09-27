# First Bad Version

- **LeetCode:** https://leetcode.com/problems/first-bad-version/

## 1. Problem

We have versions from `1` to `n`. Some first version becomes bad, and every version after it is also bad. Our goal is to find and return the first bad version.

## 2. Approach

Create a `for` loop starting from version `1` and check every version until `n`.

For each version, call `isBadVersion(i)`. If it returns `true`, return `i` immediately because this is the first bad version we found.

If no bad version is found, return `-1`.

## 3. Time Complexity

In the worst case, the first bad version can be the last version, so the loop may check all `n` versions.

Therefore:

**Time Complexity: `O(n)`**

## 4. Space Complexity

We only use one extra variable, `i`, and its size does not depend on `n`.

Therefore:

**Space Complexity: `O(1)`**

## 5. Reflection / Improvement

No improvement was applied to this solution.

This solution is simple and easy to understand. A more efficient approach is possible because all versions after the first bad one are also bad, but for now the linear solution is enough for the assignment.
