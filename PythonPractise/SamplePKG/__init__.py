from operator import truediv

print("hello World")
user_name=input("Enter your Name:")
user_age=input("Enter your Age:")
print("My name is "+user_name+"! and my age is "+user_age)
user_name1="Sameer Yalla"
user_age1="38"
print("My name is "+user_name1+"! and my age is "+user_age1)
x=10
y=6
sum_result=x+y
is_equal=(x==y)
is_grt=(x>y)
print(sum_result)
print(is_equal)
print(is_grt)
print(x>y)
print(x+y)
print(x-y)
print(x*y)
print(x/y)
print(x%y)
print(x//y)
print(x**y)
print(x==y)
print(x>y)
print(x<=y)
print(x!=y)
x+= 3
y+= 3
print(x+y)
p=True
q=False
print(p and q)
print(p or q)
print (not q)
user_age3=19
if user_age3>18:
    print("you are major")
else:
    print("you are minor")

total_marks=420
if total_marks>360:
    print("First Class")
elif total_marks>=420:
    print("A")
elif total_marks>500:
    print("A+")
else:
    print("Fail")

fruits=["apple","banana","mango"]
for fruit in fruits:
    print(fruit)

for i in range(1,10):
    print(i+1)

count=0
while count<6:
    print(count)
    count+=1