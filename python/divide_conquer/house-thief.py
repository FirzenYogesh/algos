# house thief
# cannot steal from adjacent house
# steal maximum


def house(profits, index):
    if(index >= len(profits)):
        return 0
    steal = profits[index] + house(profits, index + 2)
    skip = house(profits, index + 1)
    return max(steal, skip)


profits = [6, 7, 1, 30, 8, 2, 4]

print(house(profits, 0))
