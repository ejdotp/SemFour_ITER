;E. Jagadeeswar Patro
;2241016309
; Find sum and avg of 16bit data

mov ax, 0000h
mov ds, ax

mov SI, 2000h
mov cl, [SI]   ;cl = count
mov ch, 0000h  ;initialising for storing carry
mov bx, cx
mov ax, 0000h  ;not necessary 

loop1: inc SI
       inc SI
       add ax, [SI]
       jnc loop2      ; jump if not carry  
       inc ch
        
loop2: dec cl
       jnz loop1

       inc SI
       inc SI
       mov [SI], ax   ; sum stored   
       
       inc SI
       inc SI
       mov [SI], ch   ;carry stored
       mov dl, ch
       
       div bx
       inc SI
       inc SI
       mov [si], ax  ; Quotient/Average stored
hlt               