"""import random
arr = list()
arr1 =[i*10 for i in range(10)]
arr2 =[random.randint(1,10) for i in range(10)]
print(arr1)
print(arr2)
arr.extend(arr1)
arr.extend(arr2)
print(arr)
arr.append(3)
arr1.clear()
arr.count(2)
"""
for k in range(0,100):
    formula = int((k**2)+k)
    if formula % 2 == 0:
        print(formula) 
    else:
        print("No es par ",formula)