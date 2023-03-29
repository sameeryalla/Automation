# take one number from user input and check number is +ve/-ve
#input from user
data=input("Please enter number: ");
data=int(data);
if(data<0):
    print("Given number is negetive number");
else:
    if(data%2==0):
        print("Given number is even number");
    else:
        print("Given number is odd number");
