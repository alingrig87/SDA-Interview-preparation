# Power of Two

Given an integer `n`, return `true` if it is a power of two. Otherwise, return `false`.

An integer `n` is a power of two, if there exists an integer `x` such that `n == 2^x`.

---

## Examples

### Example 1

**Input:**

```
n = 1
```

**Output:**

```
true
```

**Explanation:**  
`2^0 = 1`

---

### Example 2

**Input:**

```
n = 16
```

**Output:**

```
true
```

**Explanation:**  
`2^4 = 16`

---

### Example 3

**Input:**

```
n = 18
```

**Output:**

```
false
```

**Explanation:**  
There is no integer `k` such that `2^k = 18`

---

## Constraints

- `-2^31 <= n <= 2^31 - 1`

---

## Follow-up

Could you solve it in **O(1)** time using **bitwise operations**?

---
