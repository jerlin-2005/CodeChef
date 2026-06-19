import random
def floodfill(row,col,i,j,ele,val,a):
    if i < 0 or i >= row or j < 0 or j >= col:
        return a
    if a[i][j] != val or a[i][j] == ele:
        return a
   
    a[i][j]=ele
   
    down = right = up = left = None
   
    if(i!=row-1):
        down=a[i+1][j]
    if(j!=col-1):
        right=a[i][j+1]
    if(i!=0):
        up=a[i-1][j]
    if(j!=0):
        left=a[i][j-1]
       
    if(down is not None and val==down):
        floodfill(row,col,i+1,j,ele,val,a)
    if(left is not None and val==left):
        floodfill(row,col,i,j-1,ele,val,a)
    if(up is not None and val==up):
        floodfill(row,col,i-1,j,ele,val,a)
    if(right is not None and val==right):
        floodfill(row,col,i,j+1,ele,val,a)
    return a
row=int(input("enter the num of rows"))
col=int(input("enter the num of col"))
ele=int(input("enter number to replace"))
tr=int(input("row"))
tc=int(input("col"))
a = [[0 for _ in range(col)] for _ in range(row)]

a = [list(map(int, input(f"Row {i+1}: ").split())) for i in range(row)]
val=a[tr][tc]
print("replace value , index",val,tc,tr)
a=floodfill(row,col,tr,tc,ele,val,a)
print("\nUpdated Matrix:")
for i in range(row):
    for j in range(col):
        print(a[i][j], end=" ")
    print()
