# convert one string to another with minimum operations


def convert(s1, s2, i, j):
    if(i == len(s1)):
        return len(s2) - j
    if(j == len(s2)):
        return len(s1) - i
    if(s1[i] == s2[j]):
        return convert(s1, s2, i+1, j+1)
    c1 = 1 + convert(s1, s2, i + 1, j + 1)
    c2 = 1 + convert(s1, s2, i + 1, j)
    c3 = 1 + convert(s1, s2, i, j + 1)
    return min(c1, c2, c3)

s1 = "catch"
s2 = "carch"
print(convert(s1, s2, 0, 0))
