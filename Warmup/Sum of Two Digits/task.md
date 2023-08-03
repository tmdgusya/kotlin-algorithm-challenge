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

# Sum of Two Digits
<div class="logo">
    <img src="../../images/sum_of_two_digits_logo.png">
</div>

Given two digits $0 \le a \le 9$ and $0 \le b \le 9$,
compute their sum.

### Example

<div class="sample">

| Input         | Returns |
|---------------|---------|
| `9, 7`        | `16`    |

</div>

We start from this ridiculously simple problem to show you the 
pipeline of reading the problem statement, designing an algorithm, 
implementing it, testing and debugging your program, and submitting 
it to the grading system.

<div class="hint">

### Solution

For this trivial problem, we will skip the 
“Designing an algorithm” step and will move right to the pseudocode.

![](../../images/sum_of_two_digits.png)

This is how one can turn this pseudocode into Kotlin implementation.

    fun sumOfTwoDigits(a: Int, b: Int): Int {
        return a + b
    }

Copy-n-paste this solution into the file `Task.kt`
and press the "Check" button in the right pane. 
The automated grading system will check your solution
against several tests to verify that it 
always produces a correct answer and fits into the time 
and memory constraints.

In every programming challenge in this course, your goal is to implement an 
algorithm that produces a correct 
result under one second for any input satisfying 
the given constraints. You do not need to check that the input data satisfies 
the constraints: e.g., for the Sum of Two Digits Problem, you do not need 
to check that the given integers $a$ and $b$ are indeed single digit integers 
(this is guaranteed).
</div>