def printing():
    #first line is optional so we can use it for commenting regarding this function
    print("Printing method before return")
    return
    print("Printing method after return")

#function not taking any argument and same time not returning any value
def sum():
    a=10
    b=20
    #c=a+b
    print(int(a)+int(b))

#function taking arguments and same time not returning any value
def sum1(a,b):
    print(a+b)
#function taking arguments and same time returning values
def sum2(a,b):
    return a+b
#function not taking arguments and same time returning values
def display():
    return "Sameer Yalla"

printing();
sum();
sum1(1,2)
print(sum2(10,20))
name=display()
print(name)