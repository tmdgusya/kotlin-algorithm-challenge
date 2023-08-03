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

# Generate Partitions
<div class="logo">
    <img src="../../images/partitions_logo.png">
</div>

Given a positive integer $n$, generate all its representations as 
the sum of positive integers (two representations that differ by the 
order of summands are considered the same: 
$1+3+1$ is the same as $1+1+3$ and $3+1+1$).

### Input

Given an `Int` $n$ — the sum of each partition ($1 \le n \le 60$).

### Output

Return a `List<List<Int>>` that contains all the required partitions.
Each partition is an inner `List<Int>`.
The partitions can be given in any order.
The terms of each partition can be given in any order as well.
The partitions in the list should be distinct.

### Example


<div class="samples">

| Input       | Returns                                                                                                  |
|-------------|----------------------------------------------------------------------------------------------------------|
| `4`         | `[` <br/> `  [1, 1, 1, 1],`<br/> `  [1, 1, 2],`<br/> `  [1, 3],` <br/> `  [2, 2],`<br/>`  [4]` <br/> `]` |

</div>

<div class="hint">
How would you list all partitions of $n=5$ by hand?
</div>

<div class="hint">

### Solution

All partitions of $n=5$ can be split into two sets: those containing 1 as 
a summand and those that do not contain it. In turn, the latter set is split
into partitions containing 2 as a summand and partitions consisting of 
integers greater than two. Continuing in the same fashion, we break all
partitions of $n=5$ into the following five categories:

* $1+\dotsb$
* $2+\dotsb$
* $3+\dotsb$
* $4+\dotsb$
* $5$

To ensure that all of them are different, it is convenient to assume 
that in every partition, the summands appear in the non-decreasing
order: this way, all partitions in, say, the $3+\dotsb$ category do not contain 1's
and 2's.

Now, let us focus on, say, the $2+\dotsb$ category. Clearly, 
everything in "$\dotsb$" should sum up to 3. But not every partition of 3 
fits our goals: all integers in this partition should be at least 2. Thus, 
the $2+\dotsb$ category can be further split into the following two 
subcategories:

* $2+2+\dotsb$
* $2+3$

Finally, the $2+2+\dotsb$ subcategory is in fact empty: it remains to get 
$1$ as a sum, but all summands should be at least 2.

This reasoning leads to the following recursive procedure 
$\operatorname{Generate}(n, L)$, where 
$n$ is the target sum and $L$ is a list of integers sorted in non-decreasing 
order. It returns all sorted partitions of $n$ that "extend" the 
list $L$. For example, for $n=5$ and $L=(1, 1)$, it returns the following
three partitions: $(1,1,1,1,1)$, $(1,1,1,2)$, $(1,1,3)$.

<img src="../../images/partitions.png">

</div>