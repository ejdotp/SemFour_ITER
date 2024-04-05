;E. Jagadeeswar Patro
;2241016309
;Find gray code of 8bit binary
mov ax, 0000h
mov ds, ax ; DS = 00H
mov al, 12h
mov bl, al
shr al, 01h
xor al, bl
mov [2000h], al ; Gray code
hlt
