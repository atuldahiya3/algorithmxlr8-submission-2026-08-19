<p align="center"><img src="https://algorithmxlr8.io/logo-mark.png" width="56" alt="AlgorithmXlr8.io logo" /></p>
<h3 align="center">AlgorithmXlr8.io</h3>
<p align="center"><sub>Solved and synced automatically from <a href="https://algorithmxlr8.io">AlgorithmXlr8.io</a></sub></p>

---

# Stones on the Table

**Difficulty:** `Easy`

## Problem

There are n stones in a row. Each stone has one of three colors, R, G, or B. Find the minimum number of stones to remove so that no two neighboring stones have the same color.

Read an integer n, then a string of n characters (each R, G, or B) from standard input. Print one integer, the minimum number of stones to remove.

## Examples

### Example 1

**Input**
```
n = 3, s = RRG
```
**Output**
```
1
```

**Explanation:** The first two stones both R form a matching pair. Removing one of them fixes it.

### Example 2

**Input**
```
n = 4, s = BRBG
```
**Output**
```
0
```

**Explanation:** No two neighboring stones share a color, so nothing needs to be removed.

---

Solved on [AlgorithmXlr8.io](https://algorithmxlr8.io/solve-dsa/cf-266a-stones-on-the-table).