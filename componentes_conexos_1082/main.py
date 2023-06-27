class Graph:
    def __init__(self, vertices):
        self.adj_list = {v: [] for v in vertices}

    def add_edge(self, u, v):
        self.adj_list[u].append(v)
        self.adj_list[v].append(u)

    def get_connected_components(self):
        visited = {v: False for v in self.adj_list}
        components = []

        for vertex in self.adj_list:
            if not visited[vertex]:
                component = self.bfs(vertex, visited)
                components.append(component)

        return components

    def bfs(self, start, visited):
        component = []
        queue = [start]
        visited[start] = True

        while queue:
            vertex = queue.pop(0)
            component.append(vertex)

            for neighbor in self.adj_list[vertex]:
                if not visited[neighbor]:
                    queue.append(neighbor)
                    visited[neighbor] = True

        return sorted(component)


def solve_test_case(case_num, vertices, edges):
    graph = Graph(vertices)

    for edge in edges:
        u, v = edge
        graph.add_edge(u, v)

    components = graph.get_connected_components()

    print(f"Case #{case_num}:")
    for component in components:
        result = ",".join(component) + ","
        print(result)
    print(f"{len(components)} connected components\n")


num_cases = int(input())

for case in range(1, num_cases + 1):
    v, e = map(int, input().split())
    vertices = [chr(ord('a') + i) for i in range(v)]
    edges = [input().split() for _ in range(e)]

    solve_test_case(case, vertices, edges)
