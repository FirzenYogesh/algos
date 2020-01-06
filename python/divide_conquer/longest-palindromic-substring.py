# longest palindromic substring
# start == end -> 1
# start > end -> 0
# s[start] == s[end] 2 + lps(start + 1, end - 1) only if inbetween are palindrome
# lps(start + 1, end)
# lps(start, end + 1)
# max value


def lps(s, start, end):
    if(start > end):
        return 0
    if(start == end):
        return 1
    c1 = 0
    if(s[start] == s[end]):
        rem = end - start - 1
        if(rem == lps(s, start + 1, end - 1)):
            c1 = 2 + lps(s, start + 1, end - 1)
    c2 = lps(s, start + 1, end)
    c3 = lps(s, start, end - 1)
    return max(c1, c2, c3)


s = "ABCCBBUA"
print(lps(s, 0, len(s) - 1))
