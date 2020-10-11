#Recursion method
def factorialRecursionMethod(n):
  if n == 0:
    return 1
  else:
    return n*factorialRecursionMethod(n-1)

#For loop method
def factorialForLoopMethod(n):
  if n == 0:
    return 1
  else:
    result = 1
    for i in range(1, n+1):
      result *= i
    return result

print(factorialForLoopMethod(5))
