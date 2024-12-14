my_list = [1,2,3,4,5,6]
my_list.append(8)
my_list.remove(5)
print(my_list)
for i in my_list:
    print(i+1)
my_tuple = (10,20,30,40,50,60)
print(my_tuple)
for i in my_tuple:
    print(i)
grade_dict={"Sameer":70,"swarupa":100,"Ramu":90,"geetha":65}
print(grade_dict)
#updating dictionary
grade_dict["Sameer"]=93
grade_dict["Sanvi"]=78
grade_dict["Enemy"]=60
print(grade_dict)
del grade_dict["Enemy"]
print(grade_dict)

my_set = set()
my_set.add('banana')
my_set.add('apple')
my_set.add('date')
my_set.add('grapes')
my_set.add('unknown')
print(my_set)
my_set.update(['cherry','pomagranate','orange','unknow2'])
print(my_set)
my_set.remove('unknown')
my_set.discard('unknow2')
print(my_set)
#my_set.clear()
if 'apple' in my_set:
    print("apple is available")

def arth_ops(x, y):
    addition = x+y
    subtraction = x-y
    multiplication = x*y
    division = x/y
    return {
        "Addition": addition,
        "Subtraction": subtraction,
        "Multiplication": multiplication,
        "Division": division
    }
result = arth_ops(10,2)
for operation,value in result.items():
    print(f"{operation}: {value}")