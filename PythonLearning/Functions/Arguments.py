#Required Arguments
def takeInput1(a,b):
    c=a+b
    return c


print(takeInput1(20,330))

#Keyword Arguments
def takeInput2(a,b):
    c=a+b
    return c

print(takeInput2(b=70,a=330))

def takeInput3(a,b):
    c=str(a)+str(b)
    return c

print(takeInput3(b="Yalla",a="Sameer "))

#default arguments:
def takeInput4(a,b=" Yalla"): #default argument always at the end
    c=str(a)+str(b)
    return c

print(takeInput4("Sameer"))