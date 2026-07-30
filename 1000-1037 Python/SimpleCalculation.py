#Atividade 1010
#Problem 1010

Cod1, Qnt1, Val1 = input().split()
Cod2, Qnt2, Val2 = input().split()

Qnt1 = int(Qnt1)
Val1 = float(Val1)
Qnt2 = int(Qnt2)
Val2 = float(Val2)

Total = Qnt1 * Val1 + Qnt2 * Val2
print(f"VALOR A PAGAR: R$ {Total:.2f}")