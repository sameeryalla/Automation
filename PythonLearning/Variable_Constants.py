user_age=36
company_name="Standard Chartered"
user_grade='A'
email_id="sameeryalla@gmail.com";
print( "Im working in "+company_name+" and my mail id is "+email_id );
print("my email id is"+email_id);

# mutilple variables in single line
a,b,c=10,"Hello",35.65
print (a)
print (b)
print (c)

#assigning same value to multiple variables
x=y=z="Testing"
print (x)
print (y)
print (z)

# numeric variables
age=30
weight=65.40
print(age+weight);

#String
data="hello world";
user_message="This is my message from python";
print(data);
print(user_message.upper())

#list
li=[30,65.40,"Sameer Yalla","Test Manager"]
li[0]=35
print("List value is "+str(li[2]));
print(li[0:]);
print(li[1:3]);
print(li[:3]);
print(li[:]);


li2=[0,1,2,3,4,5,6]
li2.append(8);
print(len(li2));
li2[7]=12;
#li2.remove[3];
print(li2[4:6]);


#tuple
tu=(35,65.40,"Sameer Yalla","Test Manager")
print(tu)
print(tu[2]);

#Dictionary
di={"k1":"v1","k2":"v2"}
print(di);
for k,v in di.items():print (k,v);

di2={"name":"Sameer Yalla","age":35,"role":"Test Lead","company":"SCBGBS","manager":"Gops"}
di2["role"]="Test manager"
print("Employee "+di2["name"]+" role is "+di2["role"]);
#to remove one element from dictionary
di2.pop("manager");
print(di2);
#set
set1={10,50,30,10,20,40}
print(set1);
set2={10,20,40}
set3=set1|set2
print("Union value are :" +str(set3));
set3=set1&set2
print("intersection values are : "+str(set3))
#constants
SCHOOL_CODE = 1234;
print (SCHOOL_CODE);


