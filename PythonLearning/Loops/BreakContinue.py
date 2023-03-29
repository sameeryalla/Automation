for i in range(1,11):
    if(i==5):
        break;
    print(i)
#break to stop the loop
num=input("Enter the number:")
for i in range(1,11):
    m=int(num)*i
    if(m==60):
        break;
    print(m)
else:
    print("loop1 ended")

# continue to skip the current loop
for i in range(1,11):
    n=int(num)*i
    if(n==60):
        continue; # due to this 60 value won't be printed
    print(n)
else:
    print("loop2 ended")