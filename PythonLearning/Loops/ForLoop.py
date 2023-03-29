my_list=[3,5,6,8,4]
for iter_var in range(len(my_list)):
    print(my_list[iter_var]);


i=1
for i in range(1,9):
    if(i==7):
        continue
    print(i)


#i=1
multiple=input("Enter the table we need to print:")
for i in range(1,11):
    print(multiple+"*"+str(i)+"="+str(int(multiple)*i))


#loop with final value
for i in range(10):    #this will exclude 10
    print(i); # it will print 0-9 with auto increment

number=input("Enter the number:")
for i in range(int(number)):
    print(i)

#for loop with starting and final range
for i in range(1,10):
    print(i);


#for loop with increment and decrement
for i in range(1,11,2):
    print (i)

# for decrement third argument is mandatory with negative value
for i in range(10,0,-1):
    print(i);




