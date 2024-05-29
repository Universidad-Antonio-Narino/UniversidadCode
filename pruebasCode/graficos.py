import networkx as nx
import matplotlib.pyplot as plt
"""
# Crear un subplot de tamaño adecuado para mostrar todos los gráficos
fig, axes = plt.subplots(6, 3, figsize=(15, 20))
fig.suptitle('Gráficos sin etiquetar con 5 vértices y como máximo 5 aristas', fontsize=16)

# List of all graphs
graphs = [
    # 0 edges
    nx.empty_graph(5),

    # 1 edge
    nx.Graph([(0, 1)]),

    # 2 edges
    nx.Graph([(0, 1), (2, 3)]),
    nx.Graph([(0, 1), (1, 2)]),

    # 3 edges
    nx.Graph([(0, 1), (2, 3), (4, 4)]),  # three disconnected edges
    nx.Graph([(0, 1), (1, 2), (2, 3)]),  # star with 4 vertices
    nx.Graph([(0, 1), (1, 2), (2, 0)]),  # triangle with 2 disconnected vertices
    nx.Graph([(0, 1), (1, 2), (2, 3)]),  # chain of 3 vertices and 2 disconnected vertices

    # 4 edges
    nx.Graph([(0, 1), (1, 2), (2, 3), (3, 4)]),  # chain of 4 vertices
    nx.Graph([(0, 1), (1, 2), (2, 0), (0, 3)]),  # triangle with an additional vertex connected
    nx.Graph([(0, 1), (1, 2), (2, 3), (3, 0)]),  # square with one disconnected vertex
    nx.Graph([(0, 1), (1, 2), (1, 3), (1, 4)]),  # star of 4 vertices and one disconnected

    # 5 edges
    nx.Graph([(0, 1), (1, 2), (2, 3), (3, 4), (4, 0)]),  # pentagon with an additional edge
    nx.complete_graph(5)  # complete graph of 5 vertices
]

# Plot each graph
for i, graph in enumerate(graphs):
    row = i // 3
    col = i % 3
    ax = axes[row, col]
    nx.draw(graph, with_labels=True, node_color='lightblue', ax=ax)
    ax.set_title(f'Graph {i+1}')

# Hide any empty subplots
for j in range(i + 1, len(axes.flatten())):
    fig.delaxes(axes.flatten()[j])

plt.tight_layout()
plt.show()

"""
# Complete Bipartite Graph K_{3,4}
K34 = nx.complete_bipartite_graph(3, 4)
plt.figure(figsize=(8, 8))
nx.draw(K34, with_labels=True, node_color='skyblue', node_size=700, font_size=14, font_color='black', font_weight='bold', edge_color='gray')
plt.title("4-Regular Graph with 7 Vertices: K_{3,4}")
plt.show()

# (7,14)-Cage Graph
G = nx.Graph()
# Add edges manually to form a (7,14)-cage
edges = [(0, 1), (0, 2), (0, 4), (0, 5),
         (1, 2), (1, 3), (1, 6),
         (2, 3), (2, 4),
         (3, 4), (3, 5), (3, 6),
         (4, 5), (4, 6),
         (5, 6)]
G.add_edges_from(edges)
plt.figure(figsize=(8, 8))
nx.draw(G, with_labels=True, node_color='skyblue', node_size=700, font_size=14, font_color='black', font_weight='bold', edge_color='gray')
plt.title("4-Regular Graph with 7 Vertices: (7,14)-Cage")
plt.show()