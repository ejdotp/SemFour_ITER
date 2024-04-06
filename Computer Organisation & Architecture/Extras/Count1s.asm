;E. Jagadeeswar Patro
;2241016309

mov ax, 0000h
mov ds, ax  

mov SI, 2000h
mov al, [SI]
mov cl, 08h
mov ch, 08h 

loop1: shr al,01
       jc  loop2
       dec ch
loop2: dec cl
       jnz loop1
       inc SI
       mov [SI],ch
hlt              
