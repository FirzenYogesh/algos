# given n
# find ways to get in from 1, 3, 4


def ways(n):
    if(n <= 2 and n >= 0):
        return 1
    if(n == 3):
        return 2
    n1 = ways(n - 1)
    n2 = ways(n - 3)
    n3 = ways(n - 4)
    return n1 + n2 + n3

