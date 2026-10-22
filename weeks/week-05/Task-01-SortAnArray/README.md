# Task 01 — Sort an Array (LeetCode 912)

Problem: https://leetcode.com/problems/sort-an-array/

## 1. Problem

We get an array of integers and need to return its values from smallest to largest. The values might be negative or repeated.

## 2. Approach

I use the basic idea of Merge Sort:

1. If the array has 0 or 1 elements, return it because it is already sorted.
2. Find the middle.
3. Copy the first half into a left array and the rest into a right array.
4. Run the same Merge Sort steps on both halves.
5. Merge the two sorted halves by comparing their current elements.

I used separate arrays for each half because they are easier to follow than tracking several start and end indexes inside one array.

### Written trace

Input: [5, 2, 3, 1]

- Split: [5, 2] and [3, 1]
- Split further: [5], [2], [3], [1]
- Merge [5] and [2]: [2, 5]
- Merge [3] and [1]: [1, 3]
- Merge [2, 5] with [1, 3]:
  - Compare 2 and 1, take 1
  - Compare 2 and 3, take 2
  - Compare 5 and 3, take 3
  - Copy the remaining 5
- Output: [1, 2, 3, 5]

### Challenges and testing

The merge step needs three indexes: one for the left array, one for the right array, and one for the result. A common mistake to look out for is leaving elements behind when one half ends. That is why there are two extra while loops after the main comparison loop.

During preparation, this code was compiled and checked locally with empty, single-element, duplicate, negative, reverse-sorted, random, and 50,000-element inputs. These were automated checks, not claimed personal attempts. Add any actual failed experiments and fixes you encounter yourself before submitting.

## 3. Time and space complexity

**Time: O(n log n).** Every split cuts the problem about in half, giving about log n recursive levels. At each level, all n numbers are merged, so the work is n times log n.

**Space: O(n) extra space at one time.** The code creates extra arrays. The total array memory being held during recursive calls is proportional to n, plus a recursion stack of O(log n). Across the full run, more arrays are allocated, but they are not all stored at once.

## 4. Reflection / improvement

This is not the most memory-efficient implementation because it copies data into new arrays. To save allocations, I could use one shared temporary array and sort sections by indexes. The improved version would still take O(n log n) time and O(n) auxiliary space, but with less copying and allocation overhead.

LeetCode acceptance has not been verified. Before submitting, make sure you understand the recursive stopping condition and all three merge indexes.
