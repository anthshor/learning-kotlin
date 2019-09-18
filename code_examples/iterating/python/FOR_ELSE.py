list1 = [1,2,3,4,5,6]
list2 = [2,4,6]

for x in list1:
  for y in list2:
    if x == y: 
      print(x," in the list")
      break
  else:
    print (x," not in list")
