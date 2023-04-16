 Algorithm Knapsack(C,N):
//V[1:N] and W[1;N] contain the values.
// weights respectively of N objects ordered V[i]/W[i] > V[i+1]/W[i+1]
//C is the capacity of package.
//x[1:N] is solution vector
 {
     for i:=1 to N do x[i]:=0.0
     U:=C;
     for i:=1 to N do
   {
       if (W[i]>U) then break;
          x[i]:=1.0; U:=U-W[i];
   }
   if (i<=N) then x[i]:=U/W[i];
   }
DESCRIPTION:
The fractional knapsack problem is a classic optimization problem in which we are given a knapsack with a maximum weight capacity, and a set of items each with a weight and a value. The goal is to find the most valuable combination of items to place in the knapsack while respecting the weight limit.
The greedy method is commonly used to solve the fractional knapsack problem. In this approach, we sort the items by their value-to-weight ratio (i.e., the value divided by the weight), in descending order. Then, we iteratively add items to the knapsack starting with the item that has the highest value-to-weight ratio, until the knapsack is full.
At each iteration, we calculate the fraction of the current item that can fit into the knapsack, based on the remaining weight capacity. We add this fraction to the total value of items in the knapsack, and update the weight capacity accordingly.
This process continues until the knapsack is completely full, or until all items have been added to the knapsack. The final result is the total value of the items in the knapsack.
The greedy method works well for the fractional knapsack problem because it always selects the item with the highest value-to-weight ratio at each step, which ensures that we are maximizing the value of the knapsack as quickly as possible.
