def houseTD(dp, profits, index):
    if(index >= len(profits)):
        return 0
    if(dp[index] == 0):
        steal = profits[index] + houseTD(dp, profits, index + 2)
        skip = houseTD(dp, profits, index + 1)
        dp[index] = max(steal, skip)
    return dp[index]


def houseBU(dp, profits):
    dp[len(profits)] = dp[len(profits) + 1] = 0
    for i in range(len(profits) - 1, -1, -1):
        dp[i] = max((profits[i] + dp[i + 2]), dp[i + 1])
    return dp[0]


profits = [6, 7, 1, 30, 8, 2, 4]

print(houseTD([0] * (len(profits)), profits, 0))
print(houseBU([0] * (len(profits) + 2), profits))
