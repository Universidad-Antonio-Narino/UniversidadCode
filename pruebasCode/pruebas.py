import networkx as nx
import matplotlib.pyplot as plt

# Creamos un grafo bipartito
B = nx.Graph()

# Añadimos los nodos con el atributo bipartito
# Nodos del conjunto U
U = ['U1', 'U2', 'U3', 'U4']
# Nodos del conjunto V
V = ['V1', 'V2', 'V3', 'V4', 'V5']

# Agregamos los nodos al grafo
B.add_nodes_from(U, bipartite=0)
B.add_nodes_from(V, bipartite=1)

# Conectamos los nodos de U con los nodos de V según la secuencia de grados
edges = [
    ('U1', 'V1'), ('U1', 'V2'), ('U1', 'V4'), ('U1', 'V5'),
    ('U2', 'V1'), ('U2', 'V3'), ('U2', 'V4'),
    ('U3', 'V1'), ('U3', 'V2'), ('U3', 'V5'),
    ('U4', 'V2'), ('U4', 'V3'), ('U4', 'V4')
]

B.add_edges_from(edges)

# Dibuja el grafo bipartito
pos = {}
pos.update((node, (1, index)) for index, node in enumerate(U))  # los nodos de U en la parte izquierda
pos.update((node, (2, index)) for index, node in enumerate(V))  # los nodos de V en la parte derecha

nx.draw(B, pos, with_labels=True, node_color=['skyblue']*len(U) + ['lightgreen']*len(V), node_size=500, font_size=12)
plt.show()
