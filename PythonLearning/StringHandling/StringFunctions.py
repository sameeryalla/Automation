#to find the length of the string
name="sameer"
print(len(name))

#conver the string into upper case
namecap=name.upper()
print(namecap)


#conver the string into lower case
namelow=namecap.lower()
print(namelow)

#captilize the string to make first letter capital
captName=namelow.capitalize()
print(captName)

#remove spaces from string
string="   Sachin Romesh Tendulkar    "
print("length of the given string is : "+str(len(string)))

#rstrip to remove trailing spaces
print("length of the given string after trainling : "+str(len(string.rstrip())))

#lstrip to remove leading spaces
print("length of the given string after leading : "+str(len(string.lstrip())))

#strip to remove leading & trailing spaces
print("length of the given string after leading : "+str(len(string.strip())))


#replace part of the string
string2=string.strip()
print(string2)
print(string2.replace("Romesh","Ramesh"))

#how many a exist in your string
flag=0
for i in string2:
    if(i=='a'):
        flag=flag+1
print("a found in given text "+str(flag)+" times")


print(len(string2))
print(len(string2.replace("a","")))

# find a string in to another string
print(string2.find("Romesh"))

#split the string
list1=string2.split(" ")
print(list1)
for i in list1:
    print(i)

# string comparison

a="Testing"
b="testing"
if(a==b):
    print("compared");
else:
    print("not compared")

if(a.upper()==b.upper()):
    print("compared");
else:
    print("not compared")

#reversing string

nrmStr=input("Enter the string:")
rvrStr=""
l=len(nrmStr)
for i in range(l-1,-1,-1):
    rvrStr=rvrStr+nrmStr[i]
if(nrmStr==rvrStr):
    {
        print("given string is a palindrom")
    }
else:
    {
        print("given string is not a palindrom")
    }

