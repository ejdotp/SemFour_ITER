; E. Jagadeeswar Patro
; 2241016309
mov ax, 0000h 
mov ds, ax; ds=0000h  

mov SI, 2000h
mov al, [SI]     
mov cl, 08
mov ch, 0000h

loop1: shr al, 01
       jc loop2
       inc ch
loop2: dec cl
       jnz loop1
hlt                