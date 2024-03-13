;E. Jagadeeswar Patro
;2241016309
mov ax, 0000h
mov ds, ax ; DS = 0000H
mov ax, 3457h
mov cx, ax
mov bx, 0015h
add ax, bx
mov [2000h], ax
;
mov ax, cx
sub ax, bx
mov [2010h], ax
;
mov ax, cx
mul bx; ax * bx
mov [2020h], ax ;lower 16bit
mov [2022h], dx ;upper 16bit
;
mov dx, 0000h
mov ax, cx
div bx; ax/bx
mov [2030h], ax ; quotient
mov [2032h], dx ; reminder
hlt