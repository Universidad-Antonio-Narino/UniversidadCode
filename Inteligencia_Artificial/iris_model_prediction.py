import sklearn as skl
#importamos los datasets de iris
import sklearn.datasets as dataInfo
#print(skl.__version__) version
from sklearn.model_selection import train_test_split
from sklearn.svm import SVC

dataset = dataInfo.load_iris()

#print(dataset.feature_names)  el nombre de los atributos de cada una de la instancias
#print(dataset.DESCR) la descripción del dataset
#print(dataset.filename) ruta del fichero que contiene el dataset
#print(dataset.data) matriz con los valores de los atributos para cada una de las instancias
#print(dataset.target) valor numérico de la clasificación objetivo
#print(dataset.target_names) nombre de la clase para cada valor numérico

###Fase de entrenamiento###
#Renombramos los valores para que X sean los atributos e Y sean las respuestas del sistema
X = dataset.data
Y = dataset.target

# Realizamos la partición de nuestro dataset en un conjunto de entrenamiento y otro de test (20%)
X_train,X_test,Y_train,Y_test = train_test_split(X,Y,test_size = 0.2,random_state =42)

classifier = SVC(kernel="linear",C = 0.025)

classifier.fit(X_train,Y_train)
print(classifier.score(X_test,Y_test))