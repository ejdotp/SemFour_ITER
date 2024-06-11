;E. Jagadeeswar Patro
;2241016309 
         
;MOVE BLOCK OF DATA FROM 1 LOCATION TO ANOTHER         
         
mov ax, 0000h
mov ds, ax   

mov SI, 2000h ; SI = 2000H
mov DI, 2010h ; DI
mov cl, 05

loop: mov bx, [SI]
      mov [DI], bx
      inc SI
      inc SI
      inc DI
      inc DI
      dec cl
      jnz loop
hlt      
