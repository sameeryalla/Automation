listA=[35, 12.5,"Sameer Yalla","Test Manager",'A']
listB=[31, 5,"Ramu Yalla","sales Manager",'A',"kajuluru"]

print ("length of ListA is "+str(len(listA))+" length of ListB is "+str(len(listB)))
#compatre lists this will works only on python2
#cmp(listA,listB)

#sorting the list
listC=[2,7,4,9,3,5,8,6,1]
listC.sort()
print(listC)
listD=[2,7,4,9,3,5,8,6,1]
print(sorted(listD))

#concatenating lists
listE=listC+listD
print (listE)