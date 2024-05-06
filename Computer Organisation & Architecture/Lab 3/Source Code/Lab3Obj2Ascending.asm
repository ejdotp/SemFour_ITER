;E. Jagadeeswar Patro
;2241016309
;Arrange the elements(8-bit number) of a given array of size N in ascending

.data
    count db 06                            ; count = array size, offset value=[0000h], effective address=ds:0000
    value db 09H, 0FH, 14H, 45H, 24H, 3FH  ; array elements, offset values = [0001h] to [0004h] 
    
.code
MAIN PROC
    mov ax, data        ; store data to ax
    mov ds, ax          ; store value of ax in ds
    mov ch, count       ; cl = 04h
    dec ch              ; decrementing cl by one (cl =  03h)

UP2:   mov cl, ch       ; store the current index value in bl
       lea si, value    ; load effective address of 'value' into si
          
UP1:   mov al, [SI]     ; move 1st value of array into al
       cmp al, [si+1]   ; Compare 1st and 2nd element of array and update in al
       jc DOWN          ; jump if carry
       mov dl, [si+1]   ; move 2nd value of array into dl
       xchg [si+1], dl  ; exchange 1st and 2nd element of array
       mov [si+1], dl   ; store dl in 2nd position of array
    
DOWN:  inc si           ; increment index for next iteration 
       dec cl           ; decrease counter value
       jnz UP1          ; loop until counter becomes zero
       dec ch           ; decrement count
       jnz UP2          ; jump is cl not equal to 0
       
END MAIN