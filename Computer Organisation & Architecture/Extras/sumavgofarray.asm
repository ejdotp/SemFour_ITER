; sum and average of an array

.data
    count db 04h               ; number of elements in the array
    arr1 db 09h, 10h, 05h, 03h ; array element values
    sum db 00h                 ; variable to store the sum
    avg db 00h                 ; variable to store the average
    
.code 
MAIN PROC  
    mov ax, data                ; initialize DS
    mov ds, ax 
    mov ch, count               ; load the value of count into CH register
    xor bx, bx                  ;clear bx      
    mov cl, ch                  ; copy count to CL for use as counter
    lea si, arr1                ; point SI to the first element of ARR1
    
sumation: mov al, [si]          ; move the current element pointed by SI into AL
          add bl, al            ; add the content of AL to BL
          inc si                ; increment the pointer SI
          dec cl                ; decrement the counter
          jnz sumation          ; if CX is not zero jump back to 'sumation'
    
    lea di, sum                 ; point DI to the memory location of SUM
    mov [di], bl                ; store the result of addition in SUM
    mov ax, 0000h               ; clear AX before division
    mov al, bl                  ; put the sum value into AL
    mov bl, count               ; load the value of COUNT into BL
    div bx                      ; divide AL by BL and store the quotient in al
    lea di, avg                 ; point DI to the memory location of AVG
    mov [di], al                ; store the result of division in AVG

END MAIN 