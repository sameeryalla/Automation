list1=[32, 12.5,"Sameer Yalla","Test Manager",'A']
#update list using index
list1[0]=35
print ("Empolyee name is "+str(list1[2])+" and his age is "+str(list1[0])+" .His role is "+str(list1[3])+" and grade is "+str(list1[4]))

#get values using index
print(list1[2:])
print(list1[1:2])
print(list1[:3])

#insert another value to list
list1.insert(5,"Kajuluru")
print(list1[5])

#remove the element from list using value
print (list1)
list1.remove("Kajuluru")
print(list1)