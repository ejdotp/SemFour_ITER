; E. Jagadeeswar Patro
; 2241016309

mov ax, 0000h 
mov ds,ax; ds=0000h
mov bx, [2000h]
mov cx, [2002h]
mov dx, 0000h

loop1:add ax,bx
      jnc loop2
      inc dx
loop2:dec cx
      jnz loop1
      mov [2004h],ax
      mov [2006h],dx
hlt      