#this is python module
#here we are writing executable code
print ("Welcome to Python module with name  - PyModule.py")

#Python module-functions
def testingPythonModuleFunction():
    print("This ss python module function")

testingPythonModuleFunction()

def _sum(a,b):
    c=int(a)+int(b)
    print ("sum of given numbers are : "+str(c))

class A:
    def __init__(self,a,b):
        print("this is constructor in class: "+str(int(a)+int(b)))
    def testing(self):
        print("This is my class function")

objA=A(2,3)
objA.testing()
_sum(2,3)

