# while loop with increment
i=1
num=input("Enetr the table number:")
while i<=10:
    print(num+"*"+str(i)+"="+str(int(num)*i))
    i+=1  #i=i+1

#While loop decrement
i=10
num=input("Enetr the table number:")
while i>=1:
    print(num+"*"+str(i)+"="+str(int(num)*i))
    i-=1  #i=i-1