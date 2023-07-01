def dfs(graph, start, visited):
    visited[start] = True
    for neighbor in graph[start]:
        if not visited[neighbor]:
            dfs(graph, neighbor, visited)


def is_possible(num_cities, num_roads, origin, roads):
    graph = [[] for _ in range(num_cities + 1)]
    for road in roads:
        city1, city2 = road
        graph[city1].append(city2)
        graph[city2].append(city1)

    visited = [False] * (num_cities + 1)
    dfs(graph, origin, visited)

    for i in range(1, num_cities + 1):
        if not visited[i]:
            return "NAO EH POSSIVEL"

    return "EH POSSIVEL"


num_test_cases = int(input())

for _ in range(num_test_cases):

    num_cities, num_roads, origin = map(int, input().split())
    roads = []
    for _ in range(num_roads):
        road = tuple(map(int, input().split()))
        roads.append(road)

    result = is_possible(num_cities, num_roads, origin, roads)
    print(result)
