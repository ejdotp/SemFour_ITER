;E. Jagadeeswar Patro
;2241016309
mov ax, 0000h
mov ds, ax ; DWS = 0000H
mov ax, 1000h
mov bx, 2000h
add ax, bx
mov [4000h], ax     

; ax -> ah high bit 8, al  low bit 8