;E. Jagadeeswar Patro
;2241016309
mov ax, 0000h
mov ds, ax ; DS = 0000H
mov ax, 1000h
mov bx, 2000h
add ax, bx
mov [4000h], ax 
hlt