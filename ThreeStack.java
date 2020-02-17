ONE=1
TWO=2
THREE=3

class ThreeStack:
  def __init__(self):
    self.stack=[]
    self.stackPointer1=0
    self.stackPointer2=0
    self.stackPointer3=0
  
  def push(self,stackId,value):
    if (stackId==ONE and self.stackPointer1<10):
      self.stack.insert(self.stackPointer1,value)
      self.stackPointer1+=1   
      self.stackPointer2+=1 
      self.stackPointer3+=1        
    elif (stackId==TWO and self.stackPointer2-self.stackPointer1<10):
      self.stack.insert(self.stackPointer2,value) 
      self.stackPointer2+=1 
      self.stackPointer3+=1
    elif (stackId==THREE and self.stackPointer3-self.stackPointer2<10):
      self.stack.insert(self.stackPointer3,value)  
      self.stackPointer3+=1       

  def stackPop(self,stackId):
    if (stackId==ONE and self.stackPointer1>0):
      self.stack.pop(self.stackPointer1-1)
     
    elif (stackId==TWO and self.stackPointer2-self.stackPointer1>0):
      self.stack.pop(self.stackPointer2-1)
    elif (stackId==THREE and self.stackPointer3-self.stackPointer2>0):
      sself.tack.pop(stackPointer3-1)     

  def printstack(self):
    print(self.stack)

s=ThreeStack()
s.push(1,10)
s.push(2,20)
s.push(3,30)
s.printstack()
