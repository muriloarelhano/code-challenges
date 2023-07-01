def backtrack(graph, visited, path, start, count):

    if count == len(graph) - 1 and start == path[0]:
        return True  # Hamiltonian cycle found
    for neighbor in graph[start]:
        if not visited[neighbor]:
            visited[neighbor] = True
            path.append(neighbor)
            if backtrack(graph, visited, path, neighbor, count+1):
                return True  # Hamiltonian cycle found
            visited[neighbor] = False
            path.pop()
    return False


t = int(input())  # number of test cases
for _ in range(t):
    j, k, l = map(int, input().split())
    graph = [[] for _ in range(j+1)]
    for _ in range(k):
        a, b = map(int, input().split())
        graph[a].append(b)
        graph[b].append(a)
    visited = [False] * (j+1)
    visited[l] = True
    path = [l]
    if backtrack(graph, visited, path, l, 0):
        print("EH POSSIVEL")
    else:
        print("NAO EH POSSIVEL")
