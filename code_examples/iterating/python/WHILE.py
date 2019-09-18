spam = 0
while spam < 5:
    print('Hello, world.')
    spam = spam + 1

while True:
  print('Who are you?')
  name = input()
  if name != 'Joe':       
    continue              
  print('Hello, Joe. What is the password? (It is a fish.)') 
  password = input()      
  if password == 'swordfish':
    break                 
print('Access granted.')  

name = ''
while not name: #(1)
    print('Enter your name:')
    name = input()
