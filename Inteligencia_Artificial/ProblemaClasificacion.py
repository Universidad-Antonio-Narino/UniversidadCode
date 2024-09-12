#importar pandas para leer el archivo
import pandas as p
import sklearn as skl
from sklearn.model_selection import train_test_split
from sklearn.svm import SVC

# ruta del excel
ROUTE_FILE = "D:\\user\\Downloads\\classification_dataset.xlsx"

#leemos el archivo
readFile = p.read_excel(ROUTE_FILE,"classification_dataset",engine='openpyxl')


#mostrando columnas del excel
#for i in readFile.values

#trayendo datos del target en excel
X = readFile.values
Y = readFile["target"]

x_train,x_test,y_train,y_test = train_test_split(X,Y,test_size=0.2,random_state=42)

classifier = SVC(kernel="linear",C=0.025)

classifier.fit(x_train,y_train)
print(classifier.score(x_test,y_test))