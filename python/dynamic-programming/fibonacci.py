def fibonacciTopDown(mem, n):
    if(n <= 1):
        return 0
    if(n == 2):
        return 1
    if(mem[n] == 0):
        mem[n] = fibonacciTopDown(mem, n-1) + fibonacciTopDown(mem, n-2)
    return mem[n]


def fibonacciBottomUp(n):
    table = [0] * n
    table[0] = 0
    table[1] = 1
    for i in range(2, n):
        table[i] = table[i - 1] + table[i - 2]
    return table[n-1]


print(fibonacciTopDown([0] * 7, 6))
print(fibonacciBottomUp(6))
