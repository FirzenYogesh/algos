# zero one knapsack
# take items which is the same as capacity to maximize the profit
# cannot be fractioned


def knapsack(profits, weights, capacity, index):
    if(index >= len(profits) or capacity <= 0 or index < 0):
        return 0
    profit1 = 0
    if(weights[index] <= capacity):
        profit1 = profits[index] + \
            knapsack(profits, weights, capacity - weights[index], index + 1)
    profit2 = knapsack(profits, weights, capacity, index + 1)
    return max(profit1, profit2)


profits = [31, 26, 72, 17]
weights = [3, 1, 5, 2]
capacity = 7
print(knapsack(profits, weights, capacity, 0))
