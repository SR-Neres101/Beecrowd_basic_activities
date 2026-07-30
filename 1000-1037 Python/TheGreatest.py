#Atividade 1013
#Problem 1013

A, B, C = map(int, input().split())

MaiorAB = (A + B + abs(A - B)) // 2
MaiorABC = (C + MaiorAB + abs(C - MaiorAB)) // 2

print(f"{MaiorABC} eh o maior")