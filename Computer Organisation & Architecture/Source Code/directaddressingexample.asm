;direct addressing method:
mov ax, 0000h
mov ds, ax
mov ax, [2000h]
mov bx, [2002h]
add ax, bx
mov [2004h], ax
hlt