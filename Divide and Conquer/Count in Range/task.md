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

# Count number of elements in given range 

Given a *sorted* array $a$, and numbers $L$ and $R$, 
count number of elements that satisfy $L \le a_i \le R$.

In [Task.kt](course://Divide and Conquer/Count in Range/src/Task.kt), 
you already have a slow solution.
Make it work faster to pass the tests.

<div class="samples">

| Input                     | Return value |
|---------------------------|--------------|
| $(2, 3, 5, 8, 10)$, 3, 9  | 3            |
| $(2, 3, 5, 8, 10)$, 1, 20 | 5            |
| $(2, 3, 5, 8, 10)$, 6, 7  | 0            |

</div>

<div class="hint">
The elements we are looking for form a segment. If we find the
borders of this segment using binary search, we can find its length.
</div>

<div class="hint">

### Solution

The elements we are looking for form a segment $a[l..r-1]$. If we find the
indices $l$ and $r$, we can calculate the number of elements in the segment
as $r-l$.

Let's find the index $l$: $a[l]$ is the leftmost element that satisfy the
condition $a[l] \ge L$. We can use the function `lowerBound` from the 
previous task to find it in $O(\log n)$ time: `l = lowerBound(a, L)`.

Now let's find the index $r$: $a[r-1]$ is the rightmost element that satisfy the
condition $a[r-1] \le R$, that means that $a[r-1]$ is the leftmost element
that is $a[r] > R$. We can use the same function `lowerBound` to find it 
in $O(\log n)$ time. The easiest way is to see that since the element are integers,
$a[r] > R$ is the same as $a[r] \ge R+1$, so we can make `r = lowerBound(a, R + 1)`.






</div>