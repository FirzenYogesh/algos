# min cost to reach last cell
# traverse to the end with min cost
# travel from last cell and back track to get quick solution
import sys


def minCost(cost, row, col):
    if(row == -1 or col == -1):
        return sys.maxsize
    if(row == 0 and col == 0):
        return cost[row][col]
    m1 = minCost(cost, row - 1, col)
    m2 = minCost(cost, row, col - 1)
    m = min(m1, m2)
    return cost[row][col] + m


cost = [[4, 7, 8, 6, 4], [6, 7, 3, 9, 2], [
    3, 8, 1, 2, 4], [7, 1, 7, 3, 7], [2, 9, 8, 9, 3]]
print(minCost(cost, 4, 4))
