.data
    pattern db 'ABC$'
    string db 'STRING FOR SEARCHING PATTERN$', 0
    found_msg db 'Found$'
    not_found_msg db 'Not Found$'

.code
main:
    mov ax, @data
    mov ds, ax

    lea si, string
    lea di, pattern

    mov ah, 0  ; Initialize flag (0: not found, 1: found)

search_loop:
    mov cx, 7  ; Set loop counter for pattern length

compare_loop:
    mov al, [si]  ; Load byte from address in si
    mov bl, [di]  ; Load byte from address in di
    cmp al, bl
    jne next_substring  ; If characters don't match, move to next substring

    inc si  ; Move to next character in string
    inc di  ; Move to next character in pattern
    dec cx  ; Decrease loop counter
    jcxz pattern_found  ; If loop counter is zero, pattern is found

    jmp compare_loop  ; Otherwise, continue comparison

next_substring:
    inc si  ; Move to next character in string
    mov bx, si  ; Copy string pointer to bx
    lea di, pattern  ; Reset pattern pointer
    cmp byte ptr [si], 0  ; Check for end of string
    jne search_loop  ; If not, continue searching

not_found:
    mov dx, offset not_found_msg  ; Set message to "Not Found"
    jmp print_message

pattern_found:
    mov dx, offset found_msg  ; Set message to "Found"
    mov ah, 1  ; Set flag to indicate pattern found
    jmp print_message

print_message:
    mov ah, 9h  ; Print string function
    int 21h  ; Display message

    mov ah, 4Ch  ; Exit program
    int 21h  ; Exit

end main
main
