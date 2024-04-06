;E. Jagadeeswar Patro
;2241016309
;Arrange the elements(8-bit number) of a given array of size N in ascending/descending  

.data
    count db 04h                ; count = array size, offset value=[0000h], effective address=ds:0000
    list db 09h, 10h, 05h, 03h  ; array elements, offset values = [0001h] to [0004h] 
    
.code
MAIN PROC
    mov ax, data        ; store data to ax
    mov ds, ax          ; store value of ax in ds
    mov cl, count       ; cl = 04h
    dec cl

BACK:  mov bl, cl
       lea si, list
          
AGAIN: mov al, [SI]     ; move 1st value of array into al
       cmp al, [si+1]   ; Compare 1st and 2nd element of array and update in al
       jc GO            ; jump if not carry, can also use jnl but dont
       xchg al, [si+1]  ; if less, move value of si into al
       xchg al, [si]
    
GO:    inc si
       loop AGAIN
       dec cl           ; decrement count
       jnz BACK         ; jump is cl not equal to 0
       hlt
       
END MAIN