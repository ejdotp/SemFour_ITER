;E. Jagadeeswar Patro
;2241016309 

mov ax,0000h
mov ds,ax
mov SI,2000h
mov DI,2010h
mov cl,05

loop: mov bx,[SI]
      mov [DI],bx
      inc SI
      inc SI
      inc DI
      inc DI
      dec cl
      jnz loop
hlt      
