#take input from user and check number is even or odd
num1=input("Please enter ur number: ");
#num1=int(num1);
if (int(num1)%2==0):
    print(str(num1)+" is Even number")
else:
    print(str(num1) + " is odd number")


#based on percentage give grades to student using if-elseif
marks=input("Enter the marks aquired for Student: ");
if(int(marks)<=100&int(marks)>90):
    print("Student grade is A")
elif(int(marks)<=90&int(marks)>80):
    print("Student grade is B")
elif(int(marks)<=80 and int(marks)>70):
    print("Student grade is C")
elif(int(marks)<=70&int(marks)>60):
    print("Student grade is D")
else:
    print("Student grade is E")

