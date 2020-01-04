#longest subsequence length

def lcs(s1, s2, i, j):
    if(len(s1) == i or len(s2) == j):
        return 0
    c1 = 0
    if(s1[i] == s2[j]):
        c1 = 1 + lcs(s1, s2, i+1, j+1)
    c2 = 0 + lcs(s1, s2, i+1, j)
    c3 = 0 + lcs(s1, s2, i, j+1)
    return max(c1, c2, c3)


s1 = "houdini"
s2 = "hdupti"

print(lcs(s1, s2, 0, 0))
