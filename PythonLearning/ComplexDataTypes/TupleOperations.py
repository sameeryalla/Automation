tuple1=("Mr.","Sameer Yalla",35,"Test Manager","@SCBGBS",12.5,35)

#count number of time a value displayed
print(tuple1.count("Sameer Yalla"))
print(tuple1.count(35))
#find index of any value in a tuple:
print(tuple1.index("Sameer Yalla"))
print(tuple1.index(35))

#merge touples
tuple2=(100,200,"Merge data")
tuple3=tuple1+tuple2
print(tuple3)
print(tuple1+tuple2)

#diplay all elements in tuple
for i in tuple1:
    print (i)

for i in range(0,len(tuple1)):
    print (tuple1[i])