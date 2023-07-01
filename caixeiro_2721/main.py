def is_possible(j, k, l, roads):
    visited = [False] * j  # Mark all cities as unvisited
    stack = [l-1]  # Start with the initial city
    visited[l-1] = True  # Mark the initial city as visited

    while stack:
        city = stack.pop()
        for road in roads:
            if road[0] == city+1 and not visited[road[1]-1]:
                stack.append(road[1]-1)
                visited[road[1]-1] = True
            elif road[1] == city+1 and not visited[road[0]-1]:
                stack.append(road[0]-1)
                visited[road[0]-1] = True

    return all(visited)  # Check if all cities were visited


# Read the number of test cases
num_cases = int(input())

for _ in range(num_cases):
    # Read the input for each test case
    j, k, l = map(int, input().split())
    roads = []
    for _ in range(k):
        road = tuple(map(int, input().split()))
        roads.append(road)

    # Check if it is possible to visit all cities and return to the initial city
    if is_possible(j, k, l, roads):
        print("EH POSSIVEL")
    else:
        print("NAO EH POSSIVEL")
