# number of path to reach last cell
# traverse to the end with given cost find all possible ways
# travel from last cell and back track to get quick solution


def paths(array, cost, row, col):
    if(cost < 0):
        return 0
    cost = cost - array[row][col]
    if(row == 0 and col == 0):
        return 1 if cost == 0 else 0
    if(row == 0):
        return paths(array, cost, row, col - 1)
    if(col == 0):
        return paths(array, cost, row - 1, col)
    p1 = paths(array, cost, row - 1, col)
    p2 = paths(array, cost, row, col - 1)
    return p1 + p2


array = [[4, 7, 1, 6], [5, 7, 3, 9], [
    3, 2, 1, 2], [7, 1, 6, 3]]
print(paths(array, 25, 3, 3))
