;E. Jagadeeswar Patro
;2241016309
mov ax,0000h
mov ds,ax
mov SI,2000h
mov cl,[SI]
mov ch,00h
mov bx,cx
mov ax,0000h ;not necessary
loop1: inc SI
       inc SI
       add ax,[SI]
       jnc loop2
       inc ch   
loop2: dec cl
       jnz loop1
       inc SI
       inc SI
       mov [SI],ax
       inc SI
       inc SI
       mov [SI],ch
       mov dl,ch
       div bx
       inc SI
       inc SI
       mov [SI],ax
       inc SI
       inc SI
       mov [SI],dx
hlt               