def waysTD(dp, n):
    if(n == 0 or n == 1 or n == 2):
        return 1
    elif(n == 3):
        return 2
    elif(dp[n] == 0):
        s1 = waysTD(dp, n-1)
        s2 = waysTD(dp, n-3)
        s3 = waysTD(dp, n-4)
        dp[n] = s1 + s2 + s3
    return dp[n]


def waysBU(n):
    dp = [0] * (n+1)
    dp[0] = dp[1] = dp[2] = 1
    dp[3] = 2
    for i in range(4, n + 1):
        dp[i] = dp[i - 1] + dp[i - 3] + dp[i - 4]
    return dp[n]


n = 6
dp = [0] * (n + 1)
print(waysTD(dp, n))
print(waysBU(n))
