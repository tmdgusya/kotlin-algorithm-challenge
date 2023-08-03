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

# Generate Derangements

<div class="logo">
    <img src="../../images/derangements_logo.png">
</div>

Given an integer $n$, generate all permutations
(of the set $\lbrace 0, 1, \dotsc, n-1\rbrace$)
without fixed points, that is, all permutations 
$(p_0, \dotsc, p_{n-1})$ such that $p_i \neq i$
for all $0 \le i < n$.

### Input

Given an `Int` $n$ — the length of a permutation ($0 \le n \le 10$).

### Output

Return a `List<Derangement>` that contains the required permutations.
The list should be lexicographically ordered.

### Example


<div class="samples">

| Input | Returns                  |
|-------|--------------------------|
| `2`   | `[[1, 0]]`               |
| `3`   | `[[1, 2, 0], [2, 0, 1]]` |

</div>

<div class="hint">
Let $n=5$. How would you generate all derangements that start with 
$4, 0$?
</div>

<div class="hint">

### Solution

Let $n=5$. What could be the next element in a derangement starting
with $4, 0$? It should be one of the remaining three elements: $1$, 
$2$, or $3$. At the same time, $2$ cannot follow $4, 0$ as this 
would create a fixed point.

This suggests the following recursive algorithm. Given a prefix of
a derangement, extend it by one element and proceed recursively.
This one element should not appear in the prefix and should not
form a fixed point. In order to generate all derangements in the 
lexicographical order, we enumerate the elements in the increasing 
order.

<img src="../../images/derangements.png">
</div>