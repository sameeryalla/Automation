class A1:
    def welcome(self):
        print("This is class function")
class B1:
    # function with no argument and no return
    def first(self):
        print("This is first method in class, so defined with self as parameter")
    # function with  argument and no return
    def sum(self,a,b):
        c=a+b
        print("Sum of given parameters is "+str(c))
    # function with argument and with return
    def multiply(self,a,b):
        return(a*b)
#create object to access the class variables and methods
obj1=A1()
obj1.welcome();

obj2=B1()
obj2.sum(10,20)
obj2.first()
c=obj2.multiply(2,3)
print(str(c))