<style>
.samples th, .samples td {
    border: 1px solid black;
    border-collapse: collapse;
    padding: 15px;
    width: 300px;
    /*max-width: 100%;*/
    /*text-align: center;*/
    /*alignment: center;*/
}

.sample th, .sample td {
    border: 1px solid black;
    padding: 15px;
    width: 300px;
    /*max-width: 100%;*/
    /*text-align: center;*/
    /*alignment: center;*/
}

.sample td {
    border-top: none;
    border-bottom: none;
}

.sample table {
    border-collapse: collapse;
    border: 1px solid black;
}

.logo {
    display: flex;
    justify-content: center;
}

.logo img {
    width: 200px;
    align: center;
}

.code span {
    line-height: 22px;
}
</style>

# Minimum Sum Path

You are playing a video game.
There is a line with $n$ points denoted as $0, 1, \ldots, n - 1$.
Your character starts at point $0$.
Each turn, if he is at point $i$, you can make him move either to point
$i + 1$ or to point $i + 2$. The character has low stamina, so he cannot make
moves from $i$ to $i + 2$ twice in a row.

The game ends on reaching the point $n - 1$.
Each point has a number associated with it: $a_0, a_1, \ldots, a_{n - 1}$.

Implement a function for computing the minimum total sum of the numbers 
in the visited points.

```Kotlin
fun minimumSumPath(a: IntArray): Long
```

### Input

You are given an `IntArray` $a$ of length $n$ ($2 \le n \le 10^6$).

Each $|a_i| \le 10^9$.

### Output

Return a `Long` representing the minimum total sum.

<div class="samples">

| Input                  | Return value |
|------------------------|--------------|
| `[3, 1, 3, 4, 2]`      | `9`          |
| `[1, 2, 3, -2, -2, 5]` | `4`          |

</div>

<div class="hint">

# Solution

The character can reach point $i$ either from point $i-1$ or
from point $i-2$ (if he reached it from point $i-3$). This
motivates introducing the following functions. For $0 \le i <n$
and $1 \le d \le 2$, 
$\operatorname{path}(i, d)$
is equal to the minimum sum of a path that ends at point $i$,
with the last move being made from point $i-d$. Then,

$$\operatorname{path}(i, 1)=a_i+\min\lbrace \operatorname{path}(i-1, 1), \operatorname{path}(i-1, 2)\rbrace$$

$$\operatorname{path}(i, 2)=a_i+\operatorname{path}(i-2, 1)$$

Using this recurrence relation and an appropriate base case,
one can compute the value of $\operatorname{path}(i, d)$
for all $i$ and $d$ in time $O(n)$. Then, the final answer
is $\min \lbrace \operatorname{path}(n-1, 1), \operatorname{path}(n-1, 2) \rbrace$.
</div>