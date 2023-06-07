def can_place_gas_station(adj_list, curr, selected):
    for neighbor in adj_list[curr]:
        if neighbor in selected:
            return False
    return True


def backtrack(adj_list, curr, selected):
    if curr == len(adj_list):
        return len(selected)

    max_stations = 0
    if can_place_gas_station(adj_list, curr, selected):
        selected.append(curr)
        max_stations = backtrack(adj_list, curr+1, selected)
        selected.pop()

    max_stations = max(max_stations, backtrack(adj_list, curr+1, selected))
    return max_stations


def install_gas_stations(cities):
    results = []
    for _ in range(cities):
        j, k = map(int, input().split())
        adj_list = [[] for _ in range(j)]
        for _ in range(k):
            u, v = map(int, input().split())
            adj_list[u-1].append(v-1)
            adj_list[v-1].append(u-1)

        max_stations = backtrack(adj_list, 0, [])
        results.append(max_stations)

    return results


n = int(input())

output = install_gas_stations(n)

for stations in output:
    print(stations)
