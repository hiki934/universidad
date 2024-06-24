import numpy as np # type: ignore
import matplotlib.pyplot as plt # type: ignore

# Definimos los valores de theta en el intervalo dado
theta = np.linspace(0, np.pi/3, 500)

# Definimos r = a * cos(theta)
a = 1  # Podemos usar cualquier valor de a, aquí a = 1 para simplicidad
r = a * np.cos(theta)

# Convertimos de coordenadas polares a coordenadas cartesianas para el gráfico
x = r * np.cos(theta)
y = r * np.sin(theta)

# Creamos el gráfico
plt.figure(figsize=(8, 8))
plt.plot(x, y, label=r'$r = a \cos \theta$')

# Rellenamos el área bajo la curva
plt.fill_between(x, y, color='lightblue', alpha=0.5)

# Configuramos las etiquetas y el título
plt.xlabel('x')
plt.ylabel('y')
plt.title('Área de la región delimitada por $r = a \cos \theta$')
plt.legend()
plt.grid(True)
plt.axis('equal')
plt.show()
